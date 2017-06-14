package com.xc.demo;

/**
 * Created by xuec on 2017/6/14.
 */
public class DemoServiceImpl implements DemoService{
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
