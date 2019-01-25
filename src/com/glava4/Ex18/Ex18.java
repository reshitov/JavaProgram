package com.glava4.Ex18;

public class Ex18 {

    public void getDescription18() {
        System.out.println("Задание 18!");
        System.out.println("Описание18");
        System.out.println("Напишите программу, использующую два вложенных цикла for\n" +
                "и оператор остатка(%) для поиска и вывода простых чисел\n" +
                "(то есть целых чисел, не делящихся нацело ни на какое другое число,\n" +
                "кроме себя и 1)");
    }

    public void makeEx18() {
        System.out.println("Результат выполнения упражнения");
        for (int i = 1; i < 10000; i++) {
            int a = 0;
            for(int j = 1;j<i;j++){
                if((i%j) == 0) a++;
            }
            if(a<2) System.out.println(i);
        }
    }

    public void getCode18() {
        System.out.println("Ex18.java: ");
        System.out.println("package com.glava4.Ex18;\n" +
                "\n" +
                "public class Ex18 {\n" +
                "    public void makeEx18() {\n" +
                "        for (int i = 1; i < 10000; i++) {\n" +
                "            int a = 0;\n" +
                "            for(int j = 1;j<i;j++){\n" +
                "                if((i%j) == 0) a++;\n" +
                "            }\n" +
                "            if(a<2) System.out.println(i);\n" +
                "        }\n" +
                "    }\n" +
                "}");
    }


}
