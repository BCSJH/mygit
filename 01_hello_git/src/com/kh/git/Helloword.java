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
		
		System.out.println("Lucky you~"); // #master 추가
		
		new MergeTest().mergeMe();
	}
	/*
	* 원격 저장소에서 수정된 내용
	*/
	public void hello(){
		System.out.println("저를 fetch해주세요.");
	}
}
