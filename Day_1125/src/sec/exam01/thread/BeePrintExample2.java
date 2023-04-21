package sec.exam01.thread;

public class BeePrintExample2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("µ¿");
			try{ Thread.sleep(500);}catch(Exception e) {}				
		}

	}

}
