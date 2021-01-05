package SingletonePattern;

public class Main {
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2); 
		//항상 같은 객체를 리턴할 것이다.
		//그것이 싱글톤 패턴이니까(끄덕)
	}
}
