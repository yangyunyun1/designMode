package DynamicProxy;

import common.RealSubject;
import common.Subject;
import net.sf.cglib.proxy.Enhancer;

public class CglibClient {
	public static void main(String[] args) {
		CglibDynamicProxy cglibProxy = new CglibDynamicProxy(); 
		
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(RealSubject.class);  
        enhancer.setCallback(cglibProxy);  
  
        Subject subject = (Subject)enhancer.create();  

		subject.request();
	}
}
