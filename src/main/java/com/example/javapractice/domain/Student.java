package com.example.javapractice.domain;

public class Student {
	private String name;
	private int number;

	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String putName(String name){
		return this.name;
	}
	public int getNum() {
		return this.number;
	}
}
