package com.example;

/**
 * ����ʽ:�����ڻ�û��ʹ�õ���ʱ��,�����Ķ����ǻᴴ�����������˲���Ҫ����Դ�˷�.
 * @author yangyunyun
 *
 */
public class Singleton1 {
	private static Singleton1 instance = new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return instance;
	}
}
