package com.tax.income.java;

import java.util.Scanner;

public class Calculate {
    public double CalculateTax(int salary,int statusnikah,int statuschild){
        int TK0 = 54000000;
        int K0 = 58500000;
        int K1 = 63000000;
        int K2 = 67500000;
        int K3 = 72000000;

        int taxe5 = 50000000;
        int taxe15 = 250000000;
        int taxe25 = 500000000;

        double totTax5 = 0;
        double totTax15 = 0;
        double totTax25 = 0;
        double totTax30 = 0;

        int annualIncome = 0;


        int totalGaji = salary * 12;

        if (statusnikah == 1) {
            annualIncome = totalGaji - TK0;
        } else if (statusnikah == 2) {

            if (statuschild == 1) {
                annualIncome = totalGaji - K0;
            } else if (statuschild == 2) {
                annualIncome = totalGaji - K1;
            } else if (statuschild == 3) {
                annualIncome = totalGaji - K2;
            } else if (statuschild == 4) {
                annualIncome = totalGaji - K3;
            }
        }

        if (annualIncome <= taxe5) {
            totTax5 = annualIncome * 0.05;
        } else if (annualIncome > taxe5) {
            totTax5 = taxe5 * 0.05;

            if (annualIncome - taxe5 > 0 && annualIncome - taxe5 < taxe15) {
                int taxeInc15 = annualIncome - taxe5;
                totTax15 = taxeInc15 * 0.15;
            } else if (annualIncome - taxe5 > 0 && annualIncome - taxe5 >= taxe15) {
                int taxeInc15 = taxe15 - taxe5;
                totTax15 = taxeInc15 * 0.15;

                int taxeInc25 = annualIncome - taxe15;
                if (annualIncome - taxe15 > 0 && annualIncome - taxe15 < taxe25) {
                    totTax25 = taxeInc25 * 0.25;
                } else if (annualIncome - taxe15 > 0 && annualIncome - taxe15 >= taxe25) {
                    int taxeIncome25 = annualIncome - taxe25;
                    totTax25 = taxeIncome25 * 0.025;
                }

                int taxeInc30 = annualIncome - taxe25;
                if (taxeInc30 > 0 && taxeInc30 < taxe25) {
                    totTax30 = taxeInc30 * 0.30;
                }
            }
        }


        double totaltax = totTax5 + totTax15 + totTax25 + totTax30;
        System.out.println(((int) totaltax));
        return totaltax;
    }
}
