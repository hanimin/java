package sec01.exam02.thread;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		Toolkit toolkit =Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			System.out.print("��");
		}try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
	}

}
