package com.company;

import java.util.Random;
import java.util.Scanner;

public class number {

    private int[] num = new int[4];
    private int[] inputArray;


    public int[] rand() {
        Random random = new Random();

        int rand = random.nextInt(10);
        for (int i = 0; i < 4; i++) {
            while (!checkOnRepeat(num, rand))
                rand = random.nextInt(10);
            num[i] = rand;
            rand = random.nextInt(10);
        }
        return num;
    }

    public static boolean checkOnRepeat(int[] num, int rand) {
        for (int i : num)
            if (i == rand)
                return false;

        return true;
    }


    public int[] checkInput() {
        Scanner scanner = new Scanner(System.in);
        int num;
        int[] arr = new int[4];
         System.out.println("Введите четырехзначное число через ввод");

        boolean checkMas = false;
        while (!checkMas) {
            num = scanner.nextInt();
            for (int i = 3; i >= 0; i--) {
                arr[i]= num % 10;
                num/=10;
            }

            boolean check = checkInputArray(arr);
            if (check) {
                checkMas = true;
            } else {
                System.out.println("Введенное число содержит повторяющиеся числа");
                System.out.println("Повторите ввод сначала");
            }
        }
        setInputArray(arr);

        return arr;
    }
    
    private boolean checkInputArray(int[] arr) {
        boolean checkMas = false;
        boolean check = false;
        for (int i = 0; i < arr.length && !check; i++) {
            for (int j = 0; j < arr.length && !check; j++) {

                if (i != j) {
                    if (arr[i] == arr[j]) {
                        check = true;
                        checkMas = false;
                    } else checkMas = true;
                }
            }
        }
        return checkMas;
    }

    public void setInputArray(int[] inputArray) {
        this.inputArray = inputArray;
    }
}
