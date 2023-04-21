package sec01.exam08;

import sec01.exam02.Car;

public class ClassExample {

	public static void main(String[] args)  throws Exception{
		//规过1
		Class clazz = Car.class;
		//规过2
		Class blazz= Class.forName("sec01.exam08.Car");
		//规过3
		Car car = new Car();
		Class dlazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		
		System.out.println("-----------------------");
		
		System.out.println(blazz.getName());
		System.out.println(blazz.getSimpleName());
		System.out.println(blazz.getPackage().getName());
		
		System.out.println("-----------------------");
		
		System.out.println(dlazz.getName());
		System.out.println(dlazz.getSimpleName());
		System.out.println(dlazz.getPackage().getName());

	}

}
