package q5;

public class Student {
	private String memberId;
	private String memberName;
	
	public Student(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberId +  ":"  + memberName;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(memberId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.memberId == student.memberId)
				return true;
			else
				return false;
		}
		return false;
	}
}
