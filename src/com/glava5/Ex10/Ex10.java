package com.glava5.Ex10;

public class Ex10 {

    public void getDescription10() {
        System.out.println("Задание 10!");
        System.out.println("Описание10");
        System.out.println("Создайте класс с методом finalize(), который выводит\n" +
                "сообщение. В методе main() создайте объект вашего класса.\n" +
                "Объясните поведение программы.");
    }

    public void makeEx10() {
        System.out.println("Результат выполнения упражнения");
        Message msg = new Message();
        System.gc();

    }

    public void getCode10() {
        System.out.println("Message.java: ");
        System.out.println("package com.glava5.Ex10;\n" +
                "\n" +
                "public class Message {\n" +
                "    public void finalize(){\n" +
                "        System.out.println(\"hello\");\n" +
                "    }\n" +
                "}\n");
        System.out.println("Ex10.java: ");
        System.out.println("package com.glava5.Ex10;\n" +
                "\n" +
                "public class Ex10 {\n" +
                "\n" +
                "    public void makeEx10() {\n" +
                "        Message msg = new Message();\n" +
                "        System.gc();\n" +
                "\n" +
                "    }\n" +
                "}");
    }
}
