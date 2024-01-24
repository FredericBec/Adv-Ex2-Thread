package fr.fms.thread;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class ThreadTime {

	public static void main(String[] args) {
		Thread thread = new Thread(new MonRunnable(1000));


		thread.start();
	}

	private static class MonRunnable implements Runnable {
		
		private long delai;

		public MonRunnable(long delai) {
			this.delai = delai;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Date date = Calendar.getInstance().getTime();
					
					SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
					String timeString = formatter.format(date);
					System.out.print("\r" + timeString);
					
					Thread.sleep(delai);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}