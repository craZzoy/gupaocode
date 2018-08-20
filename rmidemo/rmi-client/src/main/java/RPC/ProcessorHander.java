package RPC;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * Created by zwz on 2018/7/11.
 */
public class ProcessorHander implements Runnable{
    private Socket socket;
    private Object service;

    public ProcessorHander(Socket socket, Object service) {
        this.socket = socket;
        this.service = service;
    }

    @Override
    public void run() {
        //处理请求
        ObjectInputStream objectInputStream=null;

        ObjectOutputStream objectOutputStream = null;
        try {
            //获取客户端的输入流
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            //反系列化远程传输对象RpcRequest
            RpcRequest rpcRequest = (RpcRequest)objectInputStream.readObject();
            Object result = invoke(rpcRequest);

            //将结果返回给客户端
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(result);
            objectOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Object invoke(RpcRequest rpcRequest) throws Exception{
        //Class<?> interfaces[] = service.getClass().getInterfaces();

        //String className1 = service.getClass().getDeclaringClass().getName();
        Object[] objects = rpcRequest.getParameters();
        Class<?>[] types = new Class[objects.length];
        for(int i=0;i<types.length;i++){
            types[i] = objects[i].getClass();
        }
        Method method = service.getClass().getMethod(rpcRequest.getMethodName(),types);
        return method.invoke(service,objects);
    }
}
