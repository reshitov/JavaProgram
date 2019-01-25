package com.glava2.exercise4and5;

public class Ex5 {

    public void getDescription5() {
        System.out.println("Задание 5!");
        System.out.println("Описание5: ");
        System.out.println("Измените упражнение 4 так, чтобы данным класса DataOnly\n присваивались значения, а затем распечатайте их в методе main().");
    }


    public void makeEx5() {
        System.out.println("Результат выполнения упражнения");
        DataOnly dataOnly = new DataOnly();
        dataOnly.vivod();
    }

    public void getCode5() {
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
        System.out.println("Ex5.java: ");
        System.out.println("public class Ex5 {\n" +
                "    public void makeEx5() {\n" +
                "        DataOnly dataOnly = new DataOnly();\n" +
                "        dataOnly.vivod();\n" +
                "    }\n" +
                "}");
    }
}
