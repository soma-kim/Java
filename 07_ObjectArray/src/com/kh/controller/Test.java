package com.kh.controller;

import java.util.Scanner;

import com.kh.exam.model.vo.Cat;
import com.kh.exam.model.vo.Dog;

public class Test {

	public static void main(String[] args) {
		
		Cat[] cat = new Cat[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < cat.length; i++) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			cat[i] = new Cat(name);
		}
		
		for(int i = 0; i < cat.length; i++) {
			System.out.println(cat[i].info());
			
		}
		
		System.out.println("-------------------------------");

		Scanner sc2 = new Scanner(System.in);
		
		 Dog[] dog = new Dog[2];
		 
		 for(int i = 0; i < dog.length; i++) {
			 System.out.print("이름: ");
			 String name = sc2.nextLine();
			 
			 System.out.print("몸무게: ");
			 double weight = sc2.nextDouble();
			 sc2.nextLine();
			 
			 System.out.print("몸의 길이: ");
			 double height = sc2.nextDouble();
			 sc2.nextLine();
			 
			 dog[i] = new Dog(name, weight, height);
		 }
		 
		 for(int i = 0; i < dog.length; i++) {
			 System.out.println(dog[i].info());
		 }
		

		
		

	}

}
