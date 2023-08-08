package com.cg.day12.MultiThreading;

public class ChildThreadDemo {

	public static void main(String[] args) {

		ChildThread ct = new ChildThread();
		ct.start();
		
		 // Code running in the main thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(1000); // Pause the main thread for 1 second
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
		
	}

}
