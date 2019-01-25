package com.glava2.ex10;

import com.company.Main;

public class Ex10 {
    public void getDescription10() {
        System.out.println("Задание 10!");
        System.out.println("Описание10: ");
        System.out.println("Напишите программу, которая выводит 3 параметра\n" +
                " командной строки. Для получения аргументов\n" +
                " вам потребуется обращение к массивам строк (String).");
    }

    public void makeEx10() {
        System.out.println("Результат выполнения упражнения 10");
        String [] args = Main.cArgs = new String[3];
        for(int i=0;i<3;i++){
            System.out.println(args[i]);
        }

    }

    public void getCode10() {
        System.out.println("Ex10.java:");
        System.out.println("public class Ex10 {\n" +
                "    public void makeEx10() {\n" +
                "        System.out.println(\"Результат выполнения упражнения 10\");\n" +
                "        String [] args = Main.cArgs = new String[3];\n" +
                "        for(int i=0;i<3;i++){\n" +
                "            System.out.println(args[i]);\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "    }");
    }
}
