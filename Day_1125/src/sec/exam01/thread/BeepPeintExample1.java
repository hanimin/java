package sec.exam01.thread;

import java.awt.Toolkit;

public class BeepPeintExample1 {

	public static void main(String[] args) {
		Toolkit toolkit =Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			try{ Thread.sleep(500);}catch(Exception e) {}				
			}
			
			for(int i=0; i<5; i++) {
				System.out.println("µ¿");
				try{ Thread.sleep(500);}catch(Exception e) {}				
			
		}

	}
 }

