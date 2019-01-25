package com.glava2.exercise4and5;

public class Ex4 {

    public void getDescription4() {
        System.out.println("Задание 4!");
        System.out.println("Описание4: ");
        System.out.println("Сделайте тоже самое для класса DataOnly.");
    }

    public void makeEx4() {
        System.out.println("Результат выполнения упражнения");
        DataOnly dataOnly = new DataOnly();
        dataOnly.vivod();
    }

    public void getCode4() {
        System.out.println("DataOnly.java: ");
        System.out.println("public class DataOnly {\n" +
                "    int i;\n" +
                "    double d;\n" +
                "    boolean b;\n" +
                "    public void vivod(){\n" +
                "        i = 5;\n" +
                "        d = 6;\n" +
                "        b = true;\n" +
                "        System.out.println(i);\n" +
                "        System.out.println(d);\n" +
                "        System.out.println(b);\n" +
                "    }\n" +
                "}");
        System.out.println("Ex4.java: ");
        System.out.println("public class Ex4 {\n" +
                "    public void makeEx4() {\n" +
                "        DataOnly dataOnly = new DataOnly();\n" +
                "        dataOnly.vivod();\n" +
                "    }\n" +
                "}");
    }
}
