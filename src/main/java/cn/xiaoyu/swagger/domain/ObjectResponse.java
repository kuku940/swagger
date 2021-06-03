package cn.xiaoyu.swagger.domain;

public class ObjectResponse<T> implements Response {
    /**
     * 业务信息
     */
    private T result;

    /**
     * 相应的结果
     */
    private String succ;

    /**
     * 提示信息，错误信息
     */
    private String msg;

    public ObjectResponse() {
    }

    public ObjectResponse(T result, String succ, String msg) {
        this.result = result;
        this.succ = succ;
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }


    public String getSucc() {
        return succ;
    }

    public void setSucc(String succ) {
        this.succ = succ;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setResult(Object result) {
        this.result = (T) result;
    }
}
