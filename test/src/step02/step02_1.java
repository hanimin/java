package step02;

import java.util.Scanner;

/*�� �� ���ϱ�
 * �� ���� ���� ����� ���
 */

public class step02_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("�� ������ �Է��ϼ��� :");
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		if(a>=-10000 && b<=10000) {
			if(a>b) {
				System.out.println("a>b");
			}else if(a<b) {
				System.out.println("a<b");				
			}else if(a==b) {
				System.out.println("a=b");
			}else
				System.out.println("error!");
		}

	}

}
