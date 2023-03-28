package com.javalab.inheritance.exam03.pkg01;

public class SmartPhone extends Phone {

	// 필드 선언
	public String frequency; // 주파수

	// 생성자 구현	
	public SmartPhone() {
		super();
	}

	public SmartPhone(String model, String color) {
		super(model, color);
	
	}

	public SmartPhone(String model, String color, String frequency) {
		super(model, color);
		this.frequency = frequency;
	}
	
	// showSmartPhoneInfo
	public void showSmartPhoneIfo() {
		this.phoneInfo(); // 부모의 정보를 조회하는 메소드 호출(this사용)
		System.out.println("[Smartphone Info]");
		System.out.println("frequency : " + frequency);// 자신의 필드 정보 조회
	}
}