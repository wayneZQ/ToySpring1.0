package com.zwq.springframework.beans.factory.config;

import com.zwq.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @ClassName ConfigurableBeanFactory
 * @Description
 * @Author zwq
 * @Date 2023/5/24 15:12
 **/
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory,  SingletonBeanRegistry{

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();


}
