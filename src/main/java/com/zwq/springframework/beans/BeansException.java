package com.zwq.springframework.beans;

/**
 * @ClassName BeansException
 * @Description
 * @Author zwq
 * @Date 2023/5/24 9:20
 **/
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
