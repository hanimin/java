package sec01.exam01;

class A {
	A(){System.out.println("A��ü�� ������");}
	
	class B {
		B(){System.out.println("B��ü�� ������");}
		int filed1;
		//static int fileld2 //������� �ȉ�
		void method1() {}
		//static void method2(){}
	}
	static class C {
		C(){System.out.println("C��ü�� ������");}
		int filed1;
		static int fileld2; 
		void method1() {}
		static void method2(){}		
	}
	void method() {
		class D {
			D(){System.out.println("D��ü�� ������");}
			int filed1;
			//static int fileld2 
			void method1() {}
			//static void method2(){}
		}
		D d =new D();
		d.filed1 =3;
		d.method1();
	}	

}
