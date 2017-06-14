package com.xc;

import com.xc.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xuec on 2017/6/14.
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();

        // 获取远程服务代理
        DemoService demoService = (DemoService) context.getBean("demoService");
        //执行远程方法
        String hello = demoService.sayHello("world");

        System.out.println(hello);
    }
}
