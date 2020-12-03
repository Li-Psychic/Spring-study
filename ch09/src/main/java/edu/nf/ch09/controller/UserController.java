package edu.nf.ch09.controller;

import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: 黎汉清
 * @date: 2020/12/3 9:27
 * 使用Component注解标识类，表示容器受管的Bean对象
 * value属性用于指定Bean的id，如果不指定，默认类名将首字母变成小写作为id
 * 从Spring 3.0后开始，每个层都有对应的注解来标识，作用和@Component注解一样，这样可以标识起来更加明确
 */
@Controller("controller")
//@Component
//@Scope注解用于指定Bean的作用域，作用和xml的一样
@Scope("prototype")
public class UserController {
    @Autowired
    @Qualifier("stuService")
    private UserService userService;

    //注入Service
    //@Autowired注解用于完成注入配置文件，可以标识再set方法上，构造方法上，字段上。
    //当实现类只有一个的时候Spring会自动找到它并直接注入进来，如果有多个实现类的时候，就必须结合@Qualifier注解一起使用，作用是指定要注入哪个实现类

    /*@Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    public void add(){
        userService.add();
    }
    //注解标识自定义初始化方法
    @PostConstruct
    public void init(){
        System.out.println("执行自定义的init方法");
    }

    //注解标识能给定义的销毁方法
    @PreDestroy
    public void destroy(){
        System.out.println("执行自定义的destroy方法");
    }
}
