package edu.nf.ch08.service;

import edu.nf.ch08.dao.UserDao;
import edu.nf.ch08.entity.Users;

import java.util.List;

/**
 * @author: 黎汉清
 * @date: 2020/12/2 15:24
 */
public interface UserService {
       List<Users> listUser();
}
