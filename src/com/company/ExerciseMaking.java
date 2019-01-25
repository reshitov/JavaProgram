package com.company;

import com.glava5.Ex10.Ex10;
import com.glava5.Ex14.Ex14;
import com.glava5.Ex18.Ex18;
import com.glava5.Ex2.Ex2;
import com.glava5.Ex6.Ex6;

public class ExerciseMaking {

    public void getExercises(int chapterNumber) {
        switch (chapterNumber) {
            case 2:
                 new com.glava2.Ex1.Ex1().getDescription();
                 new com.glava2.ex2.Ex2().getDescription2();
                 new com.glava2.Ex3.Ex3().getDescription3();
                 new com.glava2.exercise4and5.Ex4().getDescription4();
                 new com.glava2.exercise4and5.Ex5().getDescription5();
                 new com.glava2.exercise6.Ex6().getDescription6();
                 new com.glava2.exercise7.Ex7().getDescription7();
                 new com.glava2.exersice8.Ex8().getDescription8();
                 new com.glava2.exercise9.Ex9().getDescription9();
                 new com.glava2.ex10.Ex10().getDescription10();
                 new com.glava2.exercise11.Ex11().getDescription11();
                 new com.glava2.Ex12.Ex12().getDescription12();
                 new com.glava2.Ex13.Ex13().getDescription13();
                 new com.glava2.Ex14.Ex14().getDescription14();
                 new com.glava2.Ex15.Ex15().getDescription15();
                 new com.glava2.Ex16.Ex16().getDescription16();
                 break;
            case 3:
                 new com.glava3.Ex2.Ex2().getDescription2();
                 new com.glava3.Ex6.Ex6().getDescription6();
                 new com.glava3.Ex10.Ex10().getDescription10();
                 new com.glava3.Ex14.Ex14().getDescription14();
                 break;
            case 4:
                  new com.glava4.Ex18.Ex18().getDescription18();
                  new com.glava4.Ex22.Ex22().getDescription22();
                  break;
            case 5:
                  new com.glava5.Ex2.Ex2().getDescription2();
                  new com.glava5.Ex6.Ex6().getDescription6();
                  new com.glava5.Ex10.Ex10().getDescription10();
                  new com.glava5.Ex14.Ex14().getDescription14();
                  new com.glava5.Ex18.Ex18().getDescription18();
                  new com.glava5.Ex22.Ex22().getDescription22();
                  break;
            case 6:
                 new com.glava6.Ex2.com.company.Ex2().getDescription2();
                 new com.glava6.Ex6.Ex6().getDescription6();
                 break;
            case 7:
                 new com.glava7.Ex2.Ex2().getDescription2();
                 new com.glava7.Ex6.Ex6().getDescription6();
                 new com.glava7.Ex10.Ex10().getDescription10();
                 new com.glava7.Ex14.Ex14().getDescription14();
                 new com.glava7.Ex18.Ex18().getDescription18();
                 new com.glava7.Ex22.Ex22().getDescription22();
                 break;
            case 8:
                new com.glava8.Ex2.Ex2().getDescription2();
                new com.glava8.Ex6.Ex6().getDescription6();
                new com.glava8.Ex10.Ex10().getDescription10();
                new com.glava8.Ex14.Ex14().getDescription14();
                new com.glava8.Ex18.Ex18().getDescription18();
                break;

             default:
                 System.out.println("Глава не найдена");

        }
    }

