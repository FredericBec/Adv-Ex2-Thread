package fr.fms.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		Thread thread = new Thread(new MonRunnable(1000));

		System.out.println(df.format(new Date()));

		thread.start();
	}

	private static class MonRunnable implements Runnable {

		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		private long delai;

		public MonRunnable(long delai) {
			this.delai = delai;
		}

		@Override
		public void run() {
			while (true) {
				try {
					/*
					 * Calendar cal = Calendar.getInstance();
					 * hours = cal.get( Calendar.HOUR_OF_DAY
					 * ); if ( hours > 12 ) hours -= 12;
					 * minutes = cal.get( Calendar.MINUTE );
					 * seconds = cal.get( Calendar.SECOND );
					 * 
					 * SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
					 * Date date = cal.getTime();
					 * timeString = formatter.format( date );
					 */
					Thread.sleep(delai);
					System.out.println(df.format(new Date()));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}