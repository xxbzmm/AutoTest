package com.course.testng;

import org.testng.annotations.*;

import java.sql.SQLOutput;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("test1这是测试用例1");

    }
    @Test
    public void testCase2(){
        System.out.println("test2这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforMethod是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass是在类之前运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass是在类之后运行的");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite是类运行之前运行的测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite是类运行之后运行的测试套件");
    }
}
