package com.glava2.exersice8;

public class Ex8 {

    public void getDescription8() {
        System.out.println("Задание 8!");
        System.out.println("Описание8: ");
        System.out.println("Напишите программу, которая демонстрирует, что независимо\n" +
                " от количества созданных объектов класс\n" +
                " содержит только один экземпляр поля static.");
    }

    public void makeEx8() {
        System.out.println("Результат выполнения упражнения 8");
        TestClass testClass = new TestClass();
        testClass.ex8();
    }

    public void getCode8() {
        System.out.println("TestClass: ");
        System.out.println("public class TestClass {\n" +
                "    static int a =0;\n" +
                "    public void ex8(){\n" +
                "        TestClass object1 = new TestClass();\n" +
                "        TestClass object2 = new TestClass();\n" +
                "        System.out.println(object1.a+object2.a);\n" +
                "\n" +
                "        object1.a+=5;\n" +
                "\n" +
                "        System.out.println(object1.a+object2.a);\n" +
                "    }\n" +
                "}");
        System.out.println("Ex8: ");
        System.out.println("public class Ex8 {\n" +
                "    public void makeEx8() {\n" +
                "        System.out.println(\"Результат выполнения упражнения 8\");\n" +
                "        TestClass testClass = new TestClass();\n" +
                "        testClass.ex8();\n" +
                "    }\n" +
                "}");
    }
}
