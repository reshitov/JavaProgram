package com.glava5.Ex6;

public class Ex6 {

    public void getDescription6() {
        System.out.println("Задание 6!");
        System.out.println("Описание6");
        System.out.println("Измените предыдущее упражнение так, чтобы\n" +
                "два перегруженных метода принимали два аргумента(разных типов)\n" +
                "и отличались только порядком их следования в списке аргументов.\n" +
                "Проверьте, работает ли это.");
    }

    public void makeEx6() {
        System.out.println("Результат выполнения упражнения");
        Dog dog = new Dog();
        dog.bark();
        dog.bark(10,"Bob");
        dog.bark("bob",5);
        dog.bark(2.0f);
        dog.bark('v');
        dog.bark(90);
        dog.bark((byte)5);
        dog.bark((short)1);
        dog.bark(1.5);
    }

    public void getCode6() {
        System.out.println("Dog.java: ");
        System.out.println("package com.glava5.Ex6;\n" +
                "public class Dog {\n" +
                "    void bark(){\n" +
                "        System.out.println(\"собака лает\");\n" +
                "    }\n" +
                "    void bark(int bark, String name){\n" +
                "        System.out.println(\"собака по имени  \" +name + \" лаяла \" + bark + \" раз\");\n" +
                "\n" +
                "    }\n" +
                "    void bark(String name, int bark){\n" +
                "        System.out.println(\"Собака по имени \" + name + \" лаяла \" + bark + \" раз\");\n" +
                "    }\n" +
                "    void bark(float howled){\n" +
                "        System.out.println(\"Собака не кушала \" + howled + \" дней\");\n" +
                "    }\n" +
                "    void bark(char a){\n" +
                "        System.out.println(\"char\");\n" +
                "    }\n" +
                "    void bark(byte b){\n" +
                "        System.out.println(\"byte!!!\");\n" +
                "    }\n" +
                "    void bark(short c){\n" +
                "        System.out.println(\"short\");\n" +
                "    }\n" +
                "    void bark(long D){\n" +
                "        System.out.println(\"long\");\n" +
                "    }\n" +
                "    void bark(double e){\n" +
                "        System.out.println(\"double\");\n" +
                "    }\n" +
                "}\n");
        System.out.println("Ex6.java: ");
        System.out.println("package com.glava5.Ex6;\n" +
                "\n" +
                "public class Ex6 {\n" +
                "    public void makeEx6() {\n" +
                "        Dog dog = new Dog();\n" +
                "        dog.bark();\n" +
                "        dog.bark(10,\"Bob\");\n" +
                "        dog.bark(\"bob\",5);\n" +
                "        dog.bark(2.0f);\n" +
                "        dog.bark('v');\n" +
                "        dog.bark(90);\n" +
                "        dog.bark((byte)5);\n" +
                "        dog.bark((short)1);\n" +
                "        dog.bark(1.5);\n" +
                "    }\n" +
                "}");
    }
}
