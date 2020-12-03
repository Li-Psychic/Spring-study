package edu.nf.ch03.test;

import edu.nf.ch03.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 黎汉清
 * @Date: 2020/11/30 10:47
 */
public class Test {
    @org.junit.Test
    public void testIdAndName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) context.getBean("people");
        System.out.println(people);
        //根据name别名来获取bean实例
        People people1 = (People) context.getBean("p1");
        People people2 = (People) context.getBean("p2");
        System.out.println(people1);
        System.out.println(people2);
    }
}
