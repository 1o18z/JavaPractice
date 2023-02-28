package com.example.jvp;

import java.util.*;

import com.example.jvp.ClassRoom;
import com.example.jvp.Student;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<School> schools = new ArrayList<>();


    while (true) {
      System.out.println("******************* \n 1 : 학교 추가 \n 2 : 반 추가 \n 3 : 학생 출력 \n 4 : 학생 이동 \n 5 : 반 삭제 \n 0 : 종료 \n *******************");
      int keyword = sc.nextInt();

      /*
      학교 추가
       */
      if (keyword == 1) {
        System.out.println("학교명을 입력하세요");
        String schoolName = sc.next();  // 토평

        School school = new School();
        school.putSchool(schoolName, new ClassRoom());
        schools.add(school);

        school.getSchoolName();
        for (School sch : schools) {
          System.out.println(schools.indexOf(sch) + " : " + sch.getName());
        }
      }

      /*
      반 추가
      */
      if (keyword == 2) {
        System.out.println("학교를 입력하고 반을 추가하세요");

        for (School sch : schools) {
          System.out.println(schools.indexOf(sch) + " : " + sch.getName());
        }

        String schoolName = sc.next();
        System.out.println(schoolName + "에 추가할 반을 입력하세요");

        School school = new School();
        int classNumber = sc.nextInt();

        EachClassRoom eachClassRoom = new EachClassRoom();
        eachClassRoom.putEachClass(classNumber, new Student());  // 여기가 문제구나
        System.out.println("반은 추가돼써");
        ClassRoom classroom = school.getClasses().get(schoolName);
        classroom.putClass(eachClassRoom);

//        System.out.println(new ClassRoom().getStudents());

      }
      if (keyword == 0) break;
    }
  }
}

public class ClassRoom {
  private List<EachClassRoom> students;

  public List<EachClassRoom> getStudents() {
    return students;
  }
  public ClassRoom() {}

  public ClassRoom(List<EachClassRoom> students) {
    this.students = students;
  }
  public void putClass(EachClassRoom eachClass){
    this.students.add(eachClass);
  }
}

public class EachClassRoom {
  private Map<Integer, Student> eachClass;

  public Map<Integer, Student> getEachClass() {
    return eachClass;
  }

  public EachClassRoom(){}

  public EachClassRoom(Map<Integer, Student> eachClass) {
    this.eachClass = eachClass;
  }

  public void putEachClass(int classNumber, Student student){

    this.eachClass.put(classNumber, student);
  }
}

public class Student {

  private Map<String, Integer> std;

  public Map<String, Integer> getStd() {
    return std;
  }

  public Student (){}
  public Student(Map<String, Integer> std) {
    this.std = std;
  }
}

public class School {
  private Map<String, ClassRoom> classes;

  public Map<String, ClassRoom> getClasses() {
    return this.classes;
  }

  public School() {
    this.classes = new HashMap<>();
  }

  public Set<String> getName() {
    return classes.keySet();
  }

  public void putSchool(String schoolName, ClassRoom classroom) {
    this.classes.put(schoolName, classroom);
  }

  public void getSchoolName() {
    for (String sch : classes.keySet()) {
      System.out.println(sch);
    }
  }
}
