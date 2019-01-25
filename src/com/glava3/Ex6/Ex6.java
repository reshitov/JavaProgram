package com.glava3.Ex6;

public class Ex6 {

    public void getDescription6() {
        System.out.println("Задание 6!");
        System.out.println("Описание6");
        System.out.println("В упражнении 5 создайте новую ссылку на Dog и присвойте\n" +
                "ее объекту spot. Сравните ссылки оператором == и методом equals()");
    }

    public void makeEx6() {
        System.out.println("Результат выполнения упражнения");
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        Dog link = new Dog();
        spot.name = "Bob";
        spot.says = "Hello I'm Bob";

        scruffy.name = "Jo";
        scruffy.says = "Hello I'm Jo";

        System.out.println("spot name: " + spot.name);
        System.out.println("spor says: " + spot.says);

        System.out.println("scruffy name: " + scruffy.name );
        System.out.println("scruffy says: " + scruffy.says );

        spot = link;
        System.out.println(spot == link);
        System.out.println(spot.equals(link));
    }

    public void getCode6() {
        System.out.println("Dog.java: ");
        System.out.println("package com.glava3.Ex6;\n" +
                "\n" +
                "public class Dog {\n" +
                "    String name,says;\n" +
                "}\n");
        System.out.println("Ex6.java: ");
        System.out.println("package com.glava3.Ex6;\n" +
                "\n" +
                "public class Ex6 {\n" +
                "\n" +
                "    public void makeEx6() {\n" +
                "        Dog spot = new Dog();\n" +
                "        Dog scruffy = new Dog();\n" +
                "        Dog link = new Dog();\n" +
                "        spot.name = \"Bob\";\n" +
                "        spot.says = \"Hello I'm Bob\";\n" +
                "\n" +
                "        scruffy.name = \"Jo\";\n" +
                "        scruffy.says = \"Hello I'm Jo\";\n" +
                "\n" +
                "        System.out.println(\"spot name: \" + spot.name);\n" +
                "        System.out.println(\"spor says: \" + spot.says);\n" +
                "\n" +
                "        System.out.println(\"scruffy name: \" + scruffy.name );\n" +
                "        System.out.println(\"scruffy says: \" + scruffy.says );\n" +
                "\n" +
                "        spot = link;\n" +
                "        System.out.println(spot == link);\n" +
                "        System.out.println(spot.equals(link));\n" +
                "    }\n" +
                "}");
    }
}
