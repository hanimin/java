package sec02.exam02;

public class Anonymous {
	RemoteControl field =new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
					
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
			
		}
	};
	
	void method1() {
		RemoteControl localVal = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
				
			}
		};
		
		localVal.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
