package edu.nf.ch04.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author: 黎汉清
 * @date: 2020/12/1 9:42
 * BeanPostProcessor这个接口称为Bean的后处理器，它可以在Spring容器实例化bean对象并完成依赖注入，再执行Bean的初始化方法前后执行
 * 如：initializingBean接口，自定义的init-method，用于添加一些其他处理逻辑。这个接口是针对所以的Bean
 */
public class MyPostProcessor implements BeanPostProcessor {
    /**
     * 在执行初始化方法前执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessBeforeInitialization");
        return bean;
    }

    /**
     * 在执行初始化方法后执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessAfterInitialization");
        return bean;
    }
}
