package com.zwq.springframework.context.support;

import com.zwq.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.zwq.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @ClassName AbstractRefreshableApplicationContext
 * @Description
 * @Author zwq
 * @Date 2023/5/29 13:47
 **/
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    @Override
    public ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
