package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static String [] cArgs;

    public static void main(String[] args) {
        cArgs = args;
        System.out.println("Список доступных глав: ");
        ChapterEnum.getChapters();
        System.out.print("Выберите номер главы: ");
        int chapter =  in.nextInt();
        ExerciseMaking exercise = new ExerciseMaking();
        exercise.getExercises(chapter);
        System.out.println("Выберите задание: ");
        int exerciseNumber = in.nextInt();
        exercise.getExercise(chapter, exerciseNumber);



	// write your code here
    }
}
