package com.zwq.springframework.beans.factory.support;

import com.zwq.springframework.beans.BeansException;
import com.zwq.springframework.core.io.Resource;
import com.zwq.springframework.core.io.ResourceLoader;

/**
 * @ClassName BeanDefinitionReader
 * @Description
 * @Author zwq
 * @Date 2023/5/24 15:28
 **/
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
