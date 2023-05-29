package com.zwq.springframework.beans;

/**
 * @ClassName PropertyValue
 * @Description
 * @Author zwq
 * @Date 2023/5/24 9:21
 **/
public class PropertyValue {

    /** 属性名称 */
    private final String name;

    /** 属性值 */
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }


}