    public void getExercise(int chapter, int exercise) {
        switch(chapter) {
            case 2:
                switch (exercise) {
                    case 1:
                        com.glava2.Ex1.Ex1 exercise1 = new com.glava2.Ex1.Ex1();
                        exercise1.getDescription();
                        exercise1.getCode();
                        exercise1.makeEx();
                        break;
                    case 2:
                        com.glava2.ex2.Ex2 exercise2 = new com.glava2.ex2.Ex2();
                        exercise2.getDescription2();
                        exercise2.getCode2();
                        exercise2.makeEx2();
                        break;
                    case 3:
                        com.glava2.Ex3.Ex3 exercise3 = new com.glava2.Ex3.Ex3();
                        exercise3.getDescription3();
                        exercise3.getCode3();
                        exercise3.makeEx3();
                        break;
                    case 4:
                        com.glava2.exercise4and5.Ex4 exercise4 = new com.glava2.exercise4and5.Ex4();
                        exercise4.getDescription4();
                        exercise4.getCode4();
                        exercise4.makeEx4();
                        break;
                    case 5:
                        com.glava2.exercise4and5.Ex5 exercise5 = new com.glava2.exercise4and5.Ex5();
                        exercise5.getDescription5();
                        exercise5.getCode5();
                        exercise5.makeEx5();
                        break;
                    case 6:
                        com.glava2.exercise6.Ex6 exercise6 = new com.glava2.exercise6.Ex6();
                        exercise6.getDescription6();
                        exercise6.getCode6();
                        exercise6.makeEx6();
                        break;
                    case 7:
                        com.glava2.exercise7.Ex7 exercise7 = new com.glava2.exercise7.Ex7();
                        exercise7.getDescription7();
                        exercise7.getCode7();
                        exercise7.makeEx7();
                        break;
                    case 8:
                        com.glava2.exersice8.Ex8 exercise8 = new com.glava2.exersice8.Ex8();
                        exercise8.getDescription8();
                        exercise8.getCode8();
                        exercise8.makeEx8();
                        break;
                    case 9:
                        com.glava2.exercise9.Ex9 exercise9 = new com.glava2.exercise9.Ex9();
                        exercise9.getDescription9();
                        exercise9.getCode9();
                        exercise9.makeEx9();
                        break;
                    case 10:
                        com.glava2.ex10.Ex10 exercise10 = new com.glava2.ex10.Ex10();
                        exercise10.getDescription10();
                        exercise10.getCode10();
                        exercise10.makeEx10();
                        break;
                    case 11:
                        com.glava2.exercise11.Ex11 exercise11 = new com.glava2.exercise11.Ex11();
                        exercise11.getDescription11();
                        exercise11.getCode11();
                        exercise11.makeEx11();
                        break;
                    case 12:
                        com.glava2.Ex12.Ex12 exercise12 = new com.glava2.Ex12.Ex12();
                        exercise12.getDescription12();
                        exercise12.getCode12();
                        exercise12.makeEx12();
                        break;
                    case 13:
                        com.glava2.Ex13.Ex13 exercise13 = new com.glava2.Ex13.Ex13();
                        exercise13.getDescription13();
                        exercise13.getCode13();
                        exercise13.makeEx13();
                        break;
                    case 14:
                        com.glava2.Ex14.Ex14 exercise14 = new com.glava2.Ex14.Ex14();
                        exercise14.getDescription14();
                        exercise14.getCode14();
                        exercise14.makeEx14();
                        break;
                    case 15:
                        com.glava2.Ex15.Ex15 exercise15 = new com.glava2.Ex15.Ex15();
                        exercise15.getDescription15();
                        exercise15.getCode15();
                        exercise15.makeEx15();
                        break;
                    case 16:
                        com.glava2.Ex16.Ex16 exercise16 = new com.glava2.Ex16.Ex16();
                        exercise16.getDescription16();
                        exercise16.getCode16();
                        exercise16.makeEx16();
                        break;
                    default:
                        System.out.println("Такого упражнения нет!!!!");

                }
                break;
            case 3:
                    switch (exercise) {
                        case 2:
                            com.glava3.Ex2.Ex2 exercise2 = new com.glava3.Ex2.Ex2();
                            exercise2.getDescription2();
                            exercise2.getCode2();
                            exercise2.makeEx2();
                            break;
                        case 6:
                            com.glava3.Ex6.Ex6 exercise6 = new com.glava3.Ex6.Ex6();
                            exercise6.getDescription6();
                            exercise6.getCode6();
                            exercise6.makeEx6();
                            break;
                        case 10:
                            com.glava3.Ex10.Ex10 exercise10 = new com.glava3.Ex10.Ex10();
                            exercise10.getDescription10();
                            exercise10.getCode10();
                            exercise10.makeEx10();
                            break;
                        case 14:
                            com.glava3.Ex14.Ex14 exercise14 = new com.glava3.Ex14.Ex14();
                            exercise14.getDescription14();
                            exercise14.getCode14();
                            exercise14.makeEx14();
                            break;
                        default:
                            System.out.println("Такого упражнения нет!!!!");

                    }
                    break;
            case 4:
                switch (exercise) {
                    case 18:
                        com.glava4.Ex18.Ex18 exercise18 = new com.glava4.Ex18.Ex18();
                        exercise18.getDescription18();
                        exercise18.getCode18();
                        exercise18.makeEx18();
                        break;
                    case 22:
                        com.glava4.Ex22.Ex22 exercise22 = new com.glava4.Ex22.Ex22();
                        exercise22.getDescription22();
                        exercise22.getCode22();
                        exercise22.makeEx22();
                        break;
                    default:
                        System.out.println("Такого упражнения нет!!!!");

                }
                break;
            case 5:
                switch (exercise) {
                    case 2:
                        com.glava5.Ex2.Ex2 exercise2 = new Ex2();
                        exercise2.getDescription2();
                        exercise2.getCode2();
                        exercise2.makeEx2();
                        break;
                    case 6:
                        com.glava5.Ex6.Ex6 exercise6 = new Ex6();
                        exercise6.getDescription6();
                        exercise6.getCode6();
                        exercise6.makeEx6();
                        break;
                    case 10:
                        com.glava5.Ex10.Ex10 exercise10 = new Ex10();
                        exercise10.getDescription10();
                        exercise10.getCode10();
                        exercise10.makeEx10();
                        break;
                    case 14:
                        com.glava5.Ex14.Ex14 exercise14 = new Ex14();
                        exercise14.getDescription14();
                        exercise14.getCode14();
                        exercise14.makeEx14();
                        break;
                    case 18:
                        com.glava5.Ex18.Ex18 exercise18 = new Ex18();
                        exercise18.getDescription18();
                        exercise18.getCode18();
                        exercise18.makeEx18();
                        break;
                    default:
                        System.out.println("Такого упражнения нет!!!!");

                }break;

            case 6:
                switch (exercise) {
                    case 2:
                        com.glava6.Ex2.com.company.Ex2 exercise2 = new com.glava6.Ex2.com.company.Ex2();
                        exercise2.getDescription2();
                        exercise2.getCode2();
                        exercise2.makeEx2();
                        break;
                    case 6:
                        com.glava6.Ex6.Ex6 exercise6 = new com.glava6.Ex6.Ex6();
                        exercise6.getDescription6();
                        exercise6.getCode6();
                        exercise6.makeEx6();
                        break;
                    default:
                        System.out.println("Такого упражнения нет!!!!");

                }break;
            case 7:
                switch (exercise) {
                    case 2:
                        com.glava7.Ex2.Ex2 exercise2 = new com.glava7.Ex2.Ex2();
                        exercise2.getDescription2();
                        exercise2.getCode2();
                        exercise2.makeEx2();
                        break;
                    case 6:
                        com.glava7.Ex6.Ex6 exercise6 = new com.glava7.Ex6.Ex6();
                        exercise6.getDescription6();
                        exercise6.getCode6();
                        exercise6.makeEx6();
                        break;
                    case 10:
                        com.glava7.Ex10.Ex10 exercise10 = new com.glava7.Ex10.Ex10();
                        exercise10.getDescription10();
                        exercise10.getCode10();
                        exercise10.makeEx10();
                        break;
                    case 14:
                        com.glava7.Ex14.Ex14 exercise14 = new com.glava7.Ex14.Ex14();
                        exercise14.getDescription14();
                        exercise14.getCode14();
                        exercise14.makeEx14();
                        break;
                    case 18:
                        com.glava7.Ex18.Ex18 exercise18 = new com.glava7.Ex18.Ex18();
                        exercise18.getDescription18();
                        exercise18.getCode18();
                        exercise18.makeEx18();
                        break;
                    case 22:
                        com.glava7.Ex22.Ex22 exercise22 = new com.glava7.Ex22.Ex22();
                        exercise22.getDescription22();
                        exercise22.getCode22();
                        exercise22.makeEx22();
                        break;
                    default:
                        System.out.println("Такого упражнения нет!!!!");

                }
                break;
            case 8:
                switch (exercise) {
                    case 2:
                        com.glava8.Ex2.Ex2 exercise2 = new com.glava8.Ex2.Ex2();
                        exercise2.getDescription2();
                        exercise2.getCode2();
                        exercise2.makeEx2();
                        break;
                    case 6:
                        com.glava8.Ex6.Ex6 exercise6 = new com.glava8.Ex6.Ex6();
                        exercise6.getDescription6();
                        exercise6.getCode6();
                        exercise6.makeEx6();
                        break;
                    case 10:
                        com.glava8.Ex10.Ex10 exercise10 = new com.glava8.Ex10.Ex10();
                        exercise10.getDescription10();
                        exercise10.getCode10();
                        exercise10.makeEx10();
                        break;
                    case 14:
                        com.glava8.Ex14.Ex14 exercise14 = new com.glava8.Ex14.Ex14();
                        exercise14.getDescription14();
                        exercise14.getCode14();
                        exercise14.makeEx14();
                        break;
                    case 18:
                        com.glava8.Ex18.Ex18 exercise18 = new com.glava8.Ex18.Ex18();
                        exercise18.getDescription18();
                        exercise18.getCode18();
                        exercise18.makeEx18();
                        break;
                    default:
                        System.out.println("Такого упражнения нет!!!!");

                }
                break;
        }

    }
}
