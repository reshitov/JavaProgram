package com.glava2.exercise7;

public class Ex7 {
    public void getDescription7() {
        System.out.println("Задание 7!");
        System.out.println("Описание7: ");
        System.out.println("Превратите фрагмент кода с классом Incrementable в работающую программу.");
    }

    public void makeEx7() {
        System.out.println("Результат выполнения упражнения 7");
        Incrementable.increment();
    }

    public void getCode7() {
        System.out.println("Incrementable.java: ");
        System.out.println("package com.glava2.exercise7;\n" +
                "\n" +
                "//Упражнение 7\n" +
                "public class Incrementable {\n" +
                "\n" +
                "   public static void increment(){\n" +
                "        StaticTest.i++;\n" +
                "        System.out.println(StaticTest.i);\n" +
                "\n" +
                "    }\n" +
                "}");
        System.out.println("StaticTest.java: ");
        System.out.println("package com.glava2.exercise7;\n" +
                "\n" +
                " class StaticTest {\n" +
                "    static int i = 1;\n" +
                "}");
        System.out.println("Ex7: ");
        System.out.println("public class Ex7 {\n" +
                "    public void makeEx7() {\n" +
                "        System.out.println(\"Результат выполнения упражнения 7\");\n" +
                "        Incrementable.increment();\n" +
                "    }\n" +
                "}");
    }
}
