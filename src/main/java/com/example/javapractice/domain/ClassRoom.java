package com.example.javapractice.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassRoom {
	private Map<String, Student> students;

	public ClassRoom() {

		this.students = new HashMap<>();
	}

	public void putStudent(String stdName, Student student) {

		this.students.put(student.putName(stdName), student);
	}

	public void showName() {
		for (String std : students.keySet()) {
			System.out.println(std);
		}
	}
	public void showInfo() {
		for (String std : students.keySet()) {
			System.out.println(std + " " + students.get(std).getNum());
		}
	}
	public int getNum(String stdName){
		return students.get(stdName).getNum();
	}

	public void removeStd(String stdName) {
		this.students.remove(stdName);
	}
}
