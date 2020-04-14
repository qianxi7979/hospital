package com.utils;

public class RequesBean {
    private Integer status;

    private String msg;

    private Object data;

    public static RequesBean ok(String msg){
        RequesBean requesBean = new RequesBean();
        requesBean.setMsg(msg);
        requesBean.setStatus(200);
        return requesBean;
    }
    public static RequesBean ok(String msg,Object data){
        RequesBean requesBean = new RequesBean();
        requesBean.setMsg(msg);
        requesBean.setData(data);
        requesBean.setStatus(200);
        return requesBean;
    }
    public static RequesBean ok(Object data){
        RequesBean requesBean = new RequesBean();
        requesBean.setData(data);
        requesBean.setStatus(200);
        return requesBean;
    }

    public static RequesBean error(String msg){
        RequesBean requesBean = new RequesBean();
        requesBean.setMsg(msg);
        requesBean.setStatus(500);
        return requesBean;
    }

    public static RequesBean error(String msg,Object data){
        RequesBean requesBean = new RequesBean();
        requesBean.setMsg(msg);
        requesBean.setData(data);
        requesBean.setStatus(500);
        return requesBean;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
