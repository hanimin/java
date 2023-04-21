package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		double a = scn.nextDouble();
		
		System.out.print("두 번째 수 :");
		double b = scn.nextDouble();
		
		System.out.println("-----------------");
		
		if(b == 0 || b == 0.0) {
			System.out.println("결과 : 무한대");
		}else {
			System.out.println("결과 :  "+ (a/b));
		}
		

	}

}
