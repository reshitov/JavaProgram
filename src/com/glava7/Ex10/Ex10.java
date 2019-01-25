package com.glava7.Ex10;

public class Ex10 {

    public void getDescription10() {
        System.out.println("Задание 10!");

        System.out.println("Описание10");

        System.out.println("Измените предыдущее упражнение так, чтобы во всех\n" +
                "классах присутствовали лишь конструкторы с аргументами(не по умолчанию)");
    }

    public  void makeEx10() {
        System.out.println("Результат выполнения упражнения");
        Stem x = new Stem(1);

    }

    public void getCode10() {
        System.out.println("Root.java: ");
        System.out.println("package com.glava7.Ex10;\n" +
                "class Component1{\n" +
                "    Component1(int i){\n" +
                "        System.out.println(\"конструктор Component1\");\n" +
                "    }\n" +
                "}\n" +
                "class Component2{\n" +
                "    Component2(int i){\n" +
                "        System.out.println(\"конструктор Component2\");\n" +
                "    }\n" +
                "}\n" +
                "class Component3{\n" +
                "    Component3(int i){\n" +
                "        System.out.println(\"конструктор Component3\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public class Root {\n" +
                "    Root(int i){\n" +
                "        System.out.println(\"Конструктор Root\");\n" +
                "    }\n" +
                "Component1 x1 = new Component1(1);\n" +
                "Component2 x2 = new Component2(2);\n" +
                "Component3 x3 = new Component3(3);\n" +
                "}\n" +
                "class Stem extends Root{\n" +
                "    Component1 x1 = new Component1(1);\n" +
                "    Component2 x2 = new Component2(2);\n" +
                "    Component3 x3 = new Component3(3);\n" +
                "    Stem(int i){\n" +
                "        super(99);\n" +
                "        System.out.println(\"Конструктор Stem\");\n" +
                "    }\n" +
                "}\n");
        System.out.println("Ex10.java: ");
        System.out.println("package com.glava7.Ex10;\n" +
                "\n" +
                "public class Ex10 {\n" +
                "\n" +
                "    public  void makeEx10() {\n" +
                "        Stem x = new Stem(1);\n" +
                "\n" +
                "    }\n" +
                "    }");
    }
}
