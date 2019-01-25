package com.glava8.Ex2;

public class Triangle extends Shape {
    @Override
    public void draw(){
        System.out.println("Triangle.Draw");
    }
    @Override
    public void erase(){
        System.out.println("Triangle.erase");
    }
}
