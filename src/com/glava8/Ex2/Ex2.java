package com.glava8.Ex2;


public class Ex2 {
    private static RandomShape gen = new RandomShape();

    public void getDescription2() {
        System.out.println("Задание 2!");
        System.out.println("Описание2");
        System.out.println("Добавьте аннотацию @Override в пример с фигурами");
    }

    public  void makeEx2() {
        System.out.println("Результат выполнения упражнения");
        Shape[] s = new Shape[9];
        for(int i = 0;i<s.length;i++)
            s[i] = gen.next();
        for (Shape shp : s)
            shp.draw();
    }

    public void getCode2() {
        System.out.println("Shape.java: ");
        System.out.println("package com.glava8.Ex2;\n" +
                "\n" +
                "public class Shape {\n" +
                "    public void draw(){}\n" +
                "    public void erase(){}\n" +
                "}\n");
        System.out.println("Circle.java: ");
        System.out.println("package com.glava8.Ex2;\n" +
                "\n" +
                "public class Circle extends Shape {\n" +
                "    @Override\n" +
                "    public void draw(){\n" +
                "        System.out.println(\"Circle.draw()\");\n" +
                "    }\n" +
                "    @Override\n" +
                "    public void erase(){\n" +
                "        System.out.println(\"Circle.erase\");\n" +
                "    }\n" +
                "}");
        System.out.println("Square.java: ");
        System.out.println("package com.glava8.Ex2;\n" +
                "\n" +
                "public class Square extends Shape {\n" +
                "    @Override\n" +
                "    public void draw(){\n" +
                "        System.out.println(\"Square.draw()\");\n" +
                "    }\n" +
                "    @Override\n" +
                "    public void erase(){\n" +
                "        System.out.println(\"Square.erase\");\n" +
                "    }\n" +
                "}\n");
        System.out.println("Triangle.java" );
        System.out.println("package com.glava8.Ex2;\n" +
                "\n" +
                "public class Triangle extends Shape {\n" +
                "    @Override\n" +
                "    public void draw(){\n" +
                "        System.out.println(\"Triangle.Draw\");\n" +
                "    }\n" +
                "    @Override\n" +
                "    public void erase(){\n" +
                "        System.out.println(\"Triangle.erase\");\n" +
                "    }\n" +
                "}");
        System.out.println("RandomShape.java: ");
        System.out.println("package com.glava8.Ex2;\n" +
                "\n" +
                "import java.util.Random;\n" +
                "\n" +
                "public class RandomShape {\n" +
                "    private Random rand = new Random(47);\n" +
                "    public Shape next(){\n" +
                "        switch (rand.nextInt(3)){\n" +
                "            default:\n" +
                "            case 0:return new Circle();\n" +
                "            case 1:return new Square();\n" +
                "            case 2:return new Triangle();\n" +
                "        }\n" +
                "    }\n" +
                "}\n");
        System.out.println("Ex2.java: ");
        System.out.println("package com.glava8.Ex2;\n" +
                "\n" +
                "\n" +
                "public class Ex2 {\n" +
                "    private static RandomShape gen = new RandomShape();\n" +
                " \n" +
                "    public  void makeEx2() {\n" +
                "        Shape[] s = new Shape[9];\n" +
                "        for(int i = 0;i<s.length;i++)\n" +
                "            s[i] = gen.next();\n" +
                "        for (Shape shp : s)\n" +
                "            shp.draw();\n" +
                "    }\n" +
                "}");
    }
}
