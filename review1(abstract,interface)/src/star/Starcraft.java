package star;

public class Starcraft {

	public static void main(String[] args) {
		
		Barracks barracks = new Barracks();
		barracks.doBuild();
		barracks.doMakerMarine();
		barracks.flyBuilding();

		
		Factory factory = new Factory();
		factory.doBuild();
		factory.doMakeTank();
		factory.flyBuilding();
		
		Bunker bunker = new Bunker();
		bunker.doBuild();
		bunker.doDefense();
		
	}

}
