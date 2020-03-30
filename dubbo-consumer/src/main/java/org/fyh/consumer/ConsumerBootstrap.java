package org.fyh.consumer;

import org.fyh.api.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerBootstrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        applicationContext.start();
        HelloService service = (HelloService) applicationContext.getBean("helloService");
        String hello = service.sayHello("tom");
        System.out.println(hello);
        System.in.read();
    }
}
