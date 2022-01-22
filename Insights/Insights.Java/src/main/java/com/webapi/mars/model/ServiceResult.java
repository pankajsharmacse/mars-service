package com.webapi.mars.model;

public class ServiceResult<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ServiceResult() {
        super();
    }

    public ServiceResult(T data) {
        super();
        this.data = data;
    }
}
