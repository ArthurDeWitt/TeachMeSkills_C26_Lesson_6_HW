package com.teachmeskills.lesson6.HW.AddtionalTasks;
/*
Банковский вклад.
Пользователь делает вклад в размере a рублей сроком на years лет под 10% годовых
(каждый год размер его вклада увеличивается на 10%.Эти деньги прибавляются к
сумме вклада, и на них в следующем году тоже будут проценты).
Написать программу bank, принимающая аргументы a и years, и возвращающую
сумму, которая будет на счету пользователя.
 */

import java.util.Scanner;

public class BankAccount {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the deposit amount: ");
            double a = scanner.nextDouble();
            System.out.print("Input the number of years: ");
            int years = scanner.nextInt();
            double result = a * Math.pow(1 + 0.1, years);
            System.out.printf("Amount on user's account: %.2f roubles", result);
        }
    }