package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMathod {
    //组测试中的方法分组
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是server端测试方法1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是server端测试方法2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是client端测试方法3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是client端测试方法4");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是server端测试方法运行之前的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是server端测试方法运行之后的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是client端测试方法运行之前的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是client端测试方法运行之后的方法");
    }
}
