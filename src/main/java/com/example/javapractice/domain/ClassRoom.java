package com.example.javapractice.domain;


import java.util.HashMap;
import java.util.Map;

class ClassRoom {
	private Map<String, Student> students;

	public ClassRoom() {
		this.students = new HashMap<>();
	}

	public void putStudent(String studentName, Student student) {
		this.students.put(studentName, student);
	}

	public void getStudentName() {
		System.out.println(this.students.keySet());
	}

	public void getInfo(){
		for(String std : students.keySet()){
			System.out.println(this.students.get(std).showStudentInfo());
		}
	}
}