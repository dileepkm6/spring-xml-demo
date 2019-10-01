package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("bean destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean is initializing");
    }

    public void customInit()
    {
        System.out.println("customInit is called");
    }
    public void customDestroy()
    {
        System.out.println("customDestroy is called");
    }
}
