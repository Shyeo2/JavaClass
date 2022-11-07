package kr.co.ezen.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz =Class.forName("java.lang.String");
		
		Constructor[] cons =clazz.getConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		Method[] methods = clazz.getMethods();
		for (Method method :methods) {
			System.out.println(method);
		}
		
	}
}
