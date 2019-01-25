package com.glava6.Ex6;

public class Ex6 {

    public void getDescription6() {
        System.out.println("Задание 6!");
        System.out.println("Описание6");
        System.out.println("Создайте класс с защищенными данными.\n" +
                "Создайте в том же файле второй класс с методом,\n" +
                "работающим с защищенными данными из первого класса");
    }
    public  void makeEx6() {
        System.out.println("Результат выполнения упражнения");
        B.method();
    }

    public void getCode6() {
        System.out.println("Ex6.java: ");
        System.out.println("package com.glava6.Ex6;\n" +
                "\n" +
                "public class Ex6 {\n" +
                "\n" +
                "    public  void makeEx6() {\n" +
                "        B.method();\n" +
                "    }\n" +
                "    \n" +
                "class A {\n" +
                "    protected String b;\n" +
                "    protected int c;\n" +
                "}\n" +
                " class B {\n" +
                "    static void method(){\n" +
                "        A a = new A();\n" +
                "        a.b = \"qwe\";\n" +
                "        a.c = 1;\n" +
                "        System.out.println(a.b);\n" +
                "        System.out.println(a.c);\n" +
                "    }\n" +
                "}");
    }
}
class A {
    protected String b;
    protected int c;
}
 class B {
    static void method(){
        A a = new A();
        a.b = "qwe";
        a.c = 1;
        System.out.println(a.b);
        System.out.println(a.c);
    }
}
