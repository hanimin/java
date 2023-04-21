package test1;

public class For_for3 {

	public static void main(String[] args) {
		String a = "";
		
		for (int i = 1; i < 15; i++) {
			for (int j = 15; j > i; j--) {
			a += ' ';
			}for (int k = 0; k < 2 * i - 1; k++) {
			a += '*';
			}
			a += '\n';
			}
		
		System.out.print(a);
	}

}
