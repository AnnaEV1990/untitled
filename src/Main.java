public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int replenishmentOfBalance = 300;

        int bonus;
        if (replenishmentOfBalance > 1000) {
            bonus = replenishmentOfBalance / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus + startBalance + replenishmentOfBalance + "Итоговая сумма на счету");
    }

}

