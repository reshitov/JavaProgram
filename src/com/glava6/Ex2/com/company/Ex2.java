package com.glava6.Ex2.com.company;

import com.glava6.Ex2.simple.Vector;

public class Ex2 {

    public void getDescription2() {
        System.out.println("Задание 2!");
        System.out.println("Описание2");
        System.out.println("Преобразуйте фрагменты из этого раздела в программу.\n" +
                "Убедитесь в том, что конфликты имен действительно возникают");
    }
    public  void makeEx2() {
        System.out.println("Результат выполнения упражнения");
        java.util.Vector v1 = new java.util.Vector();
        Vector v2 = new Vector();
    }

    public void getCode2() {
        System.out.println("List.java: ");
        System.out.println("package  com.glava6.Ex2.simple;\n" +
                "\n" +
                "public class List {\n" +
                "    public List (){\n" +
                "        System.out.println(\"List\");\n" +
                "    }\n" +
                "}\n");
        System.out.println("Vector.java");
        System.out.println("package com.glava6.Ex2.simple;\n" +
                "\n" +
                "public class Vector {\n" +
                "    public Vector(){\n" +
                "        System.out.println(\"Vector\");\n" +
                "    }\n" +
                "}\n");
        System.out.println("Ex2.java: ");
        System.out.println("package com.glava6.Ex2.com.company;\n" +
                "\n" +
                "import com.glava6.Ex2.simple.Vector;\n" +
                "\n" +
                "public class Ex2 {\n" +
                "\n" +
                "    public  void makeEx2() {\n" +
                "        java.util.Vector v1 = new java.util.Vector();\n" +
                "        Vector v2 = new Vector();\n" +
                "    }\n" +
                "    }");
    }
}
