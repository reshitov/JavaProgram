package com.glava7.Ex2;

public class Test extends Detegrent {
    public void scrub(){append("Test.scrub()");}
    public void sterilize(){append("sterilize()");}
    public static void main (String[] args){
        Test x = new Test();
        x.dilute();
        x.scrub();
        x.foam();
        x.apply();
        x.sterilize();
        System.out.println(x);
        System.out.println("базовый класс2");

    }
}
