/**
 * 오버라이딩 예제
 * 자식 클래스
 */

package com.javalab.inheritance.exam04;

public class Child extends Parent {

	int x = 200;

	// 메소드 오버라이딩(부모의 메소드를 다시 정의함)
	@Override // 어노테이션 메타데이터     오버라이딩 한곳 위에 선언   부모와 똑같은지 체크해줌 
	void display2() { 
		System.out.println("Child display2()");
	}

	// 자식이 새롭게 추가한 메소드
	void dispaly3() {
		System.out.println("Child display3()");
	}


}