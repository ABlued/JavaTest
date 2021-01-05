package SingletonePattern;

public class Company {		//하나의 회사 안에 여러 명의 직원객체를 만들기
	private static Company instance = new Company();		//하나의 static회사객체가 만들어짐
	private Company() {		//외부에서 생성자를 만들 수 없게 한다.
		
	}
	public static Company getInstance() {		//private으로 선언한 유일한 인스턴스를 외부에서도 사용할 수 있게 설정한다.
		if(instance == null) {
			instance = new Company(); 
		}
		return instance;
	}
}
