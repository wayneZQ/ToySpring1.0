package com.zwq.springframework.beans.factory;

/**
 * @ClassName BeanNameAware
 * @Description Interface to be implemented by beans that want to be aware of their
 * bean name in a bean factory. Note that it is not usually recommended
 * that an object depend on its bean name, as this represents a potentially
 * brittle dependence on external configuration, as well as a possibly
 * unnecessary dependence on a Spring API.
 * @Author zwq
 * @Date 2023/5/24 9:24
 **/
public interface BeanNameAware {

    void setBeanName(String name);

}
