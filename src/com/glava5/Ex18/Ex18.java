package com.glava5.Ex18;

public class Ex18 {

    public void getDescription18() {
        System.out.println("Задание 18!");
        System.out.println("Описание18");
        System.out.println("Завершите предыдущее упражнения - создайте объекты,которыми\n" +
                "заполняется массив ссылок");
    }

    public  void makeEx18() {
        System.out.println("Результат выполнения упражнения");
        Arg[] arg = new Arg[2];
        for(int i = 0;i<arg.length;i++)
            arg[i] = new Arg(Integer.toString(i));
    }


    public void getCode18() {
        System.out.println("Arg.java: ");
        System.out.println("package com.glava5.Ex18;\n" +
                "\n" +
                "public class Arg {\n" +
                "    Arg(String a){\n" +
                "        a = \"server;\";\n" +
                "        System.out.println(\"Arg()\");\n" +
                "        System.out.println(a);\n" +
                "    }\n" +
                "}\n");
        System.out.println("Ex18.java");
        System.out.println("package com.glava5.Ex18;\n" +
                "\n" +
                "public class Ex18 {\n" +
                "\n" +
                "    public  void makeEx18() {\n" +
                "        Arg[] arg = new Arg[2];\n" +
                "        for(int i = 0;i<arg.length;i++)\n" +
                "            arg[i] = new Arg(Integer.toString(i));\n" +
                "    }\n" +
                "    }");
    }
}
