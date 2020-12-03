package edu.nf.ch09.service.impl;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 黎汉清
 * @date: 2020/12/3 10:39
 */
@Service("stuService")
public class StuServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("执行stuServiceImpl");
        userDao.save();
    }
}
