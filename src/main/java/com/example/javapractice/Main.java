package com.example.javapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Student> stdArr = new ArrayList<>();
    ArrayList<Classroom> classArr = new ArrayList<>();
    while (true) {

      System.out.println(" ☀︎ 1 : 교실 추가 \n ☀︎ 2 : 학생 추가 \n ☀︎ 3 : 학생 목록 \n ☀︎ 0 : 종료");
      int N = Integer.parseInt(br.readLine());

      if (N == 1) {
        System.out.println("교실을 입력하세요");
        String room = br.readLine();
        Classroom classroom = new Classroom(room);

        classArr.add(classroom);
        System.out.println("교실이 추가되었습니다");
      }

      if (N == 2) {
        System.out.println("학생 이름을 입력하세요");
        String name = br.readLine();
        System.out.println("학생 전화번호를 입력하세요");
        String number = br.readLine();

        Student student = new Student(name, number);
        stdArr.add(student);
        System.out.println("학생이 추가되었습니다");

      }

      if (N == 3) {
        if (classArr.size() == 0) {
          System.out.println("교실을 먼저 추가하세요❗️");
        } else {
          if (classArr.size() == 1) {
            System.out.println(stdArr);
          }
          if (classArr.size() > 1) {
            System.out.println("학생 목록을 볼 교실을 선택하세요");

            for (Classroom i : classArr) {
              System.out.println(classArr.indexOf(i) + " : " + i);
            }

            int idxClass = Integer.parseInt(br.readLine());

          }
        }
      }
    }
  }
}

class Student {
  String name = "이름";
  String number = "전화번호";

  Student(String name, String number) {
    this.name = name;
    this.number = number;
  }

  public void AddStudent() {

  }
}

class Classroom {
  String room;

  Classroom(String room) {
    this.room = room;
  }
}
