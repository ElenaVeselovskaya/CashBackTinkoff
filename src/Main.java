public class Main {
    public static void main(String[] args) {
        int amountInRegular = 100;
        int amountInIncreased = 1000;
        int amountInSpecial = 10_000;

        int percentInRegular = 1;
        int percentInIncreased = 5;
        int percentInSpecial = 30;

        int result = (amountInRegular * percentInRegular +
                amountInIncreased * percentInIncreased +
                amountInSpecial * percentInSpecial) / 100;
        int cashback;

        if (result > 3000) {
            cashback = 3000;
        } else {
            cashback = result;
        }
        System.out.println(cashback);
    }
}
