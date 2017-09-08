package com.putaoteng.task8.controller;

import com.putaoteng.task8.service.StudentDaoService;
import com.putaoteng.task8.service.UserDaoService;
import com.putaoteng.task8.service.VerificationDaoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.remoting.rmi.RmiServiceExporter;

public class StartService {
    public static void main(String[] args){
       System.setProperty("java.rmi.server.hostname","120.77.169.243");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        System.out.println("Server 启动...");
    }
}
