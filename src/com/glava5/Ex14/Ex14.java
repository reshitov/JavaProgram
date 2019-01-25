package com.glava5.Ex14;

public class Ex14 {

    public void getDescription14() {
        System.out.println("Задание 14!");
        System.out.println("Описание14");
        System.out.println("Создайте класс с полем static String,\n" +
                "инициалируемым в точке определения,и другим полем,\n" +
                "инициализируемым в блоке static.Добавьте статический\n" +
                "метод, который выводит, значения полей и \n" +
                "демонстрирует, что оба поля инициализируются\n" +
                "перед использованием.");
    }

    public  void makeEx14() {
        System.out.println("Результат выполнения упражнения");
        Rttyu.method();

    }

    public void getCode14() {
        System.out.println("Rttyu.java: ");
        System.out.println("package com.glava5.Ex14;\n" +
                "\n" +
                "public class Rttyu {\n" +
                "    static String a = \"123\";\n" +
                "    static String b;\n" +
                "    static {\n" +
                "        b = \"qwe\";\n" +
                "    }\n" +
                "    public static void method(){\n" +
                "        System.out.println(a);\n" +
                "        System.out.println(b);\n" +
                "    }\n" +
                "}");
        System.out.println("Ex14.java: ");
        System.out.println("package com.glava5.Ex14;\n" +
                "\n" +
                "public class Ex14 {\n" +
                "\n" +
                "\n" +
                "    public  void makeEx14() {\n" +
                "        Rttyu.method();\n" +
                "\n" +
                "    }\n" +
                "}");
    }
}
