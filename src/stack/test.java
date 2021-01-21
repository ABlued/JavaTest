package stack;

import java.util.Stack;

public class test {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < 5; i++) {
			stack.push(i + 1);
			System.out.println(stack.peek());
		}
		System.out.println(stack.pop());
		System.out.println(stack.search(4));		//1을 search할 경우 4번째에 위치해 있음으로 4를 반환하는 것
		for(Integer element : stack) {
			System.out.println(element);
		}
	}
}
//public Element push(Element item); // 데이터 추가
//public Element pop(); // 최근에 추가된(Top) 데이터 삭제
//public Element peek(); // 최근에 추가된(Top) 데이터 조회
//public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
//public int seach(Object o); // 인자값으로 받은 데이터의 위치 반환, 그림으로 설명하겠음