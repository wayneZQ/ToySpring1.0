package com.zwq.springframework.beans.factory;

/**
 * @ClassName BeanClassLoaderAware
 * @Description 让bean可以获取加载自身的class loader
 * @Author zwq
 * @Date 2023/5/24 9:23
 **/
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);

}
