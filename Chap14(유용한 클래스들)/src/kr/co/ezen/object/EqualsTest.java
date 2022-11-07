package kr.co.ezen.object;

public class EqualsTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student(2022, "Ezen");
		Student student2 = new Student(2022, "Ezen");
	
		Student student3 = (Student) student1.clone();
		
		System.out.println(student1 == student2);
		System.out.println(student1.equals(student2));
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
	
		System.out.println("=========================================");
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
	
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println();
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	}
}
