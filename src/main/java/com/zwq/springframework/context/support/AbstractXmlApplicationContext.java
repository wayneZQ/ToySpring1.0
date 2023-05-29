package com.zwq.springframework.context.support;

import com.zwq.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zwq.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @ClassName AbstractXmlApplicationContext
 * @Description
 * @Author zwq
 * @Date 2023/5/29 14:04
 **/
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
