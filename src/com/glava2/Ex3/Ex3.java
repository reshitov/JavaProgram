package com.glava2.Ex3;

public class Ex3 {

    public void getDescription3() {
        System.out.println("Задание 3!");

        System.out.println("Описание3");

        System.out.println("Найти фрагмент кода с классом ATypeName и сделайте из него программу,\n пригодную для компиляции и запуска.");
    }
    
    public void makeEx3(){
        System.out.println("Результат выполения упражнения 3");
        ATypeName aTypeName = new ATypeName();
        aTypeName.vivod();
    }

    public void getCode3() {
        System.out.println("public class Ex3 {\n" +
                "    public void makeEx3(){\n" +
                "        System.out.println(\"Результат выполения упражнения 3\");\n" +
                "        ATypeName aTypeName = new ATypeName();\n" +
                "        aTypeName.vivod();\n" +
                "    }\n" +
                "}");
    }
}
