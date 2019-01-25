package com.glava2.Ex12;
import java.util.Date;

/**First program in book.
 *print the strong and the current date.
 * @author Брюс Эккель
 * @author  www.MindView net
 * @version 4.0
 */

public class Ex12 {
    public void getDescription12() {
        System.out.println("Задание 12!");
        System.out.println("Описание12: ");
        System.out.println("Найдите вторую версию программы HelloDate.java, представляющую пример\n" +
                "простой документации в комментариях.\n" +
                "Выполните команду javadoc для этого файла и просмотрите результаты в браузере");
    }
    /**Here start point the program
     * @throws RuntimeException if something goes wrong this exceprion will be throw
     */
    public void makeEx12 () throws RuntimeException{
        System.out.println("Результат выполнения упражнения");
        System.out.println("Hello, Today: ");
        System.out.println(new Date());

    }

    public void getCode12() {
        System.out.println("Ex12.java: ");
        System.out.println("package com.glava2.Ex12;\n" +
                "import java.util.Date;\n" +
                "\n" +
                "/**First program in book.\n" +
                " *print the strong and the current date.\n" +
                " * @author Брюс Эккель\n" +
                " * @author  www.MindView net\n" +
                " * @version 4.0\n" +
                " */\n" +
                "\n" +
                "    /**Here start point the program\n" +
                "     * @throws RuntimeException if something goes wrong this exceprion will be throw\n" +
                "     */\n" +
                "    public void makeEx12 () throws RuntimeException{\n" +
                "        System.out.println(\"Hello, Today: \");\n" +
                "        System.out.println(new Date());\n" +
                "\n" +
                "    }\n" +
                "}");
    }

    /* Output: (55% match)
    Hello today:
    Sun Dec 23 13:43:46 MSK 2018
    *///:~
}
