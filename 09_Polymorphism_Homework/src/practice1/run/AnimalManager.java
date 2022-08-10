package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Dog;
import practice1.model.vo.Cat;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] arr = new Animal[5];
		
		int random = (int)(Math.random() * 2);
		if(random == 1) {
			
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].speak();
		}
		

	}

}
