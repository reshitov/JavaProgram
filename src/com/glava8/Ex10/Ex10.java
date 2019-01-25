package com.glava8.Ex10;

 class Qwe {
    public void method1(){
        method2();
    }
    public void method2(){
        System.out.println("Qwe.method2");
    }
}
 class B extends Qwe{
    @Override
     public void method2(){
        System.out.println("B.method2");
    }
    Qwe b = new B();
}
public class Ex10{

    public void getDescription10() {
        System.out.println("Задание 10!");
        System.out.println("Описание10");
        System.out.println("Создайте базовый класс с двумя методами.\n" +
                "В первом методе вызовите второй метод. Определите производный класс\n" +
                "и переопределите второй метод. Создайте объект производного класса,\n" +
                "выполните восходящее преобразование к базовому типу и вызовите первый метод.\n" +
                "Объясните результат");
    }

    public  void makeEx10(){
        System.out.println("Результат выполнения упражнения");
        B b = new B();
        b.method1(); // Вызываем метод супер-класса, через объект под класса(и есть восходящее преобразование)
    }

    public void getCode10() {
        System.out.println("Ex10.java: ");
        System.out.println("package com.glava8.Ex10;\n" +
                "\n" +
                " class Qwe {\n" +
                "    public void method1(){\n" +
                "        method2();\n" +
                "    }\n" +
                "    public void method2(){\n" +
                "        System.out.println(\"Qwe.method2\");\n" +
                "    }\n" +
                "}\n" +
                " class B extends Qwe{\n" +
                "    @Override\n" +
                "     public void method2(){\n" +
                "        System.out.println(\"B.method2\");\n" +
                "    }\n" +
                "    Qwe b = new B();\n" +
                "}\n" +
                "public class Ex10{\n" +
                "    public  void makeEx10(){\n" +
                "        B b = new B();\n" +
                "        b.method1(); // Вызываем метод супер-класса, через объект под класса(и есть восходящее преобразование)\n" +
                "    }\n" +
                "}");
    }
}

