package com.tax.income.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        Calculate calculate = new Calculate();

       calculate.CalculateTax(25000000, 1, 0);

       calculate.CalculateTax(6500000, 2, 2);

       calculate.CalculateTax(12500000, 2, 1);

       calculate.CalculateTax(2000000, 2, 3);

       calculate.CalculateTax(3000000, 2, 4);


        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
