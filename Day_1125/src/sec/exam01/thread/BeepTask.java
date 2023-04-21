package sec.exam01.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	public void run() {
		Toolkit toolkit =Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			try{ Thread.sleep(500);}catch(Exception e) {				
			}
	}

  }
}
