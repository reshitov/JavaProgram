package com.glava2.Ex14;
// object/Ex14.java

import java.util.Date;

/**
 * You can even insert a list:
 * <ol>
 * <li> Item one
 * <li> Item two
 * <li> Item three
 * </ol>



 * Another test list
 * <ol>
 * <li> One
 * <li> Two
 * <li> Three
 * </ol>
 */

public class Ex14 {

    /** Let's try a public field list
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */

    public int i = 2;

    /**
     * A private field list (-private to see)
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */

    private int j = 3;

    /**
     * Another list can be inserted here to help explain the
     * following method call
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol><br>
     * but may be formatted differently in Method Summary
     */
    public void getDescription14() {
        System.out.println("Задание 14!");
        System.out.println("Описание14: ");
        System.out.println("Добавьте список HTML к документации, создаваемой\n" +
                "в упражнении 13");
    }


    public  void makeEx14() {
        System.out.println("Результат выполнения упражнения");

        /**
         * Let's try another test list here
         * <ol>
         * <li> One
         * <li> Two
         * <li> Three
         * </ol>
         */

        Date d = new Date();
        System.out.println("d = " + d);
    }

    public void getCode14() {
        System.out.println("Ex14.java: ");
        System.out.println("package com.glava2.Ex14;\n" +
                "// object/Ex14.java\n" +
                "\n" +
                "import java.util.Date;\n" +
                "\n" +
                "/**\n" +
                " * You can even insert a list:\n" +
                " * <ol>\n" +
                " * <li> Item one\n" +
                " * <li> Item two\n" +
                " * <li> Item three\n" +
                " * </ol>\n" +
                "\n" +
                "\n" +
                "\n" +
                " * Another test list\n" +
                " * <ol>\n" +
                " * <li> One\n" +
                " * <li> Two\n" +
                " * <li> Three\n" +
                " * </ol>\n" +
                " */\n" +
                "\n" +
                "public class Ex14 {\n" +
                "\n" +
                "    /** Let's try a public field list\n" +
                "     * <ol>\n" +
                "     * <li> One\n" +
                "     * <li> Two\n" +
                "     * <li> Three\n" +
                "     * </ol>\n" +
                "     */\n" +
                "\n" +
                "    public int i = 2;\n" +
                "\n" +
                "    /**\n" +
                "     * A private field list (-private to see) \n" +
                "     * <ol>\n" +
                "     * <li> One\n" +
                "     * <li> Two\n" +
                "     * <li> Three\n" +
                "     * </ol>\n" +
                "     */\n" +
                "\n" +
                "    private int j = 3;\n" +
                "\n" +
                "    /**\n" +
                "     * Another list can be inserted here to help explain the\n" +
                "     * following method call\n" +
                "     * <ol>\n" +
                "     * <li> One\n" +
                "     * <li> Two\n" +
                "     * <li> Three\n" +
                "     * </ol><br>\n" +
                "     * but may be formatted differently in Method Summary\n" +
                "     */\n" +
                "    public  void makeEx14() {\n" +
                "\n" +
                "        /**\n" +
                "         * Let's try another test list here\n" +
                "         * <ol>\n" +
                "         * <li> One\n" +
                "         * <li> Two\n" +
                "         * <li> Three\n" +
                "         * </ol>\n" +
                "         */\n" +
                "\n" +
                "        Date d = new Date();\n" +
                "        System.out.println(\"d = \" + d);\n" +
                "    }\n" +
                "  }  ");
    }
}

