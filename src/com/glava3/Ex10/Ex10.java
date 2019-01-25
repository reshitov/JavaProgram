package com.glava3.Ex10;

public class Ex10 {
    public void getDescription10() {
        System.out.println("Задание 10!");
        System.out.println("Описание10");
        System.out.println("Напишите программу с двумя константами:\n" +
                "обе константы состоят из чередующихся нулей и единиц,\n" +
                "но у одной нулю равен младший бит,а у другой старший.Объедините\n" +
                "эти две константы всеми возможными подразрядными операторами.\n" +
                "Для вывода результатов используйте метод Integer.toBinaryString()");
    }


    public void makeEx10() {
        System.out.println("Результат выполнения упражнения");
        int a = 1 +4 + 16 + 64;
        int b = 2 + 8 + 32 + 128;
        System.out.println("a: " + Integer.toBinaryString(a));
        System.out.println("b: " + Integer.toBinaryString(b));

        System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b));
        System.out.println("a | b = " + Integer.toBinaryString(a | b));
        System.out.println("a & b = " + Integer.toBinaryString(a & b));

        System.out.println("~b = " + Integer.toBinaryString(~b));
        System.out.println("~a = " + Integer.toBinaryString(~a));
    }

    public void getCode10() {
        System.out.println("Ex10.java:");
        System.out.println("package com.glava3.Ex10;\n" +
                "\n" +
                "public class Ex10 {\n" +
                "    public void makeEx10() {\n" +
                "        int a = 1 +4 + 16 + 64;\n" +
                "        int b = 2 + 8 + 32 + 128;\n" +
                "        System.out.println(\"a: \" + Integer.toBinaryString(a));\n" +
                "        System.out.println(\"b: \" + Integer.toBinaryString(b));\n" +
                "\n" +
                "        System.out.println(\"a ^ b = \" + Integer.toBinaryString(a ^ b));\n" +
                "        System.out.println(\"a | b = \" + Integer.toBinaryString(a | b));\n" +
                "        System.out.println(\"a & b = \" + Integer.toBinaryString(a & b));\n" +
                "\n" +
                "        System.out.println(\"~b = \" + Integer.toBinaryString(~b));\n" +
                "        System.out.println(\"~a = \" + Integer.toBinaryString(~a));\n" +
                "    }\n" +
                "    }");
    }

}
