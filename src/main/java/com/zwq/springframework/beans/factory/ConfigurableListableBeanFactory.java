package com.zwq.springframework.beans.factory;

import com.zwq.springframework.beans.BeansException;
import com.zwq.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.zwq.springframework.beans.factory.config.BeanDefinition;
import com.zwq.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @ClassName ConfigurableListableBeanFactory
 * @Description
 * @Author zwq
 * @Date 2023/5/24 14:23
 **/
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
