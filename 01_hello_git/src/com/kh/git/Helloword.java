package com.kh.git;

import com.kh.animal.*;
import com.kh.foo.Foo;

public class Helloword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world~");
		System.out.println("Hello git~");
		System.out.println("Good luck~");

		new Foo().sayFoo();
		
		new Dog().say();
		new Cat().say();
		
		System.out.println("Lucky you~"); // #mast 체서 추가
	}

}
