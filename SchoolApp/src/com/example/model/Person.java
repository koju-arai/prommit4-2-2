package com.example.model;

public class Person {
    private String name;
    private int age;
    
    //コンストラクタ
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    };
    //ゲッター  
    public String getName(){
        return name;
    };
    public int getAge(){
        return age;
    };
}
