package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа: ");
        Scanner scan = new Scanner(System.in);
        int ch1 = scan.nextInt();
        int ch2 = scan.nextInt();
        int ch3 = scan.nextInt();
        int pozit = 0;
        int neg = 0;
        if (ch1 > 0) {
            pozit++;}
        else if (ch1 < 0) {
            neg++; }
        if (ch2 > 0) {
            pozit++; }
        else if (ch2 < 0) {
        neg++; }
        if (ch3 > 0) {
            pozit++; }
        else if (ch3 < 0) {
        neg++;}

        System.out.println("Количество положительных чисел: " + pozit);
        System.out.println("Количество отрицательных чисел: " + neg);

    }
}

