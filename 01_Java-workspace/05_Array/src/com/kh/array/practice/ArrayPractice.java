package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int[] arr = new int[10];
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			count += i;
			
			System.out.print(arr[i] + " ");
		}
	
	}
	
	// 10 9 8 7 6 5 4 3 2 1
	
	public void practice2() {
		
		int[] arr = new int[10];
		
		int count = 10;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = count;
			count--;
			
			System.out.print(arr[i] + " ");
			
		}
	}
	
	public void practice3() {
		
		System.out.print("양의 정수: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] numArr = new int[num];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
			
			System.out.print(numArr[i] + " ");
		}		
		
	}
	
//	길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//	배열 인덱스를 활용해서 귤을 출력하세요.
//	ex.
//	귤
	
	public void practice4() {
		String[] fruitArr = new String[5];
		
		fruitArr[0] = "사과";
		fruitArr[1] = "귤";
		fruitArr[2] = "포도";
		fruitArr[3] = "복숭아";
		fruitArr[4] = "참외";
		
		System.out.print(fruitArr[1]);
		
	}
	
//	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//	ex.
//	문자열 : application
//	문자 : i
//	application에 i가 존재하는 위치(인덱스) : 4 8 
//	i 개수 : 2
	
	public void practice5() {
		
		System.out.print("문자열: ");
		String sen = sc.nextLine();
		
		// 입력받은 문자열의 길이만큼 배열 만들기
		char[] senArr = new char[sen.length()];
		
		// 배열 1칸당 문자 1개씩 넣기
		for(int i = 0; i < sen.length(); i++) {
			
			// chatAt으로 문자 뽑으려 하니 자꾸 오류 나서 배열 자료형을 String -> char로 바꿨음
			// (배열 자료형 String으로 하고 싶으면 **(1) 참고)
			senArr[i] = sen.charAt(i);
			
		}
		
		// 문자는 char니까 string형인 nextLine에서 0번째 글자를 추출하여 char형으로 변환
		System.out.print("문자: ");
		char alp = sc.nextLine().charAt(0);
		
		
		// 문자 개수를 뽑기 위한 변수 선언 및 초기화
		int count = 0;
		
		// index를 뽑을 변수 선언 및 초기화
		String sIndex = "";
		
		// 입력받은 문자열의 길이만큼 반복 돌리면서 찾고자 하는 문자와 같다면
		// 그 인덱스를 sIndex 변수에 저장하고, 개수를 세기 위해 count를 올림
		for(int i = 0; i < senArr.length; i++) {
			if(senArr[i] == alp) {
				sIndex += i + ", ";
				count++;

			}

		}
		// application에서 문자 a를 찾았을 때 현재 0, 6, 으로 마지막 단어에 콤마가 포함되어 출력됨
		// 마지막 콤마를 제거하는 작업( == 문자열의 0번째에서 마지막 문자열 -2만큼 잘라서 sIndex에 넣어라) 
		sIndex = sIndex.substring(0, sIndex.length() - 2);
		
		System.out.println(sen + "에 " + alp + "가 존재하는 위치(인덱스): " + sIndex);
		System.out.println(alp + " 개수: " + count);

	}
	
	/* **(1) 배열 자료형을 String으로 하고 싶다면 chatAt 대신 subString 쓰면 됨!
	* senArr[i] = sen.substring(i, i+1); 
	* subString(i번째부터, i+1개만큼 뽑아라); 근데 왜 i+1이어야 하징? 
	*i 부터 (i+1) -1 길이까지만큼 출력하라는 뜻이기 때문에 결국 1개씩 출력하는 뜻이 됨
	*/
	
