package com.edu.paramsHandler;

import com.edu.SetParamsHandler;

import java.lang.reflect.Parameter;
import java.util.Iterator;
import java.util.ServiceLoader;

public class HandlerChain {
    private Iterator<SetParamsHandler> iterator;
    public HandlerChain(){
        iterator = ServiceLoader.load(SetParamsHandler.class).iterator();
    }
    //责任链
    public Object execute(Parameter parameter){
        Object value = null;
        if(iterator.hasNext()){
            value = iterator.next().handle(parameter,this);
        }
        return value;
    }
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        while (chain.iterator.hasNext()){
            System.out.println(chain.iterator.next());
        }
    }

}
