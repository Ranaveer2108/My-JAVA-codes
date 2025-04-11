package com.collection;

import com.LabActivity.Main;

public class RunnableEx implements Runnable{

	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			System.out.println("Thread");
		}
		
	}
public static void main(String[] args) {
	RunnableEx rew=new RunnableEx();
	rew.run();
}
}
