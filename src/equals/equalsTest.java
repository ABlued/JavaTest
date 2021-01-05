package equals;

public class equalsTest {
//	public static void main(String[] args) {
//		Student student1 = new Student("나재완",2015132011);
//		Student student2 = student1;
//		Student student3 = new Student("나재완",2015132011);
//		// == 은 대상의 주소값을 비교 equals()는 대상의 내용 자체를 비교
//		if(student1 == student2) 
//			System.out.println("1과 2는 주소는 같습니다");
//		else
//			System.out.println("1과 2는 주소는 다릅니다.");
//		
//		if(student1.equals(student2))
//			System.out.println("1과 2는 같은 내용의 객체입니다");
//		else
//			System.out.println("1과 2는 다른 내용의 객체입니다.");
//		
//		if(student1 == student3) 
//			System.out.println("1과 2는 주소는 같습니다");
//		else
//			System.out.println("1과 2는 주소는 다릅니다.");
//		
//		if(student1.equals(student3))
//			System.out.println("1과 2는 같은 내용의 객체입니다");
//		else
//			System.out.println("1과 2는 다른 내용의 객체입니다.");
//	}
}
class Student{
	String name;
	int number;
	Student(String name, int number){
		this.name = name;
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.number == std.number) return true;
			else return false;
		}
		return false;
	}
}
