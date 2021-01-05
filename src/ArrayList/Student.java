package ArrayList;
import java.util.ArrayList;
public class Student {
	int studentNumber;
	String studentName;
	ArrayList<Subject> hadSubject = new ArrayList<Subject>();
	
	public Student(int studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}
	
	public void addSubject(String subjectName, int subjectPoint) {
		Subject subject = new Subject(subjectName, subjectPoint);
		hadSubject.add(subject);
	}
	
	public void showInfo() {
		int totalPoint = 0;
		for(Subject subject : this.hadSubject) {
		System.out.println("학생 " + this.studentName + "의 " + subject.subjectName + " 과목 성적은 " + subject.subjectPoint + "입니다");
		totalPoint += subject.subjectPoint;
		}
		System.out.println("학생 " + this.studentName + "의 총점은 " + totalPoint + "입니다.");
	}
}
