package VectorandStack;

import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
		Stack <Double> d = new Stack<Double> ();
		d.push(100.92);
		d.push(200.929);
		d.push(29.99);
		d.push(2.29);
		System.out.println(d);
		d.pop();
		System.out.println(d);
		System.out.println(d.peek());
		System.out.println(d.pop()
				);
		System.out.println(d);
	}
	}