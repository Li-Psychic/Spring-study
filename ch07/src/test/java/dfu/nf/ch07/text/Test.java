package dfu.nf.ch07.text;

import edu.nf.ch07.demo1.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 黎汉清
 * @date: 2020/12/2 9:56
 */
public class Test {
    @org.junit.Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = context.getBean("userService",UserService.class);
        UserService service1 = context.getBean("userService",UserService.class);
        System.out.println(service);
        System.out.println(service1);
    }
}
