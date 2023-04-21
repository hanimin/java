package test1;

public class For_for1 {

	public static void main(String[] args) {
		System.out.println("--------------1---------------");
		String a = "";

		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
			a += '*';
			}
			a += '\n';
		}
		System.out.print(a);
		
		System.out.println("--------------2---------------");
		
		String b = "";

		for (int i = 1; i < 10; i++) {
			for (int j = 10; j > i; j--) {
			b += ' ';
			}for(int k=0;k<i;k++) {	
			b += '*';
			}
			b += '\n';
		}
		System.out.print(b);
		System.out.println("--------------3---------------");
		
		String c = "";
		
		for (int i = 1; i < 15; i++) {
			for (int j = 15; j > i; j--) {
			c += ' ';
			}for (int k = 0; k < 2 * i - 1; k++) {
			c += '*';
			}
			c += '\n';
			}
		
		System.out.print(c);
		
		System.out.println("--------------4----------------");
		
		String d = "";
		
		for (int i = 14; i > 0; i--) {
			for (int j = 15-i; j > 0; j--) {
			d += ' ';
			}for (int k = 0; k < 2 * i - 1; k++) {
			d += '*';
			}
			d += '\n';
			}
		
		System.out.print(d);
	}
	

}
