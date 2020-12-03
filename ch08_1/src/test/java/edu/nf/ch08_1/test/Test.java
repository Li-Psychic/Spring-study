package edu.nf.ch08_1.test;

import edu.nf.ch08_1.dao.UserDao;
import edu.nf.ch08_1.entity.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: 黎汉清
 * @date: 2020/12/2 11:56
 */
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao dao = context.getBean("userDao",UserDao.class);
        List<Users> list = dao.save();
        list.forEach(l -> System.out.println(l.getUid() + "," + l.getUserName()));
    }
}
