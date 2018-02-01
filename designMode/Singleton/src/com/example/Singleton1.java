package com.example;

/**
 * 饿汉式:单例在还没有使用到的时候,单例的对象还是会创建。这就造成了不必要的资源浪费.
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
