package com.cg.day12.MultiThreading;

public class ChildThread extends Thread{

	@Override
    public void run() {
		
        // Code to be executed in the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); // Pause the thread for 1 second
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        
    }
	
}
