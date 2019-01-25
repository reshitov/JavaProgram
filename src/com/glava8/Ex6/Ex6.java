package com.glava8.Ex6;
 enum Note{
 MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument{
    void play(Note n){
        System.out.println("Instrument.play()" + n);
    }
    public String toString (){return "Instrument";}
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}
class Wind extends Instrument{
    void play(Note n){
        System.out.println("Wind.play" + n);
    }
    public String toString(){
        return "Wind";
    }
    void adjust(){
        System.out.println("Abjusting Wind");
    }
}
class Percussion extends Instrument{
    void play(Note n){
        System.out.println("Percussion.play()" + n);
    }
    public String toString(){
        return "Percussion";
    }
    void adjust(){
        System.out.println("Adjusting Percussion");
    }
}
class Stringed extends Instrument{
    void play(Note n){
        System.out.println("Stringed.play() "+n);
    }
    public String toString(){
        return "Stringed";
    }
    void adjust(){
        System.out.println("Abjusting Stringed");
    }
}
class Brass extends Wind{
    void play(Note n){
        System.out.println("Brass.play() "+n);
    }
    public String toString(){return "Brass";}
    void adjust(){
        System.out.println("Abjusting Brass");
    }
}
class Woodwind extends Wind{
    void play(Note n){
        System.out.println("Woodwind.play()" +n);
    }
    public String toString(){
        return "Woodwind";
    }
}

public class Ex6 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for(Instrument i:e)
            tune(i);
    }

    public void getDescription6() {
        System.out.println("Задание 6!");
        System.out.println("Описание6");
        System.out.println("Измените программу Music3.java так, чтобы  метод\n" +
                "what() стал методом корневого класса Object toString().\n" +
                "Попробуйте вывести информацию об объектах Instrument вызовом\n" +
                "System.out.println()(без использования преобразований");
    }

    public  void makeEx6(){
        System.out.println("результат выполнения упражнения");
        Instrument[] orchestra ={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()

        };
        tuneAll(orchestra);
        for(Instrument i : orchestra)
            System.out.println(i);
    }

    public void getCode6() {
        System.out.println("Ex6.java: ");
        System.out.println("package com.glava8.Ex6;\n" +
                " enum Note{\n" +
                " MIDDLE_C, C_SHARP, B_FLAT;\n" +
                "}\n" +
                "\n" +
                "class Instrument{\n" +
                "    void play(Note n){\n" +
                "        System.out.println(\"Instrument.play()\" + n);\n" +
                "    }\n" +
                "    public String toString (){return \"Instrument\";}\n" +
                "    void adjust(){\n" +
                "        System.out.println(\"Adjusting Instrument\");\n" +
                "    }\n" +
                "}\n" +
                "class Wind extends Instrument{\n" +
                "    void play(Note n){\n" +
                "        System.out.println(\"Wind.play\" + n);\n" +
                "    }\n" +
                "    public String toString(){\n" +
                "        return \"Wind\";\n" +
                "    }\n" +
                "    void adjust(){\n" +
                "        System.out.println(\"Abjusting Wind\");\n" +
                "    }\n" +
                "}\n" +
                "class Percussion extends Instrument{\n" +
                "    void play(Note n){\n" +
                "        System.out.println(\"Percussion.play()\" + n);\n" +
                "    }\n" +
                "    public String toString(){\n" +
                "        return \"Percussion\";\n" +
                "    }\n" +
                "    void adjust(){\n" +
                "        System.out.println(\"Adjusting Percussion\");\n" +
                "    }\n" +
                "}\n" +
                "class Stringed extends Instrument{\n" +
                "    void play(Note n){\n" +
                "        System.out.println(\"Stringed.play() \"+n);\n" +
                "    }\n" +
                "    public String toString(){\n" +
                "        return \"Stringed\";\n" +
                "    }\n" +
                "    void adjust(){\n" +
                "        System.out.println(\"Abjusting Stringed\");\n" +
                "    }\n" +
                "}\n" +
                "class Brass extends Wind{\n" +
                "    void play(Note n){\n" +
                "        System.out.println(\"Brass.play() \"+n);\n" +
                "    }\n" +
                "    public String toString(){return \"Brass\";}\n" +
                "    void adjust(){\n" +
                "        System.out.println(\"Abjusting Brass\");\n" +
                "    }\n" +
                "}\n" +
                "class Woodwind extends Wind{\n" +
                "    void play(Note n){\n" +
                "        System.out.println(\"Woodwind.play()\" +n);\n" +
                "    }\n" +
                "    public String toString(){\n" +
                "        return \"Woodwind\";\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public class Ex6 {\n" +
                "    public static void tune(Instrument i){\n" +
                "        i.play(Note.MIDDLE_C);\n" +
                "    }\n" +
                "    public static void tuneAll(Instrument[] e){\n" +
                "        for(Instrument i:e)\n" +
                "            tune(i);\n" +
                "    }\n" +
                "    public  void makeEx6(){\n" +
                "        Instrument[] orchestra ={\n" +
                "                new Wind(),\n" +
                "                new Percussion(),\n" +
                "                new Stringed(),\n" +
                "                new Brass(),\n" +
                "                new Woodwind()\n" +
                "\n" +
                "        };\n" +
                "        tuneAll(orchestra);\n" +
                "        for(Instrument i : orchestra)\n" +
                "            System.out.println(i);\n" +
                "    }\n" +
                "\n" +
                "}");
    }

}
