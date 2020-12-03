package edu.nf.ch04;

/**
 * @author: 黎汉清
 * @date: 2020/12/1 8:41
 */
public class People {
    public People() {
        System.out.println("执行了构造方法");
    }

    /**
     * Spring调用
     * bean的初始化方法，是在创建对象之后执行
     */
    public void init(){
        System.out.println("执行bean的初始化方法");
    }

    /**
     * Spring调用
     * bean的销毁方法是在bean之前执行
     */
    public void destroy(){
        System.out.println("执行bean的destroy方法");
    }

    public void say(){
        System.out.println("Hello world");
    }
}
