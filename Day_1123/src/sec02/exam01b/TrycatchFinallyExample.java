package sec02.exam01b;

public class TrycatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz =Class.forName("java.long.String2");			
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
