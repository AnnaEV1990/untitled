public class Main {
    public static void main(String[] args) {
        int start_balance = 200;
        int replenishment_of_balance = 1400;

        int bonus;
        if (replenishment_of_balance > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        System.out.println(replenishment_of_balance / 100 + start_balance + replenishment_of_balance + "Итоговая сумма на счету");
    }

}

