package com.family.tree.common;

import lombok.Data;

//返回统一类

@Data
public class Result<T> {

//    错误码
    private Integer code;

//    提示信息
    private String mag;

//    具体信息
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMag() {
        return mag;
    }

//    set
    public Result setMag(String mag) {
        this.mag = mag;
        return this;
    }

    public T getData() {
        return data;
    }

//    set
    public Result setData(T data) {
        this.data = data;
        return this;
    }

//    构造方法
    public Result(Integer code, String mag) {
        this.code = code;
        this.mag = mag;
    }

//    成功
    public static Result getSuccess() {
        return new Result(200, "成功");
    }

//    失败
    public static Result getFail() {
        return new Result(400, "失败");
    }

}
