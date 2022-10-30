package instancepluspoly;

public class Polymorphism2 {

	//매개변수로 어떤 형태의 객체를 참조하는 변수가 들어올지 모르기 때문에 상위클래스로 지정
	//하위 클래스를 매개변수로 넘겨도 자동으로 형변환되서 매개변수로 들어오게 됨 
	public static void animalChoose(Animal obj) {

		if( obj instanceof Tiger) {
			Tiger tiger = (Tiger)obj;
			tiger.doMove();
		}
		else {
			Lion lion = (Lion)obj;
			lion.doMove();
		}
	}
	
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		animalChoose(tiger);
		
		Lion lion = new Lion();
		animalChoose(lion);

	}

}
