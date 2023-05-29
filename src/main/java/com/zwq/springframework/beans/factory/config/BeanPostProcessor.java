package com.zwq.springframework.beans.factory.config;

import com.zwq.springframework.beans.BeansException;

/**
 * @ClassName BeanPostProcessor
 * @Description 用于修改新实例化 Bean 对象的扩展点
 * @Author zwq
 * @Date 2023/5/24 14:51
 **/
public interface BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
