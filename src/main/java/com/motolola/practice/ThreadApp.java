package com.motolola.practice;

public class ThreadApp {
	
	public static void main(final String[] ars)
    {
		final Runner runner1 = new Runner();
		final Runner runner2 = new Runner();
		final Runner runner3 = new Runner();
		
		runner1.start();
		runner2.start();
		runner3.start();
	}

}

class Runner extends Thread
{
	
	@Override
    public void run() {
		for (int i = 0; i <=10; i++) {
			
			System.out.println("Hello number "+i);
			try {
				Thread.sleep(100);
			} catch (final InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
