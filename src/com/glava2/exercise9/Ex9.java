package com.glava2.exercise9;

public class Ex9 {

    public void getDescription9() {
        System.out.println("Задание 9!");
        System.out.println("Описание9: ");
        System.out.println("Напишите программу демонстрирующую автоматическую\n" +
                " упаковку примитивных типов.");
    }

    public void makeEx9 () {
        System.out.println("Результат выполнения упражнения 9");
        Test test = new Test();
        test.vivod();
    }

    public void getCode9() {
        System.out.println("Test.java: ");
        System.out.println("package com.glava2.exercise9;\n" +
                "\n" +
                "public class Test {\n" +
                "    Double d = 1.0;\n" +
                "    double a = d;\n" +
                "    \n" +
                "    Integer i = 1;\n" +
                "    int b = i;\n" +
                "\n" +
                "\n" +
                "    float f = 6.342f;\n" +
                "    Float c = f;\n" +
                "\n" +
                "\n" +
                "    public void vivod(){\n" +
                "        System.out.println(d + a);\n" +
                "        System.out.println(i + b);\n" +
                "        System.out.println(f + c);\n" +
                "    }\n" +
                "}");
        System.out.println("Ex9.java: ");
        System.out.println("public class Ex9 {\n" +
                "    public void makeEx9 () {\n" +
                "        System.out.println(\"Результат выполнения упражнения 9\");\n" +
                "        Test test = new Test();\n" +
                "        test.vivod();\n" +
                "    }\n" +
                "}");
    }
}
