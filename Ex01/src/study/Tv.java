package study;

/*
 * public static void main(String[] args) {
   TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
   myTV.show();
}
LG에서 만든 2017년형 32인치 TV
 */
public class Tv {
	private String tvName;
	private int year;
	private int inch;
	
	public Tv(String tvName, int year, int inch) {
		//super();
		this.tvName = tvName;
		this.year = year;
		this.inch = inch;
		
	}
	public void show() {
		System.out.println(this.tvName + "에서 만든 " +this.year +"형 " + this.inch +"인치 TV" );
	}
	
}


