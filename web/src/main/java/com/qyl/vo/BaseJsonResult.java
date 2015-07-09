package com.qyl.vo;


/**
 * Created by qinyuanlong on 15/7/7.
 */
public class BaseJsonResult {
    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private int resultId;
    private String message;
    private Object data;
}
