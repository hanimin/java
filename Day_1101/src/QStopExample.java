
public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true){
			keyCode =System.in.read();
			System.out.println("keyCode : " +keyCode);
			if(keyCode == 113) {
				break;	//keyCode가 113가 동일한 경우 실행
			}
		}
		System.out.println("종료");
	}

}
