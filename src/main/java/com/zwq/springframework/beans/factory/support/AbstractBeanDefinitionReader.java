package com.zwq.springframework.beans.factory.support;

import com.zwq.springframework.core.io.DefaultResourceLoader;
import com.zwq.springframework.core.io.ResourceLoader;

/**
 * @ClassName AbstractBeanDefinitionReader
 * @Description
 * @Author zwq
 * @Date 2023/5/24 15:27
 **/
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }


}
