package kr.co.ezenac.singleton;

//public class Company {
//	
//	private static Company instance ; 
//	
//	private Company() {
//		
//	}
//
//	public static Company getInstance() { //getInstance를 통해서 접근
//		if (instance == null)
//			instance = new Company();
//		return instance;
//			
//	}
//
//
//}

public class Company {
	
	private static Company instance;
	
	private Company() {
		
	}
	
	public static Company getInstance() {
		if (instance == null)
			instance = new Company();
		return instance;
	}

}