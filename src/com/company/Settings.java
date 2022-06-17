package com.company;
import java.util.Scanner;

public class Settings {
    public void Set(int[] arr2) {
        Scanner scanner = new Scanner(System.in);
        number n1 = new number();
        int n, k, t, f;
        boolean flag1 = false;
        boolean flag2 = false;
        while (!flag1) {
            System.out.println("Хотите ли поставить ограничения?(нет-1 да-0)");
            f = scanner.nextInt();
            if (f == 1) {
                int arr1[] = n1.checkInput();//ввод числа игроком
                BullAndCow b1 = new BullAndCow();
                int[] bullandcow = b1.checkCowAndBull(arr1, arr2);
                b1.NoBoarders(arr1, arr2, bullandcow);
                flag1 = true;
            } else if (f == 0) {
                flag1 = true;
                while (!flag2) {
                    System.out.println("Какое ограничение хотите поставить?(количество попыток-1 время игры-0)");
                    n = scanner.nextInt();
                    if (n == 1) {
                        System.out.println("Введите количество попыток");
                        k = scanner.nextInt();
                        int arr1[] = n1.checkInput();//ввод числа игроком
                        BullAndCow b1 = new BullAndCow();
                        int[] bullandcow = b1.checkCowAndBull(arr1, arr2);
                        b1.Kol(arr1, arr2, bullandcow, k);
                        flag2 = true;

                    } else if (n == 0) {
                        flag2 = true;
                        System.out.println("введите время которые хотите затратить");
                        t = scanner.nextInt();
                        int arr1[] = n1.checkInput();//ввод числа игроком
                        BullAndCow b1 = new BullAndCow();
                        int[] bullandcow = b1.checkCowAndBull(arr1, arr2);
                        b1.time(arr1, arr2, bullandcow, t);

                    } else {
                        System.out.println("Вы ввели неправильное значение");
                        System.out.println("Попробуйте снова");
                    }
                }
            } else {
                System.out.println("Вы ввели неправильное значение");
                System.out.println("Попробуйте снова");
            }

        }
    }
}
