package com.company;

public class BullAndCow {
    public int[] checkCowAndBull(int[] arr1, int[] arr2) {

        int[] arr = new int[2];
        int cow = 0;
        int bull = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (arr2[i] == arr1[j]) {
                    if (i == j) bull++;
                    else cow++;
                }
            }
        }
        arr[0] = cow;
        arr[1] = bull;
        return arr;
    }
    public void NoBoarders(int[] arr1, int[] arr2, int[] bullandcow){
        number n1 = new number();
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

    public void Kol(int[] arr1, int[] arr2, int[] bullandcow, int k){

        int i=1;
        number n1 = new number();
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
        number n1 = new number();
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

}
