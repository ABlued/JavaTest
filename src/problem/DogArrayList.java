package problem;

import java.util.ArrayList;

public class DogArrayList {
	ArrayList<Dog> dogs = new ArrayList<Dog>();
	
	public void showInfo() {
		for(Dog dog : dogs) {
			System.out.println("이름 : " + dog.getName());
			System.out.println("견종 : " + dog.getType());
		}
	}
}
