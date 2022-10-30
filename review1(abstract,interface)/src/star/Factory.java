package star;

public class Factory extends Building implements Fly {

	@Override
	void doBuild() {
		System.out.println("기갑형 유닛 생산 건물을 짓습니다.");
		
	}
	
	void doMakeTank() {
		System.out.println("탱크 유닛을 생산합니다.");
	}
	
	@Override
	public void flyBuilding() {
		System.out.println("건물이 날아서 이동합니다.");
		
	}
}
