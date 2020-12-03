package edu.nf.ch01.factory;

import edu.nf.ch01.Users;

/**
 * @Author: 黎汉清
 * @Date: 2020/11/30 9:46
 *
 * 使用工厂的静态方法来创建Bean实例
 */
public class UsersFactory {
   public static Users create(){
       return new Users();
   }
}
