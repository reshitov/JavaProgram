package com.glava2.Ex16;

public class Ex16 {

    public void getDescription16() {
        System.out.println("Задание 16!");
        System.out.println("Описание16: ");
        System.out.println("Найдите в главе 5 пример Overloading.java\n" +
                "и добавьте в него комментарии javadoc.\n" +
                "Преобразуйте их в страницу HTML и посмотрите ее в браузере ");
    }


    public void makeEx16 () {
        System.out.println("Результат выполнения упражнения");
        OverLoadingOrder.f("Сначала строка", 11);
        OverLoadingOrder.f(99,"Сначала число");
    }

    public void getCode16() {
        System.out.println("OverLoadingOrder.java: ");
        System.out.println("package com.glava2.Ex16;\n" +
                "//import static net.mindview.util.Print.*;\n" +
                "\n" +
                "/**Program in book\n" +
                " * print string and value\n" +
                " * @author Брюс Эккель\n" +
                " *  @author  www.MindView net\n" +
                " *  @version 4.0\n" +
                " */\n" +
                "public class OverLoadingOrder {\n" +
                "\n" +
                "    static void f(String s, int i){\n" +
                "        System.out.println(\"String: \" + s + \", int: \" + i);\n" +
                "    }\n" +
                "    static void f(int i, String s){\n" +
                "        System.out.println(\"int: \" + i + \", String: \" + s);\n" +
                "    }\n" +
                "}/*Output:\n" +
                "String: сначала строка, int: 11\n" +
                "int: 99, String: сначала число\n" +
                "*///:~\n");
        System.out.println("Ex16.java: ");
        System.out.println("public class Ex16 {\n" +
                "\n" +
                "\n" +
                "    public void makeEx16 () {\n" +
                "        OverLoadingOrder.f(\"Сначала строка\", 11);\n" +
                "        OverLoadingOrder.f(99,\"Сначала число\");\n" +
                "    }\n" +
                "}");
    }
}
