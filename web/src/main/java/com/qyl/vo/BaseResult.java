package com.qyl.vo;


/**
 * Created by qinyuanlong on 15/7/7.
 */
public class BaseResult<T> {
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private int resultId = BizCode.SUCCESS;
    private String message = BizCode.SUCCESS_MESSAGE;
    private T data;
}
