package polymor;

public class Polymorphism {

	public static Human humanCreate(int kind) {
		if(kind==1) {
			Human m = new Man();
			return m;
		}
		else {
			//Human w = new Woman();
			//return w;
			return new Woman();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
