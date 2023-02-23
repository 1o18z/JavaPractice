package com.example.javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.example.javapractice.domain.ClassRoom;
import com.example.javapractice.domain.Student;

public class Main2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Integer, ClassRoom> map = new HashMap<>();
//    Map<String, String> stdMap = new HashMap<>();

    while (true) {
      System.out.println("1 : 반 추가 | 2 : 학생 추가 | 3 : 학생 출력 | 4 : 학생 이동 | 5 : 반 삭제 | 0 : 종료");
      int keyword = sc.nextInt();

      /*
      교실 추가
       */
      if (keyword == 1) {
        System.out.println("반을 입력하세요");
        int roomNumber = sc.nextInt();
        map.put(roomNumber, new ClassRoom());
      }

      /*
      학생 추가
       */
      if (keyword == 2) {
        System.out.println("추가할 반을 선택하세요");
        for (Integer number : map.keySet()) {
          System.out.println(number);
        }
        int roomNumber = sc.nextInt();

        System.out.println("학생의 이름과 번호를 입력하세요");
        String name = sc.next();
        int phone = sc.nextInt();

        ClassRoom classRoom = map.get(roomNumber);
        classRoom.putStudent(name, new Student(name, phone));
      }

      /*
      학생 목록
       */
      if (keyword == 3) {
        System.out.println("목록을 볼 반을 선택하세요");
        for (Integer number : map.keySet()) {
          System.out.println(number);
        }
        int roomNumber = sc.nextInt();
        ClassRoom classRoom = map.get(roomNumber);

        System.out.println("1 : 이름 | 2 : 이름, 번호");
        int showStdInfo = sc.nextInt();
        if(showStdInfo == 1){
          classRoom.showName();
        }
        if(showStdInfo == 2){
          classRoom.showInfo();
        }
      }

      /*
      학생 반 이동
       */
      if (keyword == 4) {
        System.out.println("이동할 학생의 현재 반을 선택하세요 ");

        for (Integer number : map.keySet()) {
          System.out.println(number);
        }
        int roomNumber = sc.nextInt();
        System.out.println("이동할 학생을 선택하세요");
        ClassRoom classRoom = map.get(roomNumber);
        classRoom.showName();

        String stdName = sc.next();

        System.out.println("이동 원하는 반을 선택하세요 ");

        for (Integer number : map.keySet()) {
          System.out.println(number);
        }
        int roomMove = sc.nextInt();
        ClassRoom moveClassRoom = map.get(roomMove);
        moveClassRoom.putStudent(stdName, new Student(stdName, classRoom.getNum(stdName)));

        classRoom.removeStd(stdName);
      }
      if(keyword == 5){
        System.out.println("삭제할 반을 선택하세요");

        for(Integer number : map.keySet()){
          System.out.println(number);
        }
        int roomNumber = sc.nextInt();
        ClassRoom classRoom = map.remove(roomNumber);
        System.out.println("반이 삭제되었습니다");
      }

      if (keyword == 0) break;
    }
  }
}
