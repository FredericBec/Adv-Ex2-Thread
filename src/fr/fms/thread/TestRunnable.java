package fr.fms.thread;

import java.util.ArrayList;

public class TestRunnable implements Runnable{

	@Override
	public void run() {
		ArrayList<String> stars = new ArrayList<String>();
		stars.add("!*!");
		stars.add("\"**\"");
		stars.add("#***#");
		stars.add("$****$");
		stars.add("%*****%");
		stars.add("&******&");
		stars.add("'*******'");
		stars.add("(********(");
		stars.add(")*********)");
		stars.add("************");
		
		stars.stream().forEach(System.out::println);
	}
	public static void main(String[] args) {
	
		Thread thread = new Thread(new TestRunnable());
		
		thread.start();

	}

}
