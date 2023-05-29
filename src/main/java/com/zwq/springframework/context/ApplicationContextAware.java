package com.zwq.springframework.context;

import com.zwq.springframework.beans.BeansException;
import com.zwq.springframework.beans.factory.Aware;

/**
 * @ClassName ApplicationContextAware
 * @Description
 * @Author zwq
 * @Date 2023/5/24 16:10
 **/
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
