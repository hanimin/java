package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		A a= new A();
		
		A.B b =a.new B();
			b.filed1 =3;
			b.method1();

		A.C c =new A.C();
		c.filed1 =3;
		c.method1();
		A.C.fileld2 =3;
		A.C.method2();
		
		a.method();
			
	}

}
