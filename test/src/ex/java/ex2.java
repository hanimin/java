package ex.java;

/*
 * 중첩for문을 이용하여 방정식 4x+5y=60의 모든해를 구해서 (x,y)형태로 출력
 * 단 x와 y는 10이하의 자연수
 */

public class ex2 {

	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x+5*y)==60) {
					System.out.println("("+x+","+y+")");
				}				
			}			
		}
	}

}
