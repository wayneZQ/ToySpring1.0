package com.zwq.springframework.beans.factory.config;

/**
 * @ClassName BeanReference
 * @Description
 * @Author zwq
 * @Date 2023/5/24 14:58
 **/
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
