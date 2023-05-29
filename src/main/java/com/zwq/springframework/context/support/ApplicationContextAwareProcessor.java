package com.zwq.springframework.context.support;

import com.zwq.springframework.beans.BeansException;
import com.zwq.springframework.beans.factory.config.BeanPostProcessor;
import com.zwq.springframework.context.ApplicationContext;
import com.zwq.springframework.context.ApplicationContextAware;

/**
 * @ClassName ApplicationContextAwareProcessor
 * @Description
 * @Author zwq
 * @Date 2023/5/29 11:52
 **/
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /**
     * 让bean在执行初始化方法之前可以获取到对应的ApplicationContext
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
