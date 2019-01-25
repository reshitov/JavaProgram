package com.glava7.Ex6;
class Game{
    Game(int i){
        System.out.println("конструктор game");
    }
}
class BoardGame extends Game{
    BoardGame(int i){
       // System.out.println("Конструктор BoardGame"); КОНСТРУКТОР БАЗОВОГО КЛАССА ДОЛЖЕН БЫТЬ ПЕРВОЙ КОМАНДОЙ
        super(i);
        System.out.println("Конструктор BoardGame");
    }
}
 class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
}
public class Ex6  {

    public void getDescription6() {
        System.out.println("Задание 6!");

        System.out.println("Описание6");

        System.out.println("Используя пример Chess.java, докажите утверждения\n" +
                "в предыдущем абзаце");
    }
    public  void makeEx6() {
        System.out.println("Результат выполнения упражнения");
        new Chess();
    }

    public void getCode6() {
        System.out.println("Ex6.java: ");
        System.out.println("package com.glava7.Ex6;\n" +
                "class Game{\n" +
                "    Game(int i){\n" +
                "        System.out.println(\"конструктор game\");\n" +
                "    }\n" +
                "}\n" +
                "class BoardGame extends Game{\n" +
                "    BoardGame(int i){\n" +
                "       // System.out.println(\"Конструктор BoardGame\"); КОНСТРУКТОР БАЗОВОГО КЛАССА ДОЛЖЕН БЫТЬ ПЕРВОЙ КОМАНДОЙ\n" +
                "        super(i);\n" +
                "        System.out.println(\"Конструктор BoardGame\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public class Ex6 extends BoardGame {\n" +
                "    Ex6(){\n" +
                "    super(11);\n" +
                "    System.out.println(\"конструктор Ex6\");\n" +
                "    }\n" +
                "    public  void makeEx6() {\n" +
                "        Ex6 x = new Ex6();\n" +
                "    }\n" +
                "}");
    }
}
