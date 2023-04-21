package ex.java;

import java.util.Scanner;



/*
 * Scanner를 이용해서 이름,주민번호 앞 6자리, 전화번호를 
 * 키보드에서 입력받고 출력하는 프로그램을 작성
 */
public class Scanner_p99 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1.이름 : ");
		String name = scn.nextLine();
		
		System.out.print("2.주민번호 앞 6자리 : ");
		String ssn = scn.nextLine();
		
		System.out.print("3.전화번호 : ");
		String phNum = scn.nextLine();
		
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(ssn);
		System.out.println(phNum);
		
	}

}