package com.glava2.exercise11;

public class Ex11 {

    public void getDescription11() {
        System.out.println("Задание 11!");
        System.out.println("Описание11: ");
        System.out.println("Преобразуйте пример с AllTheColorsOfTheRainbow в работающую программу.");
    }
    public void makeEx11 () {
        System.out.println("Результат выполнения упражнения 11");
        AllTheColorsOfTheRainbow n = new AllTheColorsOfTheRainbow();
        n.changeTheHueOfTheColor(5);
    }

    public void getCode11() {
        System.out.println("AllTheColorsOfTheRainbow.java: ");
        System.out.println("package com.glava2.exercise11;\n" +
                "\n" +
                "public class AllTheColorsOfTheRainbow {\n" +
                "    int anIntegerRepresentingColors=5;\n" +
                "    public void changeTheHueOfTheColor(int newHue){\n" +
                "        int a = 4;\n" +
                "         newHue = anIntegerRepresentingColors + a;\n" +
                "        System.out.println(newHue);\n" +
                "    }\n" +
                "}");
        System.out.println("Ex11.java: ");
        System.out.println("public class Ex11 {\n" +
                "    public void makeEx11 () {\n" +
                "        System.out.println(\"Результат выполнения упражнения 11\");\n" +
                "        AllTheColorsOfTheRainbow n = new AllTheColorsOfTheRainbow();\n" +
                "        n.changeTheHueOfTheColor(5);\n" +
                "    }\n" +
                "}");
    }
}
