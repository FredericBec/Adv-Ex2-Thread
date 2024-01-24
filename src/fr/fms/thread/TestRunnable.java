package fr.fms.thread;

public class TestRunnable implements Runnable{

	@Override
	public void run() {
		
		char specChar = 33;
		
		for(int i = 0; i < 10; i++) {
			System.out.print(specChar);
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print(specChar);
			System.out.println("");
			specChar++;
		}
	}
	public static void main(String[] args) {
	
		Thread thread = new Thread(new TestRunnable());
		
		thread.start();

	}

}
