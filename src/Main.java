public class Main {
    public static void main(String[] args) {
        int amount = 200;
        int x = 1300;

        int bonus;
        if (x > 1000) {
            bonus = 1;
        } else{
            bonus = 0;
        }
        System.out.println(x / 100 + amount+x + "Итоговая сумма на счету");
    }

}

