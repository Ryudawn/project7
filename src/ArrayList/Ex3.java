package ArrayList;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		list.add(new Book("태백산맥", "조정래"));
		list.add(new Book("데미안", "헤르만 헤세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));
		
		System.out.println("=== 일반 for문 사용 ===");
		for(int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			book.showBookInfo();
		}
	}

}

class Book {
	String bookName;
	String author;
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
}