package com.csi.multithreading;

public class B implements Runnable {

	@Override
	public void run() {
		int i;
		for(i=1;i<=3;i++){
			try {
				Thread.sleep(5000);
				System.out.println("running");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}}

	public static void main(String[] args) {

		B b = new B();
		Thread t = new Thread(b);
		t.start();
	}

}
