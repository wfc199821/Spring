package com.Fc.web;

import com.Fc.listener.WebApplicationContextUtil;
import com.Fc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author 吴富潮
 * @Date 2021/3/25 20:50
 * @Version 1.0
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取servletContext对象：方法一req.getServletContext()
//        ServletContext servletContext = req.getServletContext();
//        方法二this.getServletContext()
        ServletContext servletContext = this.getServletContext();
//        通过servletContext对象获取ApplicationContext对象
//        ApplicationContext app = (ApplicationContext) servletContext.getAttribute("app");
//        解耦
//        ApplicationContext app = WebApplicationContextUtil.getApplicationContext(servletContext);

//        使用spring-web中的WebApplicationContextUtils获取ApplicationContext接口对象
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService userService = app.getBean(UserService.class);
        userService.service();
    }
}
