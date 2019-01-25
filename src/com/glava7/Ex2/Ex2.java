package  com.glava7.Ex2;


public class Ex2 {
    private String s = "Ex2";
    public void append(String a){s+=a;}
    public void dilute(){append("dilute()");}
    public void apply (){append("apply)()");}
    public void scrub(){append("scrub()");}
    public String toString(){return s;}

    public void getDescription2() {
        System.out.println("Задание 2!");

        System.out.println("Описание2");

        System.out.println("Объявите новый класс, производный от Detergent.\n" +
                "Переопределите метод scrub() и добавьте новый метод с именем sterilize()");
    }
    public  void makeEx2() {
        System.out.println("Результат выполнения упражнения");
        Ex2 x = new Ex2();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }

    public void getCode2() {
        System.out.println("Test.java: ");
        System.out.println("package com.glava7.Ex2;\n" +
                "\n" +
                "public class Test extends Detegrent {\n" +
                "    public void scrub(){append(\"Test.scrub()\");}\n" +
                "    public void sterilize(){append(\"sterilize()\");}\n" +
                "    public static void main (String[] args){\n" +
                "        Test x = new Test();\n" +
                "        x.dilute();\n" +
                "        x.scrub();\n" +
                "        x.foam();\n" +
                "        x.apply();\n" +
                "        x.sterilize();\n" +
                "        System.out.println(x);\n" +
                "        System.out.println(\"базовый класс2\");\n" +
                "\n" +
                "    }\n" +
                "}\n");
        System.out.println("Detegrent.java: ");
        System.out.println("package com.glava7.Ex2;\n" +
                "\n" +
                "public class Detegrent extends Ex2 {\n" +
                "    public void scrub() {\n" +
                "        append(\" Detergent.scrub\");\n" +
                "        super.scrub();\n" +
                "    }\n" +
                "\n" +
                "    public void foam() {\n" +
                "        append(\"foam()\");\n" +
                "    }\n" +
                "\n" +
                "//    public static void main(String[] args) {\n" +
                "//        Detegrent x = new Detegrent();\n" +
                "//        x.dilute();\n" +
                "//        x.apply();\n" +
                "//        x.scrub();\n" +
                "//        x.foam();\n" +
                "//        System.out.println(x);\n" +
                "//        System.out.println(\"Проверяем базовый класс\");\n" +
                "//        Ex2.main(args);\n" +
                "//    }\n" +
                "}\n");
        System.out.println("Ex2.java: ");
        System.out.println("package  com.glava7.Ex2;\n" +
                "\n" +
                "\n" +
                "public class Ex2 {\n" +
                "    private String s = \"Ex2\";\n" +
                "    public void append(String a){s+=a;}\n" +
                "    public void dilute(){append(\"dilute()\");}\n" +
                "    public void apply (){append(\"apply)()\");}\n" +
                "    public void scrub(){append(\"scrub()\");}\n" +
                "    public String toString(){return s;}\n" +
                "    public  void makeEx2() {\n" +
                "        Ex2 x = new Ex2();\n" +
                "        x.dilute(); x.apply(); x.scrub();\n" +
                "        System.out.println(x);\n" +
                "    }\n" +
                "    }");
    }
}