//	“월“ ~ “일” (요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//	입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//	범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//	ex.
//	0 ~ 6 사이 숫자 입력 : 4          0 ~ 6 사이 숫자 입력 : 7
//	금요일                          잘못 입력하셨습니다.
	
	public void practice6() {
		
		String day = "월요일,화요일,수요일,목요일,금요일,토요일,일요일";
		String[] dayArr = day.split(",");
		
		
		System.out.print("0 ~ 6 사이 숫자 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		 
		if(num >= 0 && num <= 6) {
			System.out.println(dayArr[num]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return; 
		}

	}
	
//	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//	ex.
//	정수 : 5
//	배열 0번째 인덱스에 넣을 값 : 4
//	배열 1번째 인덱스에 넣을 값 : -4
//	배열 2번째 인덱스에 넣을 값 : 3
//	배열 3번째 인덱스에 넣을 값 : -3
//	배열 4번째 인덱스에 넣을 값 : 2
//	4 -4 3 -3 2 
//	총 합 : 2
	
	public void practice7() {
		System.out.print("정수: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] numArr = new int[num];
		int sum = 0;
		String outputFormat = "";
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값: ", i);
			numArr[i] = sc.nextInt();
			sc.nextLine();
			
			sum += numArr[i];
			
			// inputFormat = numArr[i] + " ";
			// 라고 썼더니 자꾸만 마지막 값만 출력되는 것이엇따 ;;
			// for문 돌면서 자꾸 변수 덮어씌워지니까 당연함
			// += 으로 써서 for문을 돌 때마다 해당하는 값을 추가한 후 inpuFormat에 담아 줌!

			outputFormat += numArr[i] + " ";
		}
		
		// 출력할 때 이 값을 그대로 쳐서 담아도 되지만 어차피 쓰던 변수에 마지막으로 정리해서 담아 놓는 게
		// 출력문도 간단하게 나오고 더 직관적이라 좋다는 코딩 천재 김루루님의 한 수
		outputFormat = outputFormat.substring(0, outputFormat.length()-1);

		System.out.println(outputFormat);
		System.out.println("총 합: " + sum);
		
	}
	
//	3이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//	다시 정수를 받도록 하세요.
//	ex.
//	정수 : 4
//	다시 입력하세요.
//	정수 : -6
//	다시 입력하세요.
//	정수 : 5
//	1, 2, 3, 2, 1
	
	public void practice8() {
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int count = 1;
		
		if(num < 3 || num % 2 == 0) {
			System.out.println("다시 입력하세요.");
			practice8();
			return;
		} else {
			int[] arr = new int[num];
			
			for(int i = 0; i < arr.length; i++) {
				if (i < Math.ceil(num / 2)) {
				arr[i] = count;
				count++;
				} 
				
				else {
					arr[i] = count;
					count--;
				}
			
				System.out.print(arr[i] + " ");
			}
		}
		
	}
	
//	사용자가 입력한 값이 배열에 있는지 검색하여
//	있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//	단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//	ex.
//	치킨 이름을 입력하세요 : 양념 			치킨 이름을 입력하세요 : 불닭
//	양념치킨 배달 가능             		불닭치킨은 없는 메뉴입니다.
//	
	public void practice9() {
		
		System.out.print("치킨 이름을 입력하세요: ");
		String name = sc.nextLine();
		
		String menu = "후라이드,양념,순살,슈프림양념";
		String[] menuArr = menu.split(",");
		
		
		for(int i = 0; i < menuArr.length; i++) {
			
			switch(name) {
			case "후라이드" : System.out.print("후라이드치킨 배달 가능");
							return;
			case "양념" : System.out.println("양념치킨 배달 가능");
							return;
			case "순살" : System.out.println("순살치킨 배달 가능");
							return;
			case "슈프림양념" : System.out.println("슈프림양념치킨 배달 가능");
							return;
			default : System.out.printf("%s치킨은 없는 메뉴입니다.", name);
							return;
			}
		}
		
		// 천재 루 코드 ;; flag를 세워서 이용하는 법!!
		
//		boolean flag = false;
//	
//		for( int i = 0 ; i < menuArr.length; i++ ) {
//			if( menuArr[i].equals(name) ) {
//				System.out.println(name + "치킨 배달 가능");
//				
//				flag = true;
//			} 
//		}
//		
//		if( !flag ) {
//			System.out.println(name + "치킨은 없는 메뉴입니다.");
//		}
//		
	}
	
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
//	ex.
//	9 7 6 2 5 10 7 2 9 6
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		// 처음에 여기 랜덤 정수 num을 선언했더니 이미 뽑힌 랜덤 정수가 for문으로 돌아서 같은 수 10개가 출력되었기에
		// num 선언을 for문 안에서 
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random()*10) + 1;
			arr[i] = num;
			
			System.out.print(arr[i]  + " ");
		}
		
	}
	
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 배열에 초기화 후
//	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//	ex.
//	5 3 2 7 4 8 6 10 9 10 
//	최대값 : 10
//	최소값 : 2
	
	// max, min 안 쓴 버전
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random()*10) + 1;
			arr[i] = num;
			
			System.out.print(arr[i]  + " ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println();
		
		System.out.println("최대값 " + max);
		System.out.println("최소값: " + min);
		
	}
	
	public void practice11_1() {
		
		int[] arr = new int[10];

		int max = 0;
		int min = 10;
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random()*10) + 1;
			arr[i] = num;
			
			System.out.print(arr[i]  + " ");
			
			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);
			
			}
		
		System.out.println();
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
	}
	
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//	ex.
//	4 1 3 6 9 5 8 10 7 2
	
	public void practice12() {
		
		int[] arr = new int[10];
		
		String outputFormat = "";
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * 10) + 1;
			arr[i] = num;
			
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j]) {
						i--;
					}
			}
			
			} else {
				continue;
			}
		}
		outputFormat = Arrays.toString(arr);
		outputFormat = outputFormat.substring(1, outputFormat.length()-1).replace(",", "");
		System.out.println(outputFormat);
	}
	
//	주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열을 각 인덱스 별 문자를
//	char[]에 옮겨 담기 (단, 성별 자리 이후부터는 *로 담기)
//	ex.
//	주민등록번호(-포함) : 123456-1234567
//	123456-1******
	
	public void practice13() {
		
		System.out.print("주민등록번호 (-포함): ");
		String personId = sc.nextLine();
		
		char[] idArr = new char[14];
		
		for(int i = 0; i < idArr.length; i++) {
		
			if(i <= 7) {
				idArr[i] = personId.charAt(i);
			} else {
				idArr[i] = '*';
			}
			
			System.out.print(idArr[i]);
		}
	}
	
//	로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
//	ex.
//	3 4 15 17 28 40
	
	public void practice14() {
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * 45) + 1;
			arr[i] = num;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--; 
					break;
				}
 
			}
			
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
