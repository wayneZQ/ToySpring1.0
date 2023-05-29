package com.zwq.springframework.context;

import com.zwq.springframework.beans.BeansException;

/**
 * @ClassName ConfigurableApplicationContext
 * @Description
 * @Author zwq
 * @Date 2023/5/24 16:16
 **/
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
