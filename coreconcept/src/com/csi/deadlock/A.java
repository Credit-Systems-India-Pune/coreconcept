package com.csi.deadlock;

public class A {
	public static void main(String[] args) {
		final String r1 = "resource1";
		final String r2 = "resource2";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (r1) {
					System.out.println("thraed 1:r1 is lockedd");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (r2) {
						System.out.println("thraed1:r2 is locked");
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (r2) {
					System.out.println("thraed 2:r2 is lockedd");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (r1) {
						
					System.out.println("thraed 2:r1 is locked");
					}
				}
			}

		};
		
		t1.start();
		t2.start();
	}
}