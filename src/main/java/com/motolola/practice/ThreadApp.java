package com.motolola.practice;

public class ThreadApp {
	
	public static void main(String[] ars) {
		Runner runner1 = new Runner();
		Runner runner2 = new Runner();
		
		runner1.start();
		runner2.start();
		
		
	}

}

class Runner extends Thread {
	
	public void run() {
		for (int i = 0; i <=10; i++) {
			
			System.out.println("Hello number "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
