package DynamicProxy;

import common.RealSubject;
import common.Subject;

public class Client {
	public static void main(String[] args) {
		JdkDynamicProxy dynamicProxy = new JdkDynamicProxy(new RealSubject());
		Subject subject = (Subject)dynamicProxy.getProxy();
		//当接口改变的时候，只需修改接口和实现类，不需要修改代理类，但是要代理一个没有接口的类就歇菜了
		subject.request();
	}

}
