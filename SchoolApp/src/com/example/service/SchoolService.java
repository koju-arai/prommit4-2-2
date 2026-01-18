package com.example.service;
import com.example.model.Student;
import com.example.model.Teacher;
import java.util.ArrayList;

public class SchoolService {
    private ArrayList<Student> std =  new ArrayList<>();
    private ArrayList<Teacher> tch =  new ArrayList<>();

    public void addStudent(Student student){
        if(student.getAge() < 10){
            System.out.println(student.getName() + "さんは10歳以下です");
        }else{
            std.add(student);
        }
        
    }
    public void addTeacher(Teacher teacher){
        if(teacher.getAge() < 10){
            System.out.println(teacher.getName() + "さんは10歳以下です");
        }else{
            tch.add(teacher);
        }
    }

    public void outputList(){
        for(Student student : std){
            System.out.println("名前：" + student.getName() + ", 年齢：" + student.getAge() + ", クラス：" + student.getCls() + ", 出席番号：" + student.getNum() + ", 生徒");
        }
        for(Teacher teacher : tch){
            System.out.println("名前：" + teacher.getName() + ", 年齢：" + teacher.getAge() + ", 指導科目：" + teacher.getSubject() + ", 教師");
        }
    }

}
