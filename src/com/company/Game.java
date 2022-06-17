package com.company;

import java.util.Scanner;
import java.util.Timer;

public class Game {
    public Game() {
        Scanner scanner = new Scanner(System.in);


        number n1 = new number();

        int arr2[] = n1.rand();//ввод числа компьютером
        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
        Settings s1 = new Settings();
        s1.Set(arr2);
//        int arr1[] = n1.checkInput();//ввод числа игроком
//        BullAndCow b1 = new BullAndCow();
//        int[] bullandcow = b1.checkCowAndBull(arr1, arr2);
//        time(arr2,arr1,bullandcow);

    }


    public void time(int[] arr2, int[] arr1, int[] bullandcow) {
        int per=10;
        long nanoTimeStart = System.nanoTime();
        long duration =0;
            number n1 = new number();
            BullAndCow b1 = new BullAndCow();
            boolean flag = true;

            while (flag && duration<per) {
                System.out.println("Быки" + bullandcow[1] + "Коровы" + bullandcow[0]);
                arr1 = n1.checkInput();
                bullandcow = b1.checkCowAndBull(arr1, arr2);

                if (bullandcow[1] == 4) {
                    flag = false;
                    System.out.println("С победой!");
                }

                long nanoTimeFinish = System.nanoTime();
                duration = (nanoTimeFinish - nanoTimeStart)/1000000000;
            }
            if(flag){
                System.out.println();
                System.out.println("Время закончилось, вы проиграли!");
            }
    }


}
