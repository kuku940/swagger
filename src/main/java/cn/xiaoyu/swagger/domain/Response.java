package cn.xiaoyu.swagger.domain;

public interface Response {
    String SUCCESS = "ok";
    String FAIL = "fail";

    String getSucc();

    void setSucc(String succ);

    String getMsg();

    void setMsg(String msg);

    Object getResult();

    void setResult(Object result);
}