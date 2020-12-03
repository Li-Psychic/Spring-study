package edu.nf.ch04.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 黎汉清
 * @date: 2020/12/1 8:50
 */
public class Test {
    @org.junit.Test
    public void testLife(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在实现类中会提供一个close方法用于关闭容器，因此当关闭容器前都会执行所以Bean的destroy方法
        ((ClassPathXmlApplicationContext)context).close();
    }
}
