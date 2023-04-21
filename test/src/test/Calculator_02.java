package test;

import java.util.Scanner;

public class Calculator_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력해 주세요.");
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int result = a+b;
		
		System.out.println("두 정수의 합 "+result);
		
		
		

	}

}
