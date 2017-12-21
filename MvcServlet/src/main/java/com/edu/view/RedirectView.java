package com.edu.view;

import com.edu.ViewResult;

import java.io.IOException;

/**
 * 重定向
 */
public class RedirectView  extends ViewResult {
    private String urlPathName;
    public RedirectView(String urlPathName){
        this.urlPathName=urlPathName;
    }
    @Override
    public void execute() throws IOException {
        if(urlPathName!=null) {
            getResponse().sendRedirect("/"+urlPathName);
        }
    }
}
