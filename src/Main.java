public class Main {
    public static void main(String[] args) {
        int startBalance = 200;
        int replenishmentOfBalance = 1400;

        int bonus;
        if (replenishmentOfBalance > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        System.out.println(replenishmentOfBalance / 100 + startBalance + replenishmentOfBalance + "Итоговая сумма на счету");
    }

}

