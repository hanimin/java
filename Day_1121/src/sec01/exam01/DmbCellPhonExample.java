package sec01.exam01;

public class DmbCellPhonExample {

	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",10);  
		
		//CellPhone���κ��� ��� ���� �ʵ�
		System.out.println("��: "+dmbCellPhone.model);
		System.out.println("����: "+dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��: "+dmbCellPhone.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUP();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
