package com.cg.day13.Intercommunication;

public class Q {

	int n;
	boolean valueSet = false;

	public synchronized void put (int n) { 
		if (valueSet) {
			try {
				wait();

			} catch (Exception e) { 
				System.out.println(e);
			}
		}

		this.n = n;
		valueSet = true;
		System.out.println("put: "+n);
		notify();
	}

	public synchronized void get () {

		if (!valueSet) {
			try {
				wait();
			} catch (Exception e) {

				System.out.println(e);
			}
		}
		System.out.println("Get data: "+n);
		valueSet = false;
		notify();

	}

}
