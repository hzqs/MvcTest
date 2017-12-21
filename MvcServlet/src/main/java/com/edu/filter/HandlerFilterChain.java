package com.edu.filter;

import com.edu.ActionMapper;
import com.edu.HandlerInvoker;
import java.util.Iterator;


public class HandlerFilterChain {
    public ActionMapper mapper;
    public Iterator<Interceptor> it;
    public HandlerFilterChain(ActionMapper mapper){
        this.mapper=mapper;
        if(mapper.getFilterChainList()!=null){
            this.it = mapper.getFilterChainList().iterator();
        }
    }
    public Object handle(){
        Object viewObject = null;
        if(it.hasNext()){
            viewObject =it.next().execute(this);
        }else{
            System.out.println("filter success!");
            viewObject = new HandlerInvoker().handlerInvoker(mapper);
        }
        return viewObject;
    }
}
