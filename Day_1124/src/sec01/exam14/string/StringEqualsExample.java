package sec01.exam14.string;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		
		if(strVar1 == strVar2) {
			System.out.println("���� Steing ��ü�� ����");
		}else {
			System.out.println("�ٸ� Steing ��ü�� ����");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ��� ����");
		}else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}

	}

}
