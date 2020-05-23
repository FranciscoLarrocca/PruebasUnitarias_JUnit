package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Francisco Larrocca
 */
public class NumeroMayorTest {

    private static NumeroMayor instance;

    public NumeroMayorTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new NumeroMayor();
    }

    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testNumeroMayor_1() {
        int a = 5;
        int b = 3;
        int c = 7;
        int expResult = c;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void testNumeroMayor_2() {
        int a = 5;
        int b = 3;
        int c = 4;
        int expResult = a;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void testNumeroMayor_3() {
        int a = 5;
        int b = 7;
        int c = 6;
        NumeroMayor instance = new NumeroMayor();
        int expResult = b;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void testNumeroMayor_4() {
        int a = 5;
        int b = 7;
        int c = 9;
        int expResult = c;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);
    }

}
