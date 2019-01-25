package com.glava8.Ex14;

 class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared(){
        System.out.println("Создаем " + this);
    }
    public void addRef(){refcount++;}
    protected void finalize(){
        if(refcount>0)
            System.out.println("ERROr999999999");
    }
    protected void dispoce(){
        if(--refcount == 0)
            System.out.println("Disposing " + this);
    }
    public String toString(){return "Shared " + id;}
}
class Composing{
    private Shared shared;
    private static long counter = 0;
    private final long id = counter ++;
    public Composing(Shared shared){
        System.out.println("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispoce(){
        System.out.println("disposing " + this);
        shared.dispoce();
    }
    public String toString(){return "Composing " + id;}
}
public class Ex14 {

    public void getDescription14() {
        System.out.println("Задание 14!");
        System.out.println("Описание14");
        System.out.println("Включите метод finalize() в ReferenceCounting.java, чтобы\n" +
                "проверить условие завершения(см.главу 5)");
    }

    public  void makeEx14() {
        System.out.println("Результат выполнения упражнения");
        Shared shared = new Shared();
        Composing [] composing = {new Composing(shared),
                new Composing(shared), new Composing(shared), new Composing(shared),
                new Composing(shared)
        };
        for (Composing c: composing)
            c.dispoce();
        Composing test = new Composing(shared);
        Composing test2 = new Composing(shared);
        shared.finalize();
        Shared sharedT = new Shared();
        Composing test3 = new Composing(sharedT);
       sharedT.finalize();
    }

    public void getCode14() {
        System.out.println("Ex14.java: ");
        System.out.println("package com.glava8.Ex14;\n" +
                "\n" +
                " class Shared {\n" +
                "    private int refcount = 0;\n" +
                "    private static long counter = 0;\n" +
                "    private final long id = counter++;\n" +
                "    public Shared(){\n" +
                "        System.out.println(\"Создаем \" + this);\n" +
                "    }\n" +
                "    public void addRef(){refcount++;}\n" +
                "    protected void finalize(){\n" +
                "        if(refcount>0)\n" +
                "            System.out.println(\"ERROr999999999\");\n" +
                "    }\n" +
                "    protected void dispoce(){\n" +
                "        if(--refcount == 0)\n" +
                "            System.out.println(\"Disposing \" + this);\n" +
                "    }\n" +
                "    public String toString(){return \"Shared \" + id;}\n" +
                "}\n" +
                "class Composing{\n" +
                "    private Shared shared;\n" +
                "    private static long counter = 0;\n" +
                "    private final long id = counter ++;\n" +
                "    public Composing(Shared shared){\n" +
                "        System.out.println(\"Создаем \" + this);\n" +
                "        this.shared = shared;\n" +
                "        this.shared.addRef();\n" +
                "    }\n" +
                "    protected void dispoce(){\n" +
                "        System.out.println(\"disposing \" + this);\n" +
                "        shared.dispoce();\n" +
                "    }\n" +
                "    public String toString(){return \"Composing \" + id;}\n" +
                "}\n" +
                "public class Ex14{\n" +
                "    public  void makeEx14() {\n" +
                "        Shared shared = new Shared();\n" +
                "        Composing [] composing = {new Composing(shared),\n" +
                "                new Composing(shared), new Composing(shared), new Composing(shared),\n" +
                "                new Composing(shared)\n" +
                "        };\n" +
                "        for (Composing c: composing)\n" +
                "            c.dispoce();\n" +
                "        Composing test = new Composing(shared);\n" +
                "        Composing test2 = new Composing(shared);\n" +
                "        shared.finalize();\n" +
                "        Shared sharedT = new Shared();\n" +
                "        Composing test3 = new Composing(sharedT);\n" +
                "       sharedT.finalize();\n" +
                "    }\n" +
                "}");
    }
}
