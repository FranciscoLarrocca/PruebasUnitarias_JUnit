package modelo;


import modelo.Aritmetica;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

public class AritmeticaTest {

    private Aritmetica aritmetica;

    @Before //Marca un método que se ejecuta siempre antes que cualquier test.
    public void init() {
        aritmetica = new Aritmetica();
    }

    @After
    public void finish() {
        aritmetica = null;
    }

    @Test //La etiqueta @Test marca un método como método de prueba. Los métodos de prueba siempre deben ser public void.
    public void suma() {

        aritmetica = new Aritmetica();

        assertEquals("Failed", 4, aritmetica.suma(3, 1), 4); //assertEquals(valorEsperado, valorReal, error) compara el valor esperado con el real dentro de un error.
    }

    @Test
    public void testResta() {
        aritmetica = new Aritmetica();
        assertEquals(3, aritmetica.resta(4, 1), 3);
    }

    @Test
    public void testMultiplicacion() {
        aritmetica = new Aritmetica();
        assertEquals(6, aritmetica.multiplicacion(2, 3), 6);
    }

    @Test
    public void testDivision() {
        aritmetica = new Aritmetica();
        assertEquals(5, aritmetica.division(10, 2), 5);
    }
}
