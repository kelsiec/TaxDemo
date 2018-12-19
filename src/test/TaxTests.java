package test;

import org.junit.Assert;
import org.junit.Test;

import main.Tax;

public class TaxTests {
    private static final double DELTA = 0.0001;


    @Test
    public void taxLowSalary() {
        Assert.assertEquals(600, Tax.tax(6000), DELTA);
    }

    @Test
    public void taxNoSalary() {
        Assert.assertEquals(0.0, Tax.tax(0), DELTA);
    }

    @Test
    public void taxBracket1() {
        Assert.assertEquals(1142.5, Tax.tax(10000), DELTA);
    }

    @Test
    public void taxBracket2() {
        Assert.assertEquals(4237.5, Tax.tax(30000), DELTA);
    }

    @Test
    public void taxBracket3() {
        Assert.assertEquals(22627.00, Tax.tax(100000), DELTA);
    }
}
