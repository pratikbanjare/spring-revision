package com.spring.basics.demo.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBeanApplication {
    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(SpringBeanApplication.class);
        BinarySearchImpl binarySearchImpl = run.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearchImpl2 = run.getBean(BinarySearchImpl.class);
        System.out.println(binarySearchImpl);


        System.out.println(binarySearchImpl2);



        int result = binarySearchImpl.binarySearch(new int[]{1, 2, 5, 4, 7, 8, 6}, 4);
        System.out.println("result of binary search of 4 -> " + result);
    }
}
