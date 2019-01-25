package com.glava8.Ex18;

 class Cycle {

}
class Unicycle extends Cycle{
   public void balance() {
    System.out.println("Unicycle.balance");
}
}
class Bicycle extends Cycle{
   public void balance() {
        System.out.println("Bicycle.balance");
    }
}
class Tricycle extends Cycle{

}
public class Ex18 {

    public void getDescription18() {
        System.out.println("Задание 18!");
        System.out.println("Описание18");
        System.out.println("Используя иерархию Cycle из упражнения 1, включите метод\n" +
                "balance() в классы Unicycle и Bicycle, но не в TriCycle.\n" +
                "Создайте экземпляры всех трех типов и выполните их восходящее\n" +
                "преобразование в массив Cycle. Попробуйте вызвать balance() для\n" +
                "каждого элемента массива. Теперь выполните нисходящее преобразование,\n" +
                "вызовите balance() и проанализируйте результат.");
    }

    public  void makeEx18() {
        Cycle [] a = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
        ((Unicycle)a[0]).balance();
        ((Bicycle)a[1]).balance();

    }

    public void getCode18() {
        System.out.println("Ex18.java: ");
        System.out.println("package com.glava8.Ex18;\n" +
                "\n" +
                "public class Cycle {\n" +
                "\n" +
                "}\n" +
                "class Unicycle extends Cycle{\n" +
                "   public void balance() {\n" +
                "    System.out.println(\"Unicycle.balance\");\n" +
                "}\n" +
                "}\n" +
                "class Bicycle extends Cycle{\n" +
                "   public void balance() {\n" +
                "        System.out.println(\"Bicycle.balance\");\n" +
                "    }\n" +
                "}\n" +
                "class Tricycle extends Cycle{\n" +
                "\n" +
                "}\n" +
                "class Ex18 {\n" +
                "\n" +
                "    public  void makeEx18() {\n" +
                "        Cycle [] a = {\n" +
                "                new Unicycle(),\n" +
                "                new Bicycle(),\n" +
                "                new Tricycle()\n" +
                "        };\n" +
                "        ((Unicycle)a[0]).balance();\n" +
                "        ((Bicycle)a[1]).balance();\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}\n");
    }

}
