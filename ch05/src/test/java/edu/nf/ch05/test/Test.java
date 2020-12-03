package edu.nf.ch05.test;

import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 黎汉清
 * @date: 2020/12/1 10:48
 */
public class Test {
    @org.junit.Test
    public void testContainer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UsersService service = context.getBean("userService", UsersService.class);
        Users users = new Users();
        service.add(users);
    }
}
