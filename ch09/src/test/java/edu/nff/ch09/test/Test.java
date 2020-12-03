package edu.nff.ch09.test;

import edu.nf.ch09.controller.UserController;
import edu.nf.ch09.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 黎汉清
 * @date: 2020/12/3 9:40
 */
public class Test {
    @org.junit.Test
    public void testIoc() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserController userService = context.getBean("controller", UserController.class);
        userService.add();
    }
}
