package test;
//2���� �ֻ����� ������ �� ������ ���� (��1,��2)���·� ����ϰ�,���� ���� 5�� �ƴϸ�
//��� �ֻ����� ������ ���� ���� 5�̸� ������ ���ߴ��ڵ�
//���� ���� 5�� �Ǵ� ������ (1,4)(4,1)(2,3)(3,2)
public class Random {

	public static void main(String[] args) {
		
		
		while(true) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			
			System.out.println(a+","+b);
			
			if((a+b)==5) {
				break;
			}
	
		}
		

	}

}
