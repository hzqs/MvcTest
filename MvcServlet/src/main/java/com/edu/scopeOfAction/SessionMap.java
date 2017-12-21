package com.edu.scopeOfAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * Created by hzq on 2017/12/21.
 */
public class SessionMap extends HashMap<String,Object> {

    private HttpSession session;

    public SessionMap(HttpServletRequest request){
        this.session=request.getSession();
    }

    @Override
    public Object get(Object key) {
        return session.getAttribute(key.toString());
    }

    @Override
    public Object put(String key, Object value) {
        session.setAttribute(key, value);
        return value;
    }

    @Override
    public Object remove(Object key) {
        Object value = session.getAttribute(key.toString());
        session.removeAttribute(key.toString());
        return value;
    }



}
