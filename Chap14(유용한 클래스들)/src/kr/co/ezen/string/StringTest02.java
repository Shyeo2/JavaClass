package kr.co.ezen.string;

public class StringTest02 {

	public static void main(String[] args) {
		String java = new String("java");
		String sql = new String("sql");
		System.out.println(System.identityHashCode(java));
	
		java = java.concat(sql);
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
	}

}
