package sec.exam01.thread;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit =Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			System.out.println("µ¿");
			try{ Thread.sleep(500);}catch(Exception e) {}				
		}
	}

}
