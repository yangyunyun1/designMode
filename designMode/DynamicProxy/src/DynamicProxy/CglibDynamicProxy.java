package DynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;  
import net.sf.cglib.proxy.MethodProxy;  
  
import java.lang.reflect.Method;

import common.RealSubject; 

public class CglibDynamicProxy implements MethodInterceptor{

	public static Object getProxy(Class clz, MethodInterceptor interceptor) {
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(clz);  
        enhancer.setCallback(interceptor); 
        return enhancer.create();
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, 
			MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		before();
        Object result = methodProxy.invokeSuper(obj, args);  
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
