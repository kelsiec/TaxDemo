package main;

public class Tax {
    public static double tax(int salary) {
        final int BRACKET_1 = 7150;
        final int BRACKET_2 = 29050;
        final int BRACKET_3 = 70350;

        double graduated_tax = salary * .1;
        int flat_tax = 0;

        if (salary > BRACKET_3) {
            graduated_tax = (salary - BRACKET_3) * .28;
            flat_tax = 14325;
        } else if (salary >= BRACKET_2) {
            graduated_tax = (salary - BRACKET_2) * .25;
            flat_tax = 4000;
        } else if (salary >= BRACKET_1) {
            graduated_tax = (salary - BRACKET_1) * .15;
            flat_tax = 715;
        }

        return graduated_tax + flat_tax;
    }
}
