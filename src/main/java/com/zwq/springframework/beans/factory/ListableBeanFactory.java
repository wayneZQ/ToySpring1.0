package com.zwq.springframework.beans.factory;

import com.zwq.springframework.beans.BeansException;

import java.util.Map;

/**
 * @ClassName ListableBeanFactory
 * @Description
 * @Author zwq
 * @Date 2023/5/24 15:31
 **/
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();


}
