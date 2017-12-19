package DynamicProxy;

import common.RealSubject;
import common.Subject;

public class Client {
	public static void main(String[] args) {
		JdkDynamicProxy dynamicProxy = new JdkDynamicProxy(new RealSubject());
		Subject subject = (Subject)dynamicProxy.getProxy();
		//���ӿڸı��ʱ��ֻ���޸Ľӿں�ʵ���࣬����Ҫ�޸Ĵ����࣬����Ҫ����һ��û�нӿڵ����Ъ����
		subject.request();
	}

}
