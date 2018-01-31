package com.skywalker.provider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author longchao
 * @Date 2018/1/15.
 */
public class Launcher {
    private static Log logger = LogFactory.getLog(Launcher.class);

    /**
     * @param args
     * 本地启动所需的主方法
     */
    public static void main(String[] args) {
//        getLocalip();
        logger.info("---****Provider 启动****-----");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:springconfig/spring-context.xml");
        context.start();
        System.out.println("Provider Server Started!");
        try{
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
