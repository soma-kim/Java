package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {
		/*
		 * 에러(오류) 종류
		 * - 시스템 에러: 컴퓨터의 오작동으로 인해 발생하는 에러
		 * 			   => 소스코드로 해결이 안 됨(심각한 에러)
		 * - 컴파일 에러: 소스코드상의 문법적인 문제로 발생하는 에러
		 * 			   => 소스코드 수정으로 해결 가능(이클립스가 애초에 빨간 밑줄로 알려 주는 오류)
		 * - 런타임 에러: 소스코드상으로는 문제가 없는데 프로그램 실행 도중 발생하는 에러
		 * 			   => 사용자의 잘못일 수도 있고, 개발자가 예측 가능한 경우를 제대로 처리 안 해 놓은 잘못일 수도 있음
		 * - 논리 에러: 소스코드상의 문법적인 문제도 없고 실행했을 때도 굳이 문제가 되진 않지만 내가 짠 프로그램 의도상 반대로 작동하는 에러
		 * 
		 * => 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러와 같은 비교적 덜 심각한 것들을 가지고 작업
		 * 	    이런 것들을 "예외(Exception)"라고 함
		 * 
		 * => 이러한 "예외"들이 "발생"했을 경우에 대비해서 미리 "처리"하는 방법을 정의해 두는 것을 "예외처리"라고 함
		 * 
		 * *예외처리를 하는 이유: 예외 발생 시 프로그램이 비정상적으로 종료되는 것을 막기 위함! 반드시 해야 함!
		 * 
		 * *예외처리 방법
		 * 1. try ~ catch문을 이용
		 * 2. throws를 이용(떠넘기기, 위임하기)
		 * 
		 */

	// main 메소드에서 throws로 예외 처리를 떠넘기게 되면 JVM에 의해 예외 처리가 됨!
	// JVM이 어떻게 예외처리를 해 줄지 모르기 때문에 내가 직접 try ~ catch문으로 예외처리하는 것을 권장함
	public static void main(String[] args) throws IOException { // JVM이 알아서 처리해 줌...
		
		A_UncheckedException a = new A_UncheckedException();
		
		// a.method1();
		// a.method2();
		// a.method3();
		
		B_CheckedException b = new B_CheckedException();
		
		// b.method1();
		/*
		try {
			b.method2();
		} catch (IOException e) {
			System.out.println("예외 발생됨"); // method1이 떠넘긴 예외 처리를 반드시 이렇게 try ~ catch문으로 받아 줘야 함
		}
		*/
		// 계속 계속 떠넘기다가 여기서도 예외 처리 하기 싫으면??
		
		b.method2();

	}

}
