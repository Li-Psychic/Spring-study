package edu.nf.ch01.factory;

import edu.nf.ch01.Users;

/**
 * @Author: 黎汉清
 * @Date: 2020/11/30 9:36
 * 自定义一个工厂给Spring，spring就会使用这个工厂来创建bean对象。这个自定义工厂本身就会纳入spring容器中管理，因此命名通常都是xxxFactoryBean
 */
public class UsersFactoryBean {
    public Users build(){
        return new Users();
    }
}
