package com.example.jvp;

package com.example.jvp;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<School> schools = new ArrayList<>();


    while (true) {
      System.out.println("******************* \n 1 : 학교 추가 \n 2 : 반 추가 \n 3 : 학생 추가 \n 4 : 학생들 정보 출력 \n 5 : 퇴학 \n 0 : 종료 \n *******************");
      int keyword = sc.nextInt();

      /*
      학교 추가
       */
      if (keyword == 1) {
        System.out.println("학교명을 입력하세요");
        String schoolName = sc.next();  // 구리

        School school = new School(schoolName);
        schools.add(school);
      }
      /*
      반 추가
      */
      if (keyword == 2) {
        System.out.println("학교를 선택하세요");

        for (int i = 0; i < schools.size(); i++) {
          School school = schools.get(i);
          System.out.println(i + " : " + school.getName());
        }


        int schoolNumber = sc.nextInt();
        School school = schools.get(schoolNumber);

        System.out.println("추가할 반을 입력하세요");
        String classRoomName = sc.next();
        school.putClassRoom(classRoomName, new ClassRoom());

        school.getAllClass();
      }
      /*
      학생 추가
       */
      if (keyword == 3) {
        System.out.println("학교를 선택하세요");

        for (int i = 0; i < schools.size(); i++) {
          School school = schools.get(i);
          System.out.println(i + " : " + school.getName());
        }
        int schoolNumber = sc.nextInt();
        School school = schools.get(schoolNumber);

        System.out.println("학생을 추가할 반을 입력하세요");
        school.getAllClass();
        String className = sc.next();

        ClassRoom classRoom = school.getClasses().get(className);

        System.out.println("학생의 이름을 입력하세요");
        String studentName = sc.next();
        System.out.println("생일을 입력하세요 (ex. 2월13일 )");
        String studentBirth = sc.next();
        System.out.println("성별을 입력하세요 (ex. 남 / 여 )");
        String studentGender = sc.next();
        System.out.println("키를 입력하세요 (ex. 150 )");
        int studentHeight = sc.nextInt();
        System.out.println("몸무게를 입력하세요 (ex. 50 )");
        int studentWeight = sc.nextInt();
        classRoom.putStudent(studentName, new Student(studentName, studentBirth, studentGender, studentHeight, studentWeight));

        System.out.println("학생이 추가되었습니다");
        classRoom.getStudentName();

      }
      /*
      학생 출력
       */
      if (keyword == 4) {
        System.out.println("학교를 선택하세요");
        for (int i = 0; i < schools.size(); i++) {
          School school = schools.get(i);
          System.out.println(i + " : " + school.getName());
        }
        int schoolNumber = sc.nextInt();
        School school = schools.get(schoolNumber);

        System.out.println("학생 목록을 볼 반을 입력하세요");
        school.getAllClass();
        String className = sc.next();

        ClassRoom classRoom = school.getClasses().get(className);
        classRoom.getInfo();
      }
      /*
      퇴학
       */
      if (keyword == 5) {
        System.out.println("학교를 선택하세요");
        for (int i = 0; i < schools.size(); i++) {
          School school = schools.get(i);
          System.out.println(i + " : " + school.getName());
        }
        int schoolNumber = sc.nextInt();
        School school = schools.get(schoolNumber);

        System.out.println("반을 선택하세요");
        school.getAllClass();
        String className = sc.next();

        ClassRoom classRoom = school.getClasses().get(className);
        System.out.println("퇴학시킬 학생을 선택하세요");
        String studentName = sc.next();
        classRoom.removeStudent(studentName);


      }
      if (keyword == 0) break;
    }
  }
}