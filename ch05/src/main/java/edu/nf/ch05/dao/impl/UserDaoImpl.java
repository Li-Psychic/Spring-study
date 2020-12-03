package edu.nf.ch05.dao.impl;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.entity.Users;

/**
 * @author: 黎汉清
 * @date: 2020/12/1 10:35
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save(Users users) {
        System.out.println("insert into user_info value(1,'user1')");
    }
}
