package com.glava7.Ex14;
//машина
public class Ex14 {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
        left = new Door(),
        right = new Door(); //двухдверная машина
    public Ex14(){
        for(int i = 0;i<4;i++)
            wheel[i] = new Wheel();
    }

    public void getDescription14() {
        System.out.println("Задание 14!");

        System.out.println("Описание14");

        System.out.println("В car.java добавьте в класс Engine метод service()/n" +
                "и вызовите его из main()");
    }
    public  void makeEx14() {
        System.out.println("Результат выполнения упражнения");
        Ex14 ex14 = new Ex14();
        Engine engine = new Engine();
        ex14.left.window.rollup();
        ex14.wheel[0].inflate(72);
        ex14.engine.service();
    }

    public void getCode14() {
        System.out.println("Engine.java: ");
        System.out.println("package com.glava7.Ex14;\n" +
                "\n" +
                "public class Engine {\n" +
                "    public void start(){}\n" +
                "    public void rev(){}\n" +
                "    public void stop(){}\n" +
                "    public void service() {\n" +
                "        System.out.println(\"service\");\n" +
                "    }\n" +
                "}\n" +
                "//колесо\n" +
                "class Wheel{\n" +
                "    public void inflate(int psi){}//накачать\n" +
                "}\n" +
                "//окно\n" +
                "class Window{\n" +
                "    public void rollup (){}//поднять\n" +
                "    public void rolldown(){}//опустить\n" +
                "}\n" +
                "\n" +
                "//дверь\n" +
                "class Door{\n" +
                "    public Window window = new Window(); //окно дверь\n" +
                "    public void open(){} //открыть\n" +
                "    public void close(){} //закрыть\n" +
                "}");
        System.out.println("Ex14.java: ");
        System.out.println("package com.glava7.Ex14;\n" +
                "//машина\n" +
                "public class Ex14 {\n" +
                "    public Engine engine = new Engine();\n" +
                "    public Wheel[] wheel = new Wheel[4];\n" +
                "    public Door\n" +
                "        left = new Door(),\n" +
                "        right = new Door(); //двухдверная машина\n" +
                "    public Ex14(){\n" +
                "        for(int i = 0;i<4;i++)\n" +
                "            wheel[i] = new Wheel();\n" +
                "    }\n" +
                "    public  void makeEx14() {\n" +
                "        Ex14 ex14 = new Ex14();\n" +
                "        Engine engine = new Engine();\n" +
                "        ex14.left.window.rollup();\n" +
                "        ex14.wheel[0].inflate(72);\n" +
                "        ex14.engine.service();\n" +
                "    }\n" +
                "}");

    }
}
