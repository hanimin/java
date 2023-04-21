package test1;

public class For_for5 {

	public static void main(String[] args) {
		System.out.println("--------------1---------------");
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		System.out.println("--------------2---------------");
		for (int i = 1; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print(" ");
			}for(int k=0;k<i;k++) {	
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------3---------------");
		for (int i = 1; i < 15; i++) {
			for (int j = 15; j > i; j--) {
				System.out.print(" ");
			}for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
			}		
		System.out.println("--------------4----------------");	
		for (int i = 14; i > 0; i--) {
			for (int j = 15-i; j > 0; j--) {
				System.out.print(" ");
			}for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
			}

	}

}


