package com.edu;


import com.edu.paramsHandler.HandlerChain;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Parameter;

public abstract class SetParamsHandler {
    protected HttpServletRequest getRequest() {
        return ActionContext.getContext().getRequest();

    }
    public abstract Object handle(Parameter parameter, HandlerChain chain);
}
