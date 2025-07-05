package BaekJun;

import java.util.Scanner;

public class BaekJun5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int burgerCmp = 0;
        int drinkCmp = 0;

        for (int i = 0; i < 3; i++) {

            int burger = sc.nextInt();

            if (i == 0) burgerCmp = burger;
            if (burgerCmp >= burger) burgerCmp = burger;
        }

        for (int i = 0; i < 2; i++) {

            int drink = sc.nextInt();

            if (i == 0) drinkCmp = drink;
            if (drinkCmp >= drink) drinkCmp = drink;
        }

        System.out.println(burgerCmp + drinkCmp - 50);
    }
}
