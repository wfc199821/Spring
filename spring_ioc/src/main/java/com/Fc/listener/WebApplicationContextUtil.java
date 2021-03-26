package com.Fc.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @Author 吴富潮
 * @Date 2021/3/26 13:18
 * @Version 1.0
 */
public class WebApplicationContextUtil {
    public static ApplicationContext getApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("app");
    }
}
