package edu.escuelaing.arem.ASE.app.services;

import edu.escuelaing.arem.ASE.app.SparkConverterTest;
import edu.escuelaing.arem.ASE.app.services.impl.ConverterServiceImpl;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Juan Carlos Alayon Molina
 * @version 1.0
 */
public class ConverterTest extends TestCase {
    ConverterService converterService = new ConverterServiceImpl();

    public ConverterTest() {
        ConverterTest converterTest;
    }

    /**
     * Create the test case
     *
     * @param name name of the test case
     */
    public ConverterTest(String name) {
        super(name);
        ConverterTest converterTest;
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ConverterTest.class );
    }

    public void testShouldConvertNegativefahrenheitToCelcius() {
        String expectOutput = "-295.55557";
        float answer = converterService.FarToCel(-500);
        System.out.println(converterService.FarToCel(-500));
        assertEquals(expectOutput, String.valueOf(answer));
    }

    public void testShouldConvertZerofahrenheitToCelcius() {
        String expectOutput = "-17.777779";
        float answer = converterService.FarToCel(0);
        assertEquals(expectOutput, String.valueOf(answer));
    }

    public void testShouldConvertPositivefahrenheitToCelcius() {
        String expectOutput = "260.0";
        float answer = converterService.FarToCel(500);
        assertEquals(expectOutput, String.valueOf(answer));
    }

    public void testShouldConvertNegativeCelsiusToFahrenheit() {
        String expectOutput = "-868.0";
        String expectedStatus = "200";
        float answer = converterService.CelToFar(-500);
        assertEquals(expectOutput, String.valueOf(answer));
    }

    public void testShouldConvertZeroCelsiusToFahrenheit() {
        String expectOutput = "32.0";
        String expectedStatus = "200";
        float answer = converterService.CelToFar(0);
        assertEquals(expectOutput, String.valueOf(answer));

    }

    public void testShouldConvertPositiveCelsiusToFahrenheit() {
        String expectOutput = "932.0";
        String expectedStatus = "200";
        float answer = converterService.CelToFar(500);
        assertEquals(expectOutput, String.valueOf(answer));
    }

}
