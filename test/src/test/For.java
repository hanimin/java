package test;
//1~100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��غ�����
public class For {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				sum +=i;
			}
			
		}
		System.out.println("3�� ����� ��: "+sum);
	}

}
