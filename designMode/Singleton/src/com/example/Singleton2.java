package com.example;

/**
 * ����ʽ
 * @author yangyunyun
 *
 */
public class Singleton2 {
	private static Singleton2 instance = null;
	
	private Singleton2() {}
	
	//ÿ��ʹ�õ������󣬶���Ҫ���жϣ���������������
	public static synchronized Singleton2 getInstance() {
		if (null  == instance) {
			return new Singleton2();
		}
		return instance;
	}
}
