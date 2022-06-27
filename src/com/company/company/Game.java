package com.company;

import java.util.Scanner;

public class Game {
    public Game() {
        Scanner scanner = new Scanner(System.in);


        Number n1 = new Number();

        int arr2[] = n1.rand();//ввод числа компьютером
//        for (int i = 0; i < 4; i++) {
//            System.out.print(arr2[i]);
//        }
//        System.out.println();
        Settings s1 = new Settings();
        s1.Set(arr2);


    }




}
