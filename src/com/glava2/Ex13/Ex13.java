package com.glava2.Ex13;
/**
 * this <em>is</em>list:
 * <ol>
 * <li>paragraph 1
 * <li>paragraph 2
 * <li>paragraph 3
 * </ol>
 */
public class Ex13 {
    public void getDescription13() {
        System.out.println("Задание 13!");
        System.out.println("Описание13: ");
        System.out.println("Запустите программы Documentation.java,\n" +
                "Documentation2.java и Documentation3.java в javadoc.\n" +
                "Просмотрите результаты в браузере");
    }

   public void makeEx13() {
       System.out.println("Результат выполнения упражнения");
       new Documentation1().f();

   }

   public void getCode13() {
       System.out.println("Documentation1.java: ");
       System.out.println("package com.glava2.Ex13;\n" +
               "//:object/Documentation1.java\n" +
               "\n" +
               "/**Comment to class*/\n" +
               "public class Documentation1 {\n" +
               "    /** comment to value*/\n" +
               "    public int i;\n" +
               "    /**comment to method*/\n" +
               "    public void f(){\n" +
               "        System.out.println(\"Method f\");\n" +
               "    }\n" +
               "}///:~\n");
       System.out.println("Ex13.java: ");
       System.out.println("package com.glava2.Ex13;\n" +
               "/**\n" +
               " * this <em>is</em>list:\n" +
               " * <ol>\n" +
               " * <li>paragraph 1\n" +
               " * <li>paragraph 2\n" +
               " * <li>paragraph 3\n" +
               " * </ol>\n" +
               " */\n" +
               "   public void makeEx13() {\n" +
               "       new Documentation1().f();\n" +
               "\n" +
               "   }\n" +
               "   ");
   }
}
