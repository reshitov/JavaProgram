package com.glava7.Ex2;

public class Detegrent extends Ex2 {
    public void scrub() {
        append(" Detergent.scrub");
        super.scrub();
    }

    public void foam() {
        append("foam()");
    }

//    public static void main(String[] args) {
//        Detegrent x = new Detegrent();
//        x.dilute();
//        x.apply();
//        x.scrub();
//        x.foam();
//        System.out.println(x);
//        System.out.println("Проверяем базовый класс");
//        Ex2.main(args);
//    }
}
