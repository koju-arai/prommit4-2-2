package com.example.model;

public class Teacher extends Person {
    //フィールド
    private String subject;
    
    //コンストラクタ
    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    
    //ゲッター
    public String getSubject(){
        return subject;
    }; 
}
