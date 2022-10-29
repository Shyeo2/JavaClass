package kr.co.ezenac.member;

/*
 *1. 클래스는 대문자로 시작함
 *2. java 파일 하나에 여러 개가 있을 수 있음.
 *  - public 클래스는 하나임
 *  - public 클래스와 .java파일의 이름은 동일함.
 *  
 */

//public class Student {
//
//
//	public int studentId;
//	public String studentName;
//	public String address;
//	
//	public void showStudentInfo() {
//		System.out.println(studentName + "," + address);
//	}
//	
//	public String getStudentName() {
//		return studentName;
//	}
//}

	
	public class Student {
		private int studentId;
		private String studentname;
		private String studentaddress;
		
		
		
		
	public int getStudentId() {
			return studentId;
		}




		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}




		public String getStudentname() {
			return studentname;
		}




		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}




		public String getStudentaddress() {
			return studentaddress;
		}




		public void setStudentaddress(String studentaddress) {
			this.studentaddress = studentaddress;
		}




	public void showInfo() {
		System.out.println(studentname + "," + studentaddress);
	}
			
		}
		
		
		
		
		
		
	
