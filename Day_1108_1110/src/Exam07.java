import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		boolean run =true;
		
		int blance =0 ;
		Scanner scanner =new Scanner(System.in);

		while(run){
			System.out.println("-------------------");
			System.out.println("1.����|2.���|�ܰ�|4.����");
			System.out.println("-------------------");
			System.out.println("����>");
			
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch(menuNum) {
			case 1:
				System.out.print("���ݾ�>");
				blance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("��ݾ�>");
				blance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("�ܰ�>");
				System.out.println(blance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("���α׷� ����");
	}

}
