package com.zwq.springframework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import com.zwq.springframework.beans.BeansException;
import com.zwq.springframework.beans.factory.DisposableBean;
import com.zwq.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Method;

/**
 * @ClassName DisposableBeanAdapter
 * @Description
 * @Author zwq
 * @Date 2023/5/24 16:53
 **/
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;
    private final String beanName;
    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }

    @Override
    public void destroy() throws Exception {
        // 1. 如果实现接口 DisposableBean
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }

        // 2. 如果没有实现接口但是注解配置了 destroy-method {判断是为了避免二次执行销毁}
        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (null == destroyMethod) {
                throw new BeansException("Couldn't find a destroy method named '" + destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            destroyMethod.invoke(bean);
        }
    }
}
