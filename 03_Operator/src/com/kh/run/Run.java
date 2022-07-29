package com.kh.run;

// 현재 계속 같은 패키지 내의 서로 다른 클래스들을 import 하는 꼴
/*
import com.kh.operator.A_Arithmetic;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Compound;
import com.kh.operator.D_LogicalNegation;
*/
import com.kh.operator.*;
// com.kh.operator 패키지에 있는 모든 클래스들을 가져다 쓰겠다

public class Run {
	
	public static void main(String[] args) {
		
		A_Arithmetic a = new A_Arithmetic();
		
		//a.method1();
		
		//a.method2();
		
		B_InDecrease b = new B_InDecrease();
		
		// b.method1();
		
		// b.method2();
		
		// b.method3();
		
		// b.method4();
		
		C_Compound c = new C_Compound();
		
		//c.method();
		
		D_LogicalNegation d = new D_LogicalNegation();
		
		// d.method();
		
		E_Comparison e = new E_Comparison();
		
		// e.method1();
		
		// e.method2();
		
		F_Logical f = new F_Logical();
		
		// f.method1();
		
		// f.method2();
		
		// f.method3();
		
		//f.method4();
		
		G_Triple g = new G_Triple();
		
		// g.method1();
		
		g.method2();
		
		
		
	}
	
	




}
