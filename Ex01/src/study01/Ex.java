package study01;

public class Ex {
	public static void main(String[] args) {
		StaticSample.m = 10;
		
		StaticSample s1 = new StaticSample();
		System.out.println(s1.m);
		
	}
}
