package ex.java;

import java.util.Scanner;



/*
 * Scanner�� �̿��ؼ� �̸�,�ֹι�ȣ �� 6�ڸ�, ��ȭ��ȣ�� 
 * Ű���忡�� �Է¹ް� ����ϴ� ���α׷��� �ۼ�
 */
public class Scanner_p99 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1.�̸� : ");
		String name = scn.nextLine();
		
		System.out.print("2.�ֹι�ȣ �� 6�ڸ� : ");
		String ssn = scn.nextLine();
		
		System.out.print("3.��ȭ��ȣ : ");
		String phNum = scn.nextLine();
		
		
		System.out.println("[�Է��� ����]");
		System.out.println(name);
		System.out.println(ssn);
		System.out.println(phNum);
		
	}

}