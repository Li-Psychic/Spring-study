package edu.nf.ch01.test;

import edu.nf.ch01.People;
import edu.nf.ch01.Users;
import edu.nf.ch01.factory.UsersFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 黎汉清
 * @Date: 2020/11/30 9:05
 *
 * 在Spring的框架中，工厂分类两种
 * 一种是BeanFactory，另一种是ApplicationContext
 * 简单点说，BeanFactory是Spring最基本的Bean工厂，而ApplicationContext针对BeanFactory做了很多的功能扩展和增强
 * 官方也推荐我们使用ApplicationContext这个接口来操作Spring容器
 */
public class Test {
    @org.junit.Test
    public void testGetBean(){
        //初始化spring容器（也就是一个容器工厂）
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //从容器中获取bean对象,根据id来获取
        Users users = (Users) context.getBean("user");
        //或者使用泛型来获取
        //Users users1 = context.getBean("user",Users.class);
        users.say();
        People people = (People) context.getBean("people");
        people.run();
    }

    @org.junit.Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Users users = (Users) context.getBean("user1");
        users.say();
    }
}
