package edu.nf.ch07.demo1;

import edu.nf.ch07.demo1.impl.UserServiceImpl;
import org.springframework.beans.factory.FactoryBean;

/**jt
 * @author: 黎汉清
 * @date: 2020/12/2 9:41
 * 自定义FactoryBean，用于创建自定义对象
 * Spring会调用FacoryBean的getjObject方法，将返回的对象自动纳入IOC容器
 */
public class MyFactoryBean implements FactoryBean<UserService> {
    /**
     * 返回的是具体的某个实现类
     */
    @Override
    public UserService getObject() throws Exception {
        return new UserServiceImpl();
    }

    /**
     * 返回的Bean的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
