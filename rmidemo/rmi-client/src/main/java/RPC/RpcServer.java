package RPC;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zwz on 2018/7/11.
 * 用于发布一个远程服务
 */
public class RpcServer {

    //创建一个线程池
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    public void publisher(final Object service,int port){
        ServerSocket serverSocket = null;
        try{
            serverSocket = new ServerSocket(port);
            while (true){
                //循环监听
                Socket socket = serverSocket.accept();
                ex.execute(new ProcessorHander(socket,service));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            if(serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
