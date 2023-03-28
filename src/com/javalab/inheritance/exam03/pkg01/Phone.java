package com.javalab.inheritance.exam03.pkg01;

public class Phone extends Object {

	// 필드 선언
	public String model;
	public String color;

	// 생성자 선언
	public Phone(){
		super(); // 최고 조상 Object 상속
	}
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// phoneInfo() 메소드 구현
	public void phoneInfo() {
		System.out.println("[Phone Info]");
		System.out.println("model : " + model);
		System.out.println("color : " + color);
	}
}