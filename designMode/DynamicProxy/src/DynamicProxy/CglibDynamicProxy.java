package DynamicProxy;

import net.sf.cglib.proxy.MethodInterceptor;  
import net.sf.cglib.proxy.MethodProxy;  
  
import java.lang.reflect.Method; 

public class CglibDynamicProxy implements MethodInterceptor{

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
