package star;

public class Bunker extends Building {

	@Override
	void doBuild() {
		System.out.println("인간형 유닛이 숨을 건물을 짓습니다.");
		
	}
	
	void doDefense()	{
		System.out.println("숨은 유닛을 적의 공격으로부터 보호합니다.");
	}
	
}
