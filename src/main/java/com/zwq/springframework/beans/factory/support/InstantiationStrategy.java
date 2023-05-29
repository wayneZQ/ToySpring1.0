package com.zwq.springframework.beans.factory.support;

import com.zwq.springframework.beans.BeansException;
import com.zwq.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @ClassName InstantiationStrategy
 * @Description
 * @Author zwq
 * @Date 2023/5/24 16:31
 **/
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
