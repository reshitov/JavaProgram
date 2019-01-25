package com.glava2.Ex1;

public class Ex1 {

    public void getDescription() {
        System.out.println("Задание 1!");
        System.out.println("Описание");
        System.out.println("Создайте класс с полями int и char, которые не инициализируются в программе.\n" +
                "Выведите их значения, чтобы убедиться в том, что java выполняет инициализацию по умолчанию");
    }

    public void makeEx() {
        System.out.println("Результат");
        Volume volume = new Volume();
        volume.vivod();
    }

    public void getCode() {
        System.out.println("Volume.java: ");
        System.out.println("package com.glava2.Ex1;\n" +
                "\n" +
                "public class Volume {\n" +
                "\n" +
                "    static char volume;\n" +
                "    static int volume2;\n" +
                "\n" +
                "    public void vivod(){\n" +
                "        System.out.println(volume);\n" +
                "        System.out.println(volume2);\n" +
                "    }\n" +
                "\n" +
                "}");

        System.out.println("Ex2.java: ");
        System.out.println("public class Ex1 {\n  " +
                "public void makeEx() {\n" +
                "        Volume volume = new Volume();\n" +
                "        volume.vivod();\n" +
                "    }" +

                "}");
    }
}

