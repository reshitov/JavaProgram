package com.glava2.ex2;

public class Ex2 {

    public void getDescription2() {
        System.out.println("Задание 2!");
        System.out.println("Описание2");
        System.out.println("На основании примера HelloDate.java в этой главе напишите программу «Привет, мир»,\n которая просто выводит это сообщение. Программа будет содержать только один метод\n (тот, который используется при запуске программы — main()).\n Не забудьте объявить его статическим (static) и включите список аргументов, даже если вы не будете его использовать.\n Скомпилируйте программу с помощью javac и запустите на исполнение из java.");
    }

    public void makeEx2 () {
        System.out.println("Результат");
        System.out.println("Hello World!");
    }

    public void getCode2 () {
        System.out.println("Ex2.java: ");
        System.out.println("public class Ex2 {\n" +
                "    public void makeEx2 () {\n" +
                "        System.out.println(\"Hello World!\");\n" +
                "    }\n" +
                "}");
    }
}
