package sec01.exam14.string;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		char sex =ssn.charAt(7);
		switch(sex) {
		case '1' :
		case '3' :
			System.out.println("남자 입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("여자 입니다.");
			break;
		case '5' :
		case '7' :
			System.out.println("외국인 남자 입니다.");
			break;
		case '6' :
		case '8' :
			System.out.println("외국인 여자 입니다.");
			break;
		case '9' :
		case '0' :
			System.out.println("할당된 번호가 아닙니다.");
			break;
			
		}

	}

}
