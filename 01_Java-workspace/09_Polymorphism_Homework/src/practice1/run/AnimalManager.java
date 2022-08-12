package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] arr = new Animal[5];
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = ((int)(Math.random() * 2)) + 1;
			
			if (random == 1) {
				arr[i] = new Cat("¾ß¿ËÀÌ", "¸ÕÄ¡Å²", "¿ì¸® Áý", "Èò»ö");
			} else {
				arr[i] = new Dog("¸Û¸ÛÀÌ", "´Ú½ºÈÆÆ®", 6);
			}	 
		}
		
		for(int j = 0; j < arr.length; j++) {
			arr[j].speak();
		}

	}

}
