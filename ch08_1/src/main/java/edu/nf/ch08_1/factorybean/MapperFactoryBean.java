package edu.nf.ch08_1.factorybean;

import edu.nf.ch08_1.dao.UserDao;
import edu.nf.ch08_1.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: 黎汉清
 * @date: 2020/12/2 11:47
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Class<T> daoInterface;

    public void setDaoInterface(Class<T> daoInterface) {
        this.daoInterface = daoInterface;
    }

    @Override
    public T getObject() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSession();
        T MapperProxy = sqlSession.getMapper(daoInterface);
        return MapperProxy;
    }

    @Override
    public Class<?> getObjectType() {
        return daoInterface;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
