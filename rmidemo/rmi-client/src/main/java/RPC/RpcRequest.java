package RPC;

import java.io.Serializable;

/**
 * @author zwz
 * Created by zwz on 2018/7/11.
 */
public class RpcRequest implements Serializable{


    private static final long serialVersionUID = 1544922956842705091L;
    private String className;
    private String methodName;
    private Object[] parameters;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }
}
