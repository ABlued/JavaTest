package ArrayList;

public class Main {
	public static void main(String[] args) {
		Student lee = new Student(1001, "lee");
		Student kim = new Student(1002, "kim");
		lee.addSubject("korean", 100);
		lee.addSubject("math", 50);
		
		kim.addSubject("korean", 70);
		kim.addSubject("math", 85);
		kim.addSubject("english", 100);

		lee.showInfo();
		kim.showInfo();
	}
}
