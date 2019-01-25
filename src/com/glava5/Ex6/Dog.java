package com.glava5.Ex6;
public class Dog {
    void bark(){
        System.out.println("собака лает");
    }
    void bark(int bark, String name){
        System.out.println("собака по имени  " +name + " лаяла " + bark + " раз");

    }
    void bark(String name, int bark){
        System.out.println("Собака по имени " + name + " лаяла " + bark + " раз");
    }
    void bark(float howled){
        System.out.println("Собака не кушала " + howled + " дней");
    }
    void bark(char a){
        System.out.println("char");
    }
    void bark(byte b){
        System.out.println("byte!!!");
    }
    void bark(short c){
        System.out.println("short");
    }
    void bark(long D){
        System.out.println("long");
    }
    void bark(double e){
        System.out.println("double");
    }
}
