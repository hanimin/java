package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		double a = scn.nextDouble();
		
		System.out.print("�� ��° �� :");
		double b = scn.nextDouble();
		
		System.out.println("-----------------");
		
		if(b == 0 || b == 0.0) {
			System.out.println("��� : ���Ѵ�");
		}else {
			System.out.println("��� :  "+ (a/b));
		}
		

	}

}
