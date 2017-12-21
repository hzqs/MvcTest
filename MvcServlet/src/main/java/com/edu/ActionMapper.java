package com.edu;

import com.edu.filter.Interceptor;

import java.util.List;

/**
 * Created by hzq on 2017/12/21.
 * 降低HandlerInvoker里面方法的耦合度
 */
public class ActionMapper {
    private HandlerDefinition definition;

    private Object target;
    private Object[] params;
    private List<Interceptor> filterChainList;

    public HandlerDefinition getDefinition() {
        return definition;
    }

    public void setDefinition(HandlerDefinition definition) {
        this.definition = definition;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public List<Interceptor> getFilterChainList() {
        return filterChainList;
    }

    public void setFilterChainList(List<Interceptor> filterChainList) {
        this.filterChainList = filterChainList;
    }
}
