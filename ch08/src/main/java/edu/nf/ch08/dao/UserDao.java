package edu.nf.ch08.dao;

import edu.nf.ch08.entity.Users;

import java.util.List;

/**
 * @author: 黎汉清
 * @date: 2020/12/2 10:36
 */
public interface UserDao {
    List<Users> listUser();
}
