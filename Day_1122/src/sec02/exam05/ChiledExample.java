package sec02.exam05;

public class ChiledExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 ="data1";
		parent.metod1();
		parent.metod2();
	
		/*
		 * parent.field2 = "data2"; //�Ұ���
		 *parent.method(); //�Ұ��� 
		 *
		 */
		
		Child child = (Child) parent;
		child.field2 ="yyy"; //(����)
		child.metgod3();//(����)
				

	}

}
