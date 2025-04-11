package com.collection;
import java.util.Stack;
public class StackEx {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("Jan");
		stack.push("feb");
		stack.push("mar");
		stack.push("apr");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
	}

}
