package com.company;


import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        // first();
        // second();
        //third();
        //fourth();
        //fifth();
        //sixth();
        //seventh();
        //eighth();
        //ninth();


    }

    private static void ninth() {
        int n = 1;
        Random random = new Random();
        int[] a = new int[15];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(1000);

        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (i % 2 > 0 && a[i] % 2 == 0) {
                a[i] = 0;
                System.out.println(i + " chet nechet");
            }
            else
                if ((a[i] % 3) == 0 && (a[i] % 5) == 0) {
                a[i] = 0;
                    System.out.println(i + " 3 i 5");
            }


        }
        System.out.println(Arrays.toString(a));
    }

    private static void eighth() {
        int n = 1;
        Random random = new Random();
        int[] a = new int[15];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(6) - 2;

        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0)
                a[i] = 0;
            else if (a[i] > n)
                a[i] = 10 + 1;
        }
        System.out.println(Arrays.toString(a));

    }

    private static void seventh() {
        Random random = new Random();
        int[] a = new int[15];
        int temp;
        Arrays.fill(a, 13);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1])
                a[i] = 101 + i;
        }
        System.out.println(Arrays.toString(a));
    }

    private static void sixth() {
        Random random = new Random();
        int[] a = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50);


        }
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        a[0] = 0;
        a[6] = 0;
        System.out.println(Arrays.toString(a));
    }

    private static void fifth() {
//        Random random = new Random();
//        int s = 0;
//        int[] a = new int[15];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt(100);
//
//        }
//        System.out.println(Arrays.toString(a));
//        for (int q : a) {
//            if (q % 2 == 0 || q % 3 == 0) {
//                s++;
//            } else if (a) {
//                s++;
//                System.out.print(q + " prostoe");
//            }
//        }
//
//
//    }
    }

    private static void fourth() {
        int sum = 0, max = 0;
        double[] a = {12.3, 3.32, 13.2, -2.5, 34.65, 2.4, -1.5, 5.68, 6.7, 25, 25, 25, -3.66};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum++;
            } else if (a[i] < 0) {
                if (max < sum) {
                    max = sum;
                }
                sum = 0;
            }


        }
        System.out.println(Arrays.toString(a));
        System.out.println(max);
    }

    private static void third() {
        Random random = new Random();
        int[] points = new int[18];
        int necessp = 0, shortp = 0, arbitaryp = 0;
        for (int i = 0; i < points.length; i++) {
            points[i] = random.nextInt(4) + 1;
            if (i <= 5)
                necessp += points[i];
            else if (i > 5 && i <= 11)
                shortp += points[i];
            else
                arbitaryp += points[i];
        }
        System.out.println(Arrays.toString(points));
        System.out.println(necessp);
        System.out.println(shortp);
        System.out.println(arbitaryp);
    }

    private static void second() {
        Random random = new Random();
        int[] points = new int[10];
        int sum = 0, limit = 100;
        for (int i = 0; i < points.length; i++) {
            points[i] = random.nextInt(10) + 5;
            sum += points[i];
        }
        System.out.println(Arrays.toString(points));
        System.out.println(sum);
        if (sum >= limit)
            System.out.println("Следующий этап");
        else
            System.out.println("Не прошел");
    }

    private static void first() {
        Random random = new Random();
        int[] a = new int[35];
        int count = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10000);
            sum += a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);

        if (sum / 100000 % 10 > 0)
            System.out.println("True");
        else
            System.out.println("False");


    }


}

