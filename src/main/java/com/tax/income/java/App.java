package com.tax.income.java;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Calculate calculate = new Calculate();

        int gaji = 0;
        int statusMarried = 0;
        int statuschild = 0;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukkan gaji bulanan :");
        gaji = myObj.nextInt();

        System.out.println("Status Menikah : (1) Belum Menikah, (2) Menikah");
        statusMarried = myObj.nextInt();
        if (statusMarried == 1) {
            calculate.CalculateTax(gaji, statusMarried, 0);
        } else if (statusMarried == 2) {
            System.out.println("Status Anak : (1) Belum Punya Anak, (2) 1 Anak, (3) 2 Anak, (4) 3 Anak");
            statuschild = myObj.nextInt();
            calculate.CalculateTax(gaji, statusMarried, statuschild);
        }

    }

}
