package com.zwq.springframework.beans.factory;

import com.zwq.springframework.beans.BeansException;

/**
 * @ClassName BeanFactoryAware
 * @Description 让bean可以获取到所属的beanFactory
 * @Author zwq
 * @Date 2023/5/24 9:23
 **/
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;


}
