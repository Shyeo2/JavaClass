package kr.co.ezenac.exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throwsexception {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class clazz = Class.forName(className);
		return clazz;
	}
	public static void main(String[] args) {
		Throwsexception test = new Throwsexception();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			////e.printStackTrace();
			System.out.println("FileNotFoundException " +e.getMessage());
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ClassNotFoundException " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}
			
		
		
		
	}
}
