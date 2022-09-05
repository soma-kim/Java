package practice2.run;

import practice2.model.vo.GalaxyNote9;
import practice2.model.vo.SmartPhone;
import practice2.model.vo.V40;

public class Run {
	public static void main(String[] args) {
		
		SmartPhone[] arr = new SmartPhone[2];
		
		arr[0] = new GalaxyNote9();
		arr[1] = new V40();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].printMaker();
			arr[i].makeaCall();
			arr[i].takeaCall();
			arr[i].touch();
			arr[i].charge();
			arr[i].picture();
			System.out.println();
		}
		
	}

}
