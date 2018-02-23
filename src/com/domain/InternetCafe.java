package com.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InternetCafe {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/resources/springAop.xml");
        Customer customer = (Customer) context.getBean("customerProxy");
        customer.browse();




    }



}
