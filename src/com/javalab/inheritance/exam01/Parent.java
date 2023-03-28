package com.javalab.inheritance.exam01;

// 부모 클래스
public class Parent {

	// 필드
	public String name;
	public int age;
	
	// 기본 생성자
	public  Parent() {
		System.out.println("여기는 부모 객체의 기본 생성자");
	}
	
	// 오버로딩 생성자
	public  Parent(String name, int age) {
		System.out.println("여기는 부모 객체의 오버로딩 생성자");
		this.name = name;
		this.age = age;
	}
}