package com.zwq.springframework.beans.factory.config;

import com.zwq.springframework.beans.BeansException;
import com.zwq.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @ClassName BeanFactoryPostProcessor
 * @Description
 * @Author zwq
 * @Date 2023/5/24 14:44
 **/
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
