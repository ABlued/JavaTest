package ArrayList;
import java.util.ArrayList;
class Book{
	String name;
	String author;
	Book(String name, String author){
		this.name = name;
		this.author = author;
	}
	String showBookInfo() {
		return  "책 이름 : " + this.name + "저자 이름 : " + this.author;
	}
}
//public class ArrayListTest {
//	public static void main(String[] args) {
//		ArrayList<Book> library = new ArrayList<Book>();
//		
//		library.add(new Book("태백산맥", "조정래"));
//		library.add(new Book("데미안", "헤르만 헤세"));
//		library.add(new Book("어떻게 살 것인가", "유시민"));
//		library.add(new Book("토지", "박경리"));
//		library.add(new Book("어린왕자", "생택쥐페리"));
//		
//		for(Book book : library) {
//			System.out.println(book.showBookInfo());
//		}
//		System.out.println(library.get(3).showBookInfo());
//		
//		library.remove(3);
//		System.out.println(library.get(3).showBookInfo());
//		System.out.println(library.size());
//		
//	}
//}
