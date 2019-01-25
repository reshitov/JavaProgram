package com.glava7.Ex18;
import java.util.Random;
class Test {
    Test() {
       // System.out.println("Test()");
        }
}


public class Ex18 {
    private String name;

    public Ex18() {
    }

    public Ex18(String s) { name = s;  }
    static final Test zxc = new Test();
    private final Test vb = new Test();
    static final String JKL = "static final";
    private final String op = "final";
    private static Random rand = new Random();
    static final int SFI = rand.nextInt();
    private final int fi = rand.nextInt();
    public String toString() {
        return (name + ": " + zxc + ", " + vb + ", " + JKL + ", " + op + ", " + SFI + ", " + fi);
    }

    public void getDescription18() {
        System.out.println("Задание 18!");
        System.out.println("Описание18");
        System.out.println("Создайте класс, содержащий два поля\n" +
                "static final и final. Продемонстрируйте различия между ними.");
    }
    public  void makeEx18(){
        System.out.println("Результат выполнения упражнения");
        Ex18 d1 = new Ex18("d1");
        Ex18 d2 = new Ex18("d2");
        Ex18 d3 = new Ex18("d3");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }

    public void getCode18() {
        System.out.println("Ex18.java: ");
        System.out.println("package com.glava7.Ex18;\n" +
                "import java.util.Random;\n" +
                "class Test {\n" +
                "    Test() {\n" +
                "        System.out.println(\"Test()\"); }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "public class Ex18 {\n" +
                "    private String name;\n" +
                "    public Ex18(String s) { name = s;  }\n" +
                "    static final Test zxc = new Test();\n" +
                "    private final Test vb = new Test();\n" +
                "    static final String JKL = \"static final\";\n" +
                "    private final String op = \"final\";\n" +
                "    private static Random rand = new Random();\n" +
                "    static final int SFI = rand.nextInt();\n" +
                "    private final int fi = rand.nextInt();\n" +
                "    public String toString() {\n" +
                "        return (name + \": \" + zxc + \", \" + vb + \", \" + JKL + \", \" + op + \", \" + SFI + \", \" + fi);\n" +
                "    }\n" +
                "    public  void makeEx18(){\n" +
                "        Ex18 d1 = new Ex18(\"d1\");\n" +
                "        Ex18 d2 = new Ex18(\"d2\");\n" +
                "        Ex18 d3 = new Ex18(\"d3\");\n" +
                "        System.out.println(d1);\n" +
                "        System.out.println(d2);\n" +
                "        System.out.println(d3);\n" +
                "\n" +
                "    }\n" +
                "}");
    }

}
