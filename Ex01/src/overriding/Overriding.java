package overriding;

public class Overriding {
	public static void main(String[] args) {
//		
//	Weapon weapon = new Weapon();
//	System.out.println("기본 무기의 살상 능력은" + weapon.fire());
	
	Weapon weapon = new Cannon();
	System.out.println("대포의 살상 능력은" + weapon.fire());
	
	}
}
