package test1;

public class For_for4 {

	public static void main(String[] args) {
		String a = "";
		
		for (int i = 15; i > 0; i--) {
			for (int j = 15-i; j > 0; j--) {
			a += ' ';
			}for (int k = 0; k < 2 * i - 1; k++) {
			a += '*';
			}
			a += '\n';
			}
		
		System.out.print(a);
	}

}
