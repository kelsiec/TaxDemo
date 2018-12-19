package test;

import org.junit.Assert;
import org.junit.Test;

import main.Tax;

public class TaxTests {
    private static final double DELTA = 0.0001;


    @Test
    public void tax_low_salary() {
        Assert.assertEquals(600, Tax.tax(6000), DELTA);
    }

    @Test
    public void tax_no_salary() {
        Assert.assertEquals(0.0, Tax.tax(0), DELTA);
    }

    @Test
    public void tax_bracket_1() {
        Assert.assertEquals(1142.5, Tax.tax(10000), DELTA);
    }

    @Test
    public void tax_bracket_2() {
        Assert.assertEquals(4237.5, Tax.tax(30000), DELTA);
    }

    @Test
    public void tax_bracket_3() {
        Assert.assertEquals(22627.00, Tax.tax(100000), DELTA);
    }
}
