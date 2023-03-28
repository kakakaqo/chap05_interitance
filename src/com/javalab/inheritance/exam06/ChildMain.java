package com.javalab.inheritance.exam06;

public class ChildMain {

	public static void main(String[] args) {

		// 자식 객체생성
		Child child = new Child();
		
		// 부모 타입으로 자동 타입 반환
		Parent parent = child;
		
		// 메소드 호출
		parent.method1();
		parent.method2(); // 부모, 자식 동시에 존재 -> 자식꺼 호출(자식이 오버라이딩)
		//Parent.method3(); // (호출 불가능)
	}

}