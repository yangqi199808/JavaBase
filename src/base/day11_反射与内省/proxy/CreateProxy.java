package base.day11_反射与内省.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiao儿
 * @date 2019/9/10 8:13
 * @Description CreateProxy
 * <p>
 * 用于动态生成一个代理对象
 */
public class CreateProxy implements InvocationHandler {
    private Object target;// 被代理的对象

    // 用于创建代理对象
    public Object create(Object target) {
        this.target = target;
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return proxy;
    }

    /**
     * 代理对象要执行的方法
     * @param proxy 代理类对象
     * @param method 被代理对象的方法
     * @param args 被代理对象方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("上海外寻找客户需要的产品");
        System.out.println("跟客户确定物品");
        method.invoke(target, args);
        System.out.println("完成本次海淘");
        return null;
    }
}
