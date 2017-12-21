package com.edu;

import java.lang.reflect.Method;

/**
 * Created by hzq on 2017/12/15.
 */

/*
* 控制器的Class对象 ，Definition定义，Hanlder处理
* */
public class HandlerDefinition {
    private Class<?> clz;
    private Method method;//

    public Class<?> getClz() {
        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

}
