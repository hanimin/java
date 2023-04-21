package step02;

import java.util.Scanner;

/*두 수 비교하기
 * 두 수를 비교한 결과를 출력
 */

public class step02_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요 :");
		
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
