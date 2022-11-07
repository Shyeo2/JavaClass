package kr.co.ezen.object;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		//super();
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return title + ", " + author;
	}
	
	
	

}	
public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("일래스틱서치 쿡북", "알베르토 파로");
		//System.out.println(book);
	}
}
	
	

