package com.zwq.springframework.core.io;

/**
 * @ClassName ResourceLoader
 * @Description
 * @Author zwq
 * @Date 2023/5/24 15:39
 **/
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
