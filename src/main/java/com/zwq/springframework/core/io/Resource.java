package com.zwq.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName Resource
 * @Description
 * @Author zwq
 * @Date 2023/5/24 15:38
 **/
public interface Resource {
    InputStream getInputStream() throws IOException;
}
