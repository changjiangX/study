package com.dcits.service.impl;

import com.dcits.pojo.ProductTwo;

/**
 * ConcreteBuilder.java
 * 具体建造者(服务员)
 */
public class ConcreteBuilderTwo extends BuilderTwo {

    private ProductTwo product;

    public ConcreteBuilderTwo() {
        product = new ProductTwo();
    }

    @Override
    ProductTwo build() {
        return product;
    }

    @Override
     BuilderTwo bulidA(String mes) {
        //炸鸡家汉堡
        product.setBuildA(mes);
        return this;
    }

    @Override
     BuilderTwo bulidB(String mes) {
        product.setBuildB(mes);
        return this;
    }

    @Override
     BuilderTwo bulidC(String mes) {
        product.setBuildC(mes);
        return this;
    }

    @Override
     BuilderTwo bulidD(String mes) {
        product.setBuildD(mes);
        return this;
    }
}
