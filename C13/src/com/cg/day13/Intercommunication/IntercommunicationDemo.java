package com.cg.day13.Intercommunication;

public class IntercommunicationDemo {

	public static void main(String[] args) {

		//Shared Resource

		Q obj = new Q();

		Producer p = new Producer (obj); //Producer Thread

		Consumer c = new Consumer (obj); //Consumer Thread

		try {

			p.join();

			c.join();

		} catch (InterruptedException e) { 
			System.out.println(e);

		}

	}

}
