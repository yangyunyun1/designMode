package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * @author yangyunyun
 *
 */
public class JdkDynamicProxy implements InvocationHandler{	
	//被代理的目标对象
	private Object target;

	public JdkDynamicProxy(Object target) {
		super();
		this.target = target;
	}

	@SuppressWarnings("unchecked")
	public <T> T getProxy() {
		return (T)Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		before();
		Object result = method.invoke(target, args);
		after();
		return result;
	}
	
	private void before() {
		System.out.println("before.....");
	}

	private void after() {
		System.out.println("after.....");
	}
}
