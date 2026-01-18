package com.example.model;

public class Student extends Person{
    //フィールド
    private String cls;
    private int num;
   
    //コンストラクタ
    public Student(String name, int age, String cls, int num){
        super(name, age);
        this.cls = cls;
        this.num = num;
    };
    
    //ゲッター
    public String getCls(){
        return cls;
    };
    public int getNum(){
        return num;
    };
}
