public class Tax {
    public static double tax(int salary) {
        final int BRACKET1 = 7150;
        final int BRACKET2 = 29050;
        final int BRACKET3 = 70350;

        double graduatedTax = salary * .1;
        int flatTax = 0;

        if (salary > BRACKET3) {
            graduatedTax = (salary - BRACKET3) * .28;
            flatTax = 14325;
        } else if (salary >= BRACKET2) {
            graduatedTax = (salary - BRACKET2) * .25;
            flatTax = 4000;
        } else if (salary >= BRACKET1) {
            graduatedTax = (salary - BRACKET1) * .15;
            flatTax = 715;
        }

        return graduatedTax + flatTax;
    }
}
