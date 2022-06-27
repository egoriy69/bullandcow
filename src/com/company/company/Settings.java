package com.company;
import java.util.Scanner;

public class Settings {
    public void Set(int[] arr2) {
        Scanner scanner = new Scanner(System.in);
        Number n1 = new Number();
        GameProcess g1 = new GameProcess();
        int n, k, t, f;
        boolean flag1 = false;
        boolean flag2 = false;
        while (!flag1) {
            System.out.println("Хотите ли поставить ограничения?(нет-1 да-0)");
            f = scanner.nextInt();
            if (f == 1) {
                g1.gameNoBoarders(arr2);
                flag1 = true;
            } else if (f == 0) {
                flag1 = true;
                while (!flag2) {
                    System.out.println("Какое ограничение хотите поставить?(количество попыток-1 время игры-0)");
                    n = scanner.nextInt();
                    if (n == 1) {
                        System.out.println("Введите количество попыток");
                        k = scanner.nextInt();
                        g1.gameKol(arr2,k);
                        flag2 = true;
                    } else if (n == 0) {
                        flag2 = true;
                        System.out.println("введите время которые хотите затратить");
                        t = scanner.nextInt();
                        g1.gameTime(arr2,t);

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
