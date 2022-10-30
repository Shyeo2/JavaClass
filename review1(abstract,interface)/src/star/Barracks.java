package star;

public class Barracks extends Building implements Fly{

	@Override
	void doBuild() {
		System.out.println("인간형 유닛 생산 건물을 짓습니다.");
		
	}
	
	void doMakerMarine() {
		System.out.println("총 쏘는 유닛을 생산합니다.");
	}
	
	@Override
	public void flyBuilding() {
		System.out.println("건물이 날아서 이동하게 됩니다.");
		
	}

}
