package edu.nf.ch05.service.impl;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 黎汉清
 * @date: 2020/12/1 10:37
 */
public class UsersServiceImpl implements UsersService {
    private UserDao dao;

    public UsersServiceImpl() {
    }

    /**
     * 构造方法注入
     * @param dao
     */
    public UsersServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    /**
     * 提供一个set方法给Spring容器，这个方法就是注入的入口方法，那么Spring就会调用这个方法，容器中将一个UserDao的实现类给注入进来，赋值给上面的接口
     * @param dao
     */
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(Users users) {
        dao.save(users);
    }
}
