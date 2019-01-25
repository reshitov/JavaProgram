package com.glava5.Ex22;

public class Ex22 {
    Wallet a;
    public enum Wallet{
        RU, USA, GREEK, SPAIN, ITALY
    }

    public void getDescription22() {
        System.out.println("Задание 22!");
        System.out.println("Описание22");
        System.out.println("Напишите команду switch для перечисления из предыдущего\n" +
                "примера. Для каждого случая выведите расширенное описание конкретной валюты.");
    }

    public  void makeEx22() {
        System.out.println("Результат выполнения упражнения");
        for (Wallet a : Wallet.values()){
            switch (a){
                case RU:
                    System.out.println("Рубль валюта РФ");
                break;
                case USA:
                    System.out.println("Доллар валюта США");
                    break;
                case GREEK:
                    System.out.println("Евро валюта Греции");
                    break;
                case SPAIN:
                    System.out.println("Евро валюта Испании");
                    break;
                case ITALY:
                    System.out.println("Евро валюта Италии");
                    break;
                    default: break;
            }
        }
    }

    public void getCode22() {
        System.out.println("Ex22.java: ");
        System.out.println("package com.glava5.Ex22;\n" +
                "\n" +
                "public class Ex22 {\n" +
                "    Wallet a;\n" +
                "    public enum Wallet{\n" +
                "        RU, USA, GREEK, SPAIN, ITALY\n" +
                "    }\n" +
                "\n" +
                "    public  void makeEx22() {\n" +
                "        for (Wallet a : Wallet.values()){\n" +
                "            switch (a){\n" +
                "                case RU:\n" +
                "                    System.out.println(\"Рубль валюта РФ\");\n" +
                "                break;\n" +
                "                case USA:\n" +
                "                    System.out.println(\"Доллар валюта США\");\n" +
                "                    break;\n" +
                "                case GREEK:\n" +
                "                    System.out.println(\"Евро валюта Греции\");\n" +
                "                    break;\n" +
                "                case SPAIN:\n" +
                "                    System.out.println(\"Евро валюта Испании\");\n" +
                "                    break;\n" +
                "                case ITALY:\n" +
                "                    System.out.println(\"Евро валюта Италии\");\n" +
                "                    break;\n" +
                "                    default: break;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    }");
    }
}
