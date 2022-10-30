package instance;

public class instance {
	public static void main(String[] args) {
		//Cat 클래스를 이용하여 객체 만들고 변수 test1에 참조 값 대입 
		Cry test1 = new Cat(); 
		
		//test1에 있는 참조 값이 Cat의 객체를 가리키는지 Dog객체를 가르키는지 조사하여 코드 진행 
		if(test1 instanceof Cat) {
			test1.Cry();
		}
		else if (test1 instanceof Dog) {
			System.out.println("고양이가 아닙니다.");
		}
	}
}

