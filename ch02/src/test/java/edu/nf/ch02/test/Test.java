package edu.nf.ch02.test;

import edu.nf.ch02.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 黎汉清
 * @Date: 2020/11/30 9:58
 */
public class Test {
    @org.junit.Test
    public void testPeopleFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) context.getBean("people");
        People people1 = (People) context.getBean("people");
        System.out.println(people);
        System.out.println(people1);
        //people.say();
    }
}
