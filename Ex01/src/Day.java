/*
 * 하루의 할 일을 표현하는 클래스 Day는 다음과 같다.
 *  한 달의 할 일을 표현하는 MonthSchedule 클래스를 작성하라.

class Day {
   private String work; //하루의 할 일을 나타내는 문자열
   public void set(String work) { this.work = work; }
   public String get() { return work; }
   public void show() {
      if(work == null) System.out.println("없습니다.");
      else System.out.println(work+"입니다.");
   }
}
MonthSchedule 클래스에는 Day 객체 배열과 적절한 필드, 
메소드를 작성하고 실행 예시처럼 입력, 보기, 끝내기 등의 3개의 기능을 작성하라.

이번달 스케쥴 관리 프로그램.
할일(입력:1, 보기:2, 끝내기:3) >>1
날짜(1~30)?1
할일(빈칸없이입력)?자바공부

할일(입력:1, 보기:2, 끝내기:3) >>2
날짜(1~30)?1
1일의 할 일은 자바공부입니다.

할일(입력:1, 보기:2, 끝내기:3) >>3
프로그램을 종료합니다.
[Hint] MonthSchedule에는 생성자, input(), view(), finish(), run() 
메소드를 만들고 main()에서 다음과 같이 호출하여 실행하고 run()에서 메뉴를 출력하고 처리한다.

MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
april.run();
 */
public class Day {
	private String work; 
	   
	public void set(String work){
		this.work = work; 
		}
	public String get() { 
		return work; 
		}
	
	public void show() {
	      if(work == null) System.out.println("없습니다.");
	      else System.out.println(work+"입니다.");
	}
}