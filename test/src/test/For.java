package test;
//1~100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요
public class For {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				sum +=i;
			}
			
		}
		System.out.println("3의 배수의 합: "+sum);
	}

}
