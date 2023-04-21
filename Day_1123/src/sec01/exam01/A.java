package sec01.exam01;

class A {
	A(){System.out.println("A按眉啊 积己凳");}
	
	class B {
		B(){System.out.println("B按眉啊 积己凳");}
		int filed1;
		//static int fileld2 //沥利糕滚 救壩
		void method1() {}
		//static void method2(){}
	}
	static class C {
		C(){System.out.println("C按眉啊 积己凳");}
		int filed1;
		static int fileld2; 
		void method1() {}
		static void method2(){}		
	}
	void method() {
		class D {
			D(){System.out.println("D按眉啊 积己凳");}
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
