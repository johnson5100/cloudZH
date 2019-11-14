package com.spring.userservice.utils;

import lombok.Data;
import lombok.ToString;
import org.apache.commons.lang.StringUtils;

/**
 * @ClassName ResultData
 * @Description TODO
 * @Author Administrator
 * @Date 2019/11/14 11:19
 **/
@Data
@ToString
public class ResultData<T> {

    private int code;
    private String message;
    private T data;

    public ResultData(){

    }

    private ResultData(int code, String message){
        this.code = code;
        this.message = message;
    }
    private ResultData(int code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultData success(){
        return new ResultData(MessageCode.SUCCESS.getCode(), MessageCode.SUCCESS.getMessage());
    }

    public ResultData success(T data){
        return new ResultData(MessageCode.SUCCESS.getCode(), MessageCode.SUCCESS.getMessage(), data);
    }

    public ResultData success(String message){
        return new ResultData(MessageCode.SUCCESS.getCode(), message);
    }

    public ResultData success(String message, T data){
        return new ResultData(MessageCode.SUCCESS.getCode(), message, data);
    }

    public ResultData failure(int code, String message){
        return new ResultData(code, message);
    }

    public ResultData failure(int code, String message, T data){
        return new ResultData(code, message, data);
    }

}
