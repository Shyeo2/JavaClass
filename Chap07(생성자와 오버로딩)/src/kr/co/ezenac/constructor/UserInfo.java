package kr.co.ezenac.constructor;

//public class UserInfo {
//	
//	String userId;
//	String userPassword;
//	String userName;
//	String userAddress;
//	String phoneNumber;

//			
//	
//	public UserInfo(String userId, String userPassword, String userName) {
//		//super();
//		super();
//		this.userId = userId;
//		this.userPassword = userPassword;
//		this.userName = userName;
//	}
//	
//	public String showUserInfo() {
//		return "고객님의 아이디는 " + userId + "이고, 등록된 이름은" + userName + "입니다.";
//	}
//	
//}
public class UserInfo {
	
	String userId;
	String userPassword;
	String userName;
	String userAddress;
	String phoneNumber;
	public UserInfo(String userId, String userPassword, String userName) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "고객님의 아이디" + userId + "이고, 등록된 이름은" + userName + "입니다";
	}
	
	}



