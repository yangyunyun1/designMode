package com.example;

/**
 * 懒汉式
 * @author yangyunyun
 *
 */
public class Singleton2 {
	private static Singleton2 instance = null;
	
	private Singleton2() {}
	
	//每次使用单例对象，都需要锁判断，降低了整体性能
	public static synchronized Singleton2 getInstance() {
		if (null  == instance) {
			return new Singleton2();
		}
		return instance;
	}
}
