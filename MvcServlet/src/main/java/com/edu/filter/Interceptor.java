package com.edu.filter;

public interface Interceptor {
    Object execute(HandlerFilterChain chain);
}
