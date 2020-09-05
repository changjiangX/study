package com.dcits.service.impl;


import com.dcits.pojo.Product;
import com.dcits.pojo.ProductTwo;

/**
 * Builder.java
 *  建造者(制作过程)
 */
abstract class BuilderTwo {

    //汉堡
    abstract BuilderTwo bulidA(String mes);
    //饮料
    abstract BuilderTwo bulidB(String mes);
    //薯条
    abstract BuilderTwo bulidC(String mes);
    //甜品
    abstract BuilderTwo bulidD(String mes);
    //获取套餐
    abstract ProductTwo build();
}
