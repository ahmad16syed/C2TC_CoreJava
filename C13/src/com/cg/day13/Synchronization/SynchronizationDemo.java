package com.cg.day13.Synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {

		Account a1 = new Account(6005,"Ahmad",50000);
		System.out.println(a1);
		
		// 5 account thread running in parallel
		AccountThread t[] = new AccountThread[5];
		for (int i = 0; i < 5; i++) {
			t[i] = new AccountThread(a1, 10000*(i+1));
			try {
				t[i].join();// waits main thread until all child threads are executed
			} catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
		}
		
		System.out.println("--------------------");
		System.out.println(a1);
	}

}
