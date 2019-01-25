package com.glava3.Ex2;

public class Ex2 {

    public void getDescription2() {
        System.out.println("Задание 2!");
        System.out.println("Описание2");
        System.out.println("Создайте класс с полем типа float.\n" +
                "Используйте его для демонстрации совмещения имен");
    }

public void makeEx2() {
    System.out.println("Результат выполнения упражнения");
    Value value = new Value();
    value.method();
}

public void getCode2() {
    System.out.println("Value.java: ");
    System.out.println("package com.glava3.Ex2;\n" +
            "class Tank{\n" +
            "    float level;\n" +
            "}\n" +
            "\n" +
            "public class Value {\n" +
            "    public void method(){\n" +
            "        Tank t1 = new Tank();\n" +
            "        Tank t2 = new Tank();\n" +
            "        t1.level = 9;\n" +
            "        t2.level = 47;\n" +
            "        System.out.println(\"1: t1.level: \" + t1.level + \", t2.level: \" + t2.level);\n" +
            "        t1 = t2;\n" +
            "        System.out.println(\"2: t1.level: \" + t1.level + \", t2.level: \" + t2.level);\n" +
            "        t1.level = 27;\n" +
            "        System.out.println(\"3: t1.level: \" + t1.level + \", t2.level: \" + t2.level);\n" +
            "    }\n" +
            "}");
    System.out.println("Ex2.java: ");
    System.out.println("public class Ex2 {\n" +
            "public void makeEx2() {\n" +
            "    Value value = new Value();\n" +
            "    value.method();\n" +
            "}\n" +
            "}");
}

}
