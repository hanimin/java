
public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArry = new String[3];
		strArry[0]="Java";
		strArry[1]="Java";
		strArry[2]=new String("Java");
		
		System.out.println(strArry[0] == strArry[1]);
		System.out.println(strArry[0] == strArry[2]);
		System.out.println(strArry[0].equals(strArry[2]));

	}

}
