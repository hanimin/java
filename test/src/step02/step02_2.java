package step02;

import java.util.Scanner;

public class step02_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� :");
		
		int score = scn.nextInt();
		
		if(score>=0 && score<=100) {
			if(score>=90) {
				System.out.println("A");
			}else if(score>=80) {
				System.out.println("B");
			}else if(score>=70){
				System.out.println("C");
			}else if(score>=60) {
				System.out.println("D");
			}else
				System.out.println("F");
		}

	}

}
