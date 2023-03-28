/**
 * super() 호출시 반드시 첫줄에 있어야함 
 */

package com.javalab.inheritance.exam01;

public class Child extends Parent {

	public String address;
	public String phone;

	// 기본 생성자
	public Child() {
		super(); // 첫줄에서 부모 객체 기본 생성자 호출 , 코드를 작성하지않으면 자동으로 채워짐
	}

	// 오버로딩 생성자
	public Child(String address) {
		super("김길동", 29); // 부모필드 초기화
		this.address = address; // 자기 필드 초기화
		System.out.println("자식 객체의 생성자1");
	}

	public Child(String address, String phone) {
		this.address = address;
		this.phone = phone;
		System.out.println("자식 객체의 생성자2");
	}
}