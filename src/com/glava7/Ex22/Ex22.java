package com.glava7.Ex22;
class SmallBrain {}

final class Dinosaur {
    SmallBrain x = new SmallBrain();
}
public class Ex22 {

    public void getDescription22() {
        System.out.println("Задание 22!");

        System.out.println("Описание");

        System.out.println("Создайте неизменный (final) класс и попытайтесь создать \n" +
                "класс, производный от него");
    }

    public  void makeEx22 () {
        System.out.println("Результат выполнения упражнения");
        Dinosaur ex18 = new Dinosaur();
    }

    public void getCode22() {
        System.out.println("Ex22.java: ");
        System.out.println("package com.glava7.Ex22;\n" +
                "class SmallBrain {}\n" +
                "\n" +
                "final class Dinosaur {\n" +
                "    SmallBrain x = new SmallBrain();\n" +
                "}\n" +
                "class Ex22 {\n" +
                "\n" +
                "    public  void makeEx22 () {\n" +
                "        Dinosaur ex18 = new Dinosaur();\n" +
                "    }\n" +
                "    }");
    }
}

