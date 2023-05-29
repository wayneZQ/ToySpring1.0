package com.zwq.springframework.beans.factory;

/**
 * @ClassName DisposableBean
 * @Description
 * @Author zwq
 * @Date 2023/5/24 14:25
 **/
public interface DisposableBean {

    void destroy() throws Exception;

}
