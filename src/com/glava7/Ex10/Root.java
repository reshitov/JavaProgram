package com.glava7.Ex10;
class Component1{
    Component1(int i){
        System.out.println("конструктор Component1");
    }
}
class Component2{
    Component2(int i){
        System.out.println("конструктор Component2");
    }
}
class Component3{
    Component3(int i){
        System.out.println("конструктор Component3");
    }
}

public class Root {
    Root(int i){
        System.out.println("Конструктор Root");
    }
Component1 x1 = new Component1(1);
Component2 x2 = new Component2(2);
Component3 x3 = new Component3(3);
}
class Stem extends Root{
    Component1 x1 = new Component1(1);
    Component2 x2 = new Component2(2);
    Component3 x3 = new Component3(3);
    Stem(int i){
        super(99);
        System.out.println("Конструктор Stem");
    }
}
