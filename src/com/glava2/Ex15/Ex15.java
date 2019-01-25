package com.glava2.Ex15;
/**First program in book.
 *print the string.
 * @author Bruce Eckel
 * @author  www.MindView net
 * @version 4.0
 */
public class Ex15 {

    public void getDescription15() {
        System.out.println("Задание 15!");
        System.out.println("Описание15: ");
        System.out.println("Возьмите программу из упражнения 2 и добавьте\n" +
                "к ней документацию в комментариях. Извликите эту документацию\n" +
                "в HTML-файл с помощью javadoc и просмотрите полученную страницу в браузере");
    }


    /**Here start point the program
     * @throws RuntimeException if something goes wrong this exception will be throw
     */
    public void makeEx15() throws RuntimeException {
        System.out.println("Результат выполнения упражнения");
        System.out.println("Hello World!");
    }

    public void getCode15() {
        System.out.println("Ex15.java: ");
        System.out.println("package com.glava2.Ex15;\n" +
                "/**First program in book.\n" +
                " *print the string.\n" +
                " * @author Bruce Eckel\n" +
                " * @author  www.MindView net\n" +
                " * @version 4.0\n" +
                " */\n" +
                "public class Ex15 {\n" +
                "\n" +
                "    /**Here start point the program\n" +
                "     * @throws RuntimeException if something goes wrong this exception will be throw\n" +
                "     */\n" +
                "    public void makeEx15() throws RuntimeException {\n" +
                "        System.out.println(\"Hello World!\");\n" +
                "    }\n" +
                "}");
    }
    /* Output: (55% match)
    Hello World!
    *///:~
}
