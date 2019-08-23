package com.oasis.lee.commons;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class ResponseResult<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public ResponseResult() {
    }

    public ResponseResult(int code) {
        this.code = code;
    }

    public ResponseResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    //注解可以让isSuccess不在json序列化结果中，不出现在返回的前端data中
    @JsonIgnore
    public boolean isSuccess(){
        return this.code==ResponseCode.SUCCESS.getCode();
    }
    public  int getCode(){
        return code;
    }
    public  T getData(){
        return data;
    }
    public  String getMsg(){
        return msg;
    }

   public static <T> ResponseResult<T> createBySuccess(){
        return new ResponseResult<T>(ResponseCode.SUCCESS.getCode());
   }
    public static <T> ResponseResult<T> createBySuccess(int code,String msg){
        return new ResponseResult<T>(ResponseCode.SUCCESS.getCode());
    }
   public static <T> ResponseResult<T> createBySuccessMsg(String  msg){
        return new ResponseResult<T>(ResponseCode.SUCCESS.getCode(),msg);
   }
   public static<T> ResponseResult<T> createBySuccess(String msg,T data){
        return  new ResponseResult<T> (ResponseCode.SUCCESS.getCode(),msg,data);
   }
    public static <T> ResponseResult<T> createByError(){
        return new ResponseResult<T>(ResponseCode.ERROR.getCode());
    }
    public static <T> ResponseResult<T> createByError(int code,String msg){
        return new ResponseResult<T>(ResponseCode.ERROR.getCode());
    }
    public static <T> ResponseResult<T> createByErrorMsg(String  msg){
        return new ResponseResult<T>(ResponseCode.ERROR.getCode(),msg);
    }
    public static<T> ResponseResult<T> createByError(String msg,T data){
        return  new ResponseResult<T> (ResponseCode.ERROR.getCode(),msg,data);
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
