package sec.exam01.thread;

public class ThreadA extends Thread {
	public ThreadA() {
	setName("threadA");
	}
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"�� ����� ����");
		}
	}

}
