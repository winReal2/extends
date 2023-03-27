package com.kh.inherit.pracfice;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {
		
	}
	public Student(String name, int age, 
			double height, double weight, int grade, String major) {
		// 부모의 생성자를 호출합니다
		super(age, height, weight);
		// super.age;  는 접근제한자라 접근이 불가
		// protected : 패키지가 달라도 부모자식 관계면 접근가능
		super.name = name; 
		this.grade = grade;
		this.major = major;
	}
	
}
