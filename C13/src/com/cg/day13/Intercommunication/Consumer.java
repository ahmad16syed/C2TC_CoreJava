package com.cg.day13.Intercommunication;

public class Consumer extends Thread{

	Q obj;

	public Consumer (Q obj) {

		this.obj = obj;

		start();
	}

	public void run() {

		int i = 0;

		while (true) {

			try {

				Thread.sleep(3000);

			} catch (InterruptedException e) {

				System.out.println(e);
			}

			obj.put(i);

			i++;
		}

	}

}
