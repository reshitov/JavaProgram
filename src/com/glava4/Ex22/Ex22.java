package com.glava4.Ex22;

public class Ex22 {

    public void getDescription22() {
        System.out.println("Задание 22!");
        System.out.println("Описание22");
        System.out.println("Создайте команду switch,которая выводит\n" +
                "сообщение в каждой секции case. Разместите ее в цикле for,\n" +
                "проверяющим все допустимые значения case. Каждая секция case \n" +
                "должна завершаться командой break. Затем удалите команды break \n" +
                "и посмотрите, что произойдет");
    }

    public void makeEx22() {
        System.out.println("Результат выполнения упражнения");
        for(int i = 0;i<6;i++){
            switch (i){
                case 0:
                    System.out.println("qwe");
                    break;
                case 1:
                    System.out.println("rty");
                    break;
                case 2:
                    System.out.println("uio");
                    break;
                case 3:
                    System.out.println("asd");
                    break;
                case 4:
                    System.out.println("zxc");
                    break;
                case 5:
                    System.out.println("bnm");
                    break;
                default:
                    System.out.println("дефолт");
            }
        }
    }

    public void getCode22() {
        System.out.println("Ex22.java: ");
        System.out.println("package com.glava4.Ex22;\n" +
                "\n" +
                "public class Ex22 {\n" +
                "    public void makeEx22() {\n" +
                "        for(int i = 0;i<6;i++){\n" +
                "            switch (i){\n" +
                "                case 0:\n" +
                "                    System.out.println(\"qwe\");\n" +
                "                    break;\n" +
                "                case 1:\n" +
                "                    System.out.println(\"rty\");\n" +
                "                    break;\n" +
                "                case 2:\n" +
                "                    System.out.println(\"uio\");\n" +
                "                    break;\n" +
                "                case 3:\n" +
                "                    System.out.println(\"asd\");\n" +
                "                    break;\n" +
                "                case 4:\n" +
                "                    System.out.println(\"zxc\");\n" +
                "                    break;\n" +
                "                case 5:\n" +
                "                    System.out.println(\"bnm\");\n" +
                "                    break;\n" +
                "                default:\n" +
                "                    System.out.println(\"дефолт\");\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}");
    }

}
