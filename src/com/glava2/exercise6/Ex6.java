package com.glava2.exercise6;

public class Ex6 {

    public void getDescription6() {
        System.out.println("Задание 6!");
        System.out.println("Описание6: ");
        System.out.println("Напишите программу включающую метод storage(),\n приведенный ранее в этой главе.");
    }

    public void makeEx6() {
        System.out.println("Результат выполнения упражнения 6");
        SomeClass someClass = new SomeClass();
        System.out.println(someClass.storage("server"));
    }

    public void getCode6() {
        System.out.println("SomeClass.java: ");
        System.out.println("public class SomeClass {\n" +
                "    public int storage(String s){\n" +
                "\n" +
                "        return  s.length()*2;\n" +
                "    }\n" +
                "}");
        System.out.println("Ex6.java: ");
        System.out.println("public class Ex6 {\n" +
                "    public void makeEx6() {\n" +
                "        System.out.println(\"Результат выполнения упражнения 6\");\n" +
                "        SomeClass someClass = new SomeClass();\n" +
                "        System.out.println(someClass.storage(\"server\"));\n" +
                "    }\n" +
                "}");
    }
}
