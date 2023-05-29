package com.zwq.springframework.beans.factory.support;

import com.zwq.springframework.beans.BeansException;
import com.zwq.springframework.beans.factory.config.BeanDefinition;
import com.zwq.springframework.beans.factory.config.BeanPostProcessor;
import com.zwq.springframework.beans.factory.config.ConfigurableBeanFactory;
import com.zwq.springframework.util.ClassUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AbstractBeanFactory
 * @Description
 * @Author zwq
 * @Date 2023/5/24 15:18
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ConfigurableBeanFactory {

    /**
     * 版本新增，可以获取bean所对应的类加载器
     */
    private ClassLoader beanClassLoader = ClassUtils.getDefaultClassLoader();

    private final List<BeanPostProcessor> beanPostProcessors = new ArrayList<>();

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);


    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor){
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }

    /**
     * Return the list of BeanPostProcessors that will get applied
     * to beans created with this factory.
     */
    public List<BeanPostProcessor> getBeanPostProcessors() {
        return this.beanPostProcessors;
    }

    /**
     * 版本新增
     */
    public ClassLoader getBeanClassLoader(){
        return this.beanClassLoader;
    }


}
