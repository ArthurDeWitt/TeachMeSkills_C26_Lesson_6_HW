package com.teachmeskills.lesson6.HW.Homework0;

/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Создайте один конструктор с двумя параметрами.
Добавьте метод, который позволяет начислять сумму на кредитную карточку. Метод принимает на вход сумму и добавляет эту сумму к текущей.
Подуймайте, как стоит задать входные и выходные параметры метода.
Добавьте метод, который позволяет снимать с карточки некоторую сумму. Метод принимает на вход сумму и отнимает эту сумму от текущей.
Подуймайте, как стоит задать входные и выходные параметры метода.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.
 */

public class creditCard {
    // Инициализация приватного поля accountNumber типа String и поля currentBalance
    public String accountNumber;
    public double currentBalance;

    // Инициализация конструктора с двумя параметрами accountNumber и currentBalance
    public creditCard(String accountNumber, double currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    // Инициализация метода deposit с одним параметром с добавлением переданного параметра к текущему балансу
    public void deposit(double amount) {
        this.currentBalance += amount;
    }

    // Инициализация метода для снятия денег с карты withdrawFromCard с одним параметром
    public void withdrawFromCard(double amount) {

        // Проверяем, что запрашиваемая сумма меньше или равна текущему балансу
        if (amount <= this.currentBalance) {

            // Вычитание значения переданного параметра из текущего баланса
            this.currentBalance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Инициализация метода creditCardInfo без параметров
    public void creditCardInfo() {

        // Вывод на консоль номера счёта и текущего баланса
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Current Balance: " + this.currentBalance);
    }
}
