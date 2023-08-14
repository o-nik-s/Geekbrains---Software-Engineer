/**
 * Вы принимаете участие в проекте(приложение покупки билета на автобус). Вам
 * доступен проект разработанный вашей командой. Осталась только ваша часть до
 * релиза. Вам предстоит:
 * 1) Разработать по UML диаграмме классы домена приложения: User, Carrier,
 * BankAccount и Ticket
 * 2) Разработать по UML диаграмме классы: TicketProvider и CashProvider
 * Полностью разработанный проект должен собраться и выполниться. Общая UML
 * диаграмма, проект и UML неразработанных классов приложена в материалах курса.
 **/

/**
 * Модель банковского аккаунта
 **/

public class BankAccount {

    private long card;
    private static long oldCard;
    private int balance;

    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getCard() {
        return card;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card = " + (String.format("%016d", card));
    }
}