package com.glava5.Ex2;

public class Ex2 {

    public void getDescription2() {
        System.out.println("Задание 2!");
        System.out.println("Описание2");
        System.out.println("Создайте класс с полем String,инициализируемым\n" +
                "в точке определения, и другим полем, инициализируемым конструктором.\n" +
                "Чем отличаются эти два подхода?");
    }
    public void makeEx2() {
        System.out.println("Результат выполнения упражнения");
        Qwe qwe = new Qwe();
        System.out.println("A " + qwe.A);
        System.out.println("B " + qwe.B);
    }

    public void getCode2 () {
        System.out.println("Ex22.java: ");
        System.out.println("package com.glava5.Ex2;\n" +
                "\n" +
                "public class Qwe {\n" +
                "    String A = \"Server\";\n" +
                "    String B;\n" +
                "    Qwe(){\n" +
                "         B = \"constructor\";\n" +
                "    }\n" +
                "}\n");
        System.out.println("Ex2.java: ");
        System.out.println("package com.glava5.Ex2;\n" +
                "\n" +
                "public class Ex2 {\n" +
                "    public void makeEx2() {\n" +
                "        Qwe qwe = new Qwe();\n" +
                "        System.out.println(\"A \" + qwe.A);\n" +
                "        System.out.println(\"B \" + qwe.B);\n" +
                "    }\n" +
                "    }");
    }
}
