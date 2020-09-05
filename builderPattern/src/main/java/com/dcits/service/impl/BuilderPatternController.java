package com.dcits.service.impl;

import com.dcits.pojo.Product;

public class BuilderPatternController {

    public static void main(String[] args) {
        //1、创建抽象建造者定义造房步骤
        Director director = new Director();
        //2、创建工人具体实现造房步骤
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        //3、创建承包商指挥工人施工
        Product create = director.create(concreteBuilder);
        //4、验收，检查是否建造完成
        String string = create.toString();

        System.out.println(string);
    }
}
