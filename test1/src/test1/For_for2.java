package test1;

public class For_for2 {

	public static void main(String[] args) {
		String a = "";

		for (int i = 1; i < 10; i++) {
			for (int j = 10; j > i; j--) {
			a += '*';
			}
			a += '\n';
		}
		System.out.print(a);
	}

}
