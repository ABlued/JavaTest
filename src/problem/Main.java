package problem;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {	
//		Dog dogs[] = new Dog[5];
		String dogName[] = {"믕믕1",  "믕믕2", "믕믕3", "믕믕4", "믕믕5"};
		String dogtype[] = {"시츄", "인절미", "코카스파니엘", "진돗개", "시베리아 멜러뮤트"};
//		for(int i = 0; i<5; i++) {
//			dogs[i] = new Dog();
//			dogs[i].setName(dogName[i]);
//			dogs[i].setType(dogtype[i]);
//		}
//		for(Dog dog : dogs) {
//			System.out.println(dog.showDogInfo());
//		}

		DogArrayList dogs = new DogArrayList();

		for(int i = 0; i<5; i++) {
			dogs.dogs.add(new Dog());
			dogs.dogs.get(i).setName(dogName[i]);
			dogs.dogs.get(i).setType(dogtype[i]);
		}
		dogs.showInfo();
	}
}
