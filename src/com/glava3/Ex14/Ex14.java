package com.glava3.Ex14;
public class Ex14 {

    public void getDescription14() {
        System.out.println("Задание 14!");
        System.out.println("Описание14");
        System.out.println("Напишите метод, который получает два аргумента\n" +
                "String, выполняет с ними две операции логических сравнений и выводит\n" +
                "результаты. Для операций == и != также выполните проверку equals().\n" +
                "Вызовите свой метод из main() для нескольких разных объектов String.");
    }

    public void makeEx14() {
        System.out.println("Результат выполнения упражнения");
        Reshitov reshitov = new Reshitov();
        reshitov.method("pen","book");
    }

    public void getCode14() {
        System.out.println("Reshitov.java: ");
        System.out.println("package com.glava3.Ex14;\n" +
                "\n" +
                "public class Reshitov {\n" +
                "    \n" +
                "    public void method(String a,String b){\n" +
                "        if(a.equals(b)){\n" +
                "            System.out.println(\"a=b\");\n" +
                "        }\n" +
                "         else if (b.equals(a)){\n" +
                "            System.out.println(\"b=a\");\n" +
                "        }\n" +
                "        else if(a==b){\n" +
                "            System.out.println(\"a==b\");\n" +
                "        }\n" +
                "        else if(a!=b){\n" +
                "            System.out.println(\"a!=b\");\n" +
                "        }\n" +
                "        /*\n" +
                "        if(!a),,,,\n" +
                "        if(!b),,,,\n" +
                "        a |=b\n" +
                "        a^=b\n" +
                "        a&=b\n" +
                "        a = a&&b\n" +
                "        a = a||b\n" +
                "        a=~b\n" +
                "        a = a&b\n" +
                "        a = a|b\n" +
                "        a = a^b\n" +
                "        a |= b;\n" +
                "\n" +
                "         */\n" +
                "\n" +
                "    }\n" +
                "}\n");
        System.out.println("Ex14.java: ");
        System.out.println("package com.glava3.Ex14;\n" +
                "public class Ex14 {\n" +
                "\n" +
                "    public void makeEx14() {\n" +
                "        Reshitov reshitov = new Reshitov();\n" +
                "        reshitov.method(\"pen\",\"book\");\n" +
                "    }\n" +
                "    }");
    }
}
