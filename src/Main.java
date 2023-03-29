public class Main {
    public static void main(String[] args) {

        int currentBalance = 100; // начальная сумма на счету клиента
        int refillAmount = 1250; // сумма пополнения

        int bonus = 0; // инициализируем переменную бонуса нулем

        if (refillAmount > 1000) { // если сумма пополнения больше 1000

            bonus = (refillAmount - 1000) / 100; // рассчитываем количество бонусных рублей
        }

        int totalBalance = currentBalance + refillAmount + bonus; // рассчитываем итоговый баланс

        System.out.println("Итоговый счёт: " + totalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");

    }
}
