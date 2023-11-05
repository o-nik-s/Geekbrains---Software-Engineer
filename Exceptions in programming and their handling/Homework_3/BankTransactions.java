package Homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Вы разрабатываете систему банковских транзакций. Необходимо написать программу,
 * которая позволяет пользователям осуществлять переводы средств со своего банковского счета на другие счета.
 * Однако, в системе существуют некоторые ограничения и возможные ошибки, которые нужно обрабатывать.
 *
 * При переводе средств сумма должна быть положительной и не превышать доступный баланс на счете.
 * Если сумма перевода отрицательная или равна нулю, выбрасывается исключение InvalidAmountException
 * с сообщением "Некорректная сумма перевода".
 * Если на балансе недостаточно средств для перевода, выбрасывается исключение InsufficientFundsException
 * с сообщением "Недостаточно средств на счете".
 * При успешном переводе, сумма должна списываться с текущего счета и зачисляться на целевой счет.
 */

public class BankTransactions {
    static double balance = 1000000, otherBalance = 3000000;
    public static double[] bankTransaction(double balance, double otherBalance, double transferMoney) throws InvalidAmountException, InsufficientFundsException {
        if (transferMoney <= 0) {
            throw new InvalidAmountException("Некорректная сумма перевода!");
        }
        else if (balance < transferMoney) {
            throw new InsufficientFundsException("Недостаточно средств на счете!");
        }
        balance -= transferMoney;
        otherBalance += transferMoney;
        return new double[]{balance, otherBalance};
    }

    public static void main(String[] args) {

        System.out.println("На Вашем балансе " + balance + " рублей");
        try {
            double transferMoney = getInputNumber("Введите сумму перевода: ");
            double[] money = bankTransaction(balance, otherBalance, transferMoney);
            System.out.println("Транзакция успешно выполнена!");
            balance = money[0];
            otherBalance = money[1];
            System.out.println("На Вашем балансе осталось " + balance + " рублей");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Сумма не распознана");
        } catch (InvalidAmountException e) {
            handleInvalidAmountException(e);
        } catch (InsufficientFundsException e) {
            handleInsufficientFundsException(e);
        }
    }

    private static double getInputNumber(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static void handleInvalidAmountException(InvalidAmountException e) {
        System.out.println("Ошибка: " + e.getMessage());
        // Дополнительная обработка исключения на более высоком уровне абстракции
        // Например, запись лога, уведомление пользователя или выбор альтернативного пути выполнения программы
        // ...
    }
    private static void handleInsufficientFundsException(InsufficientFundsException e) {
        System.out.println("Ошибка: " + e.getMessage());
        // Дополнительная обработка исключения на более высоком уровне абстракции
        // Например, запись лога, уведомление пользователя или выбор альтернативного пути выполнения программы
        // ...
    }
    static class InvalidAmountException extends Exception {
        public InvalidAmountException(String message) {
            super(message);
        }
    }
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
}
