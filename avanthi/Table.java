package com.avanthi;

public class Table {
	public static void printTable(int num) {
		int i=1;
		while(i<=10) {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
	}
public static void main(String[] args) {
	Table t=new Table();
	t.printTable(9);
}
}
