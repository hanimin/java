package sec01.exam06;

public class SportsCarExample {

	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		System.out.println("현재속도 :" + sc.speed);
		sc.speedUp();
		System.out.println("현재속도 :" + sc.speed);
		sc.stop();
		

	}

}
