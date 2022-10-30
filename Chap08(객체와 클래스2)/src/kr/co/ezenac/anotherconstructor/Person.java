package kr.co.ezenac.anotherconstructor;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("최선혜", 28);
	}

	public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public Person getPerson() {
		return this;
	}
	

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getName());
	    
		Person person2 = person.getPerson();
		
		System.out.println(person);
		System.out.println(person2);
	}
}
