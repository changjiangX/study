package com.dcits.service.impl;


import com.dcits.pojo.ProductTwo;
import com.dcits.service.impl.ConcreteBuilderTwo;

public class BuilderPatternTwoController {


    public static void main(String[] args) {

        //1、创建建造者定义麦当劳的产品
        ConcreteBuilderTwo concreteBuilderTwo = new ConcreteBuilderTwo();
        /*ProductTwo build = new ProductTwo();
        build.setBuildA("汉堡");
        build.setBuildA("");*/
        //2、创建服务员实现具体产品
        ProductTwo build = concreteBuilderTwo
        //3、服务员随意搭配套餐出售给客户
                .bulidA("牛肉煲")
                .bulidC("全家桶")
                .bulidD("冰淇淋")
                .build();

        System.out.println(build.toString());
    }
}
