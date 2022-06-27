package com.company;

public class GameProcess {
    public void noBoarders(int[] arr1, int[] arr2, int[] bullandcow){
        Number n1 = new Number();
        BullAndCow b1 = new BullAndCow();
        boolean flag = true;
        while (flag) {
            System.out.println("Быки" + bullandcow[1] + "Коровы" + bullandcow[0]);
            arr1 = n1.checkInput();
            bullandcow = b1.checkCowAndBull(arr1, arr2);
            if (bullandcow[1] == 4) {
                flag = false;
                System.out.println("С победой!");
            }
        }
    }


    public void kol(int[] arr1, int[] arr2, int[] bullandcow, int k){

        int i=1;
        Number n1 = new Number();
        BullAndCow b1 = new BullAndCow();
        boolean flag = true;
        while (flag && i<=k) {
            System.out.println("Быки" + bullandcow[1] + "Коровы" + bullandcow[0]);
            arr1 = n1.checkInput();
            bullandcow = b1.checkCowAndBull(arr1, arr2);
            i++;
            if (bullandcow[1] == 4) {
                flag = false;
                System.out.println("С победой!");
            }
            if(i>=k){
                flag = false;
                System.out.println("Вы проиграли");
            }
        }
    }
    public void time(int[] arr1, int[] arr2, int[] bullandcow, int t) {
//        int per=10;
        long nanoTimeStart = System.nanoTime();
        long duration =0;
        Number n1 = new Number();
        BullAndCow b1 = new BullAndCow();
        boolean flag = true;

        while (flag && duration<t) {
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
    public void gameNoBoarders(int[] arr2){
        Number n1 = new Number();
        int arr1[] = n1.checkInput();//ввод числа игроком
        BullAndCow b1 = new BullAndCow();
        int[] bullandcow = b1.checkCowAndBull(arr1, arr2);
        noBoarders(arr1, arr2, bullandcow);
    }

    public void gameKol(int[] arr2, int k){
        Number n1 = new Number();
        int arr1[] = n1.checkInput();//ввод числа игроком
        BullAndCow b1 = new BullAndCow();
        int[] bullandcow = b1.checkCowAndBull(arr1, arr2);
        kol(arr1, arr2, bullandcow, k);
    }
    public void gameTime(int[] arr2, int t){
        Number n1 = new Number();
        int arr1[] = n1.checkInput();//ввод числа игроком
        BullAndCow b1 = new BullAndCow();
        int[] bullandcow = b1.checkCowAndBull(arr1, arr2);
        time(arr1, arr2, bullandcow, t);
    }
}
