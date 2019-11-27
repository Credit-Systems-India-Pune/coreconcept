package com.csi.multithreading;

public class A extends Thread {
	public void run() {
		int i;
		for (i = 1; i <= 3; i++) {
			try {
				Thread.sleep(5000);
				System.out.println("thraed is running");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		A a = new A();
		a.start();
		//a.start();//illegalThreadStateException
		
		// A a1 = new A();
		// a1.start();
		// A a2 = new A();
		// a2.start();
	}

}
