package com.collection;

public class MultiThreadEx extends Thread{
	String name;
	
	public MultiThreadEx(String name) {
		super(name);

	}

	public void run() {
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		MultiThreadEx mtex=new MultiThreadEx("Ranu");
		mtex.start();
		MultiThreadEx mte=new MultiThreadEx("ASDFGHJK");
		mte.start();

	}

}
