
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
public class EmpleadoTest {
    
    public EmpleadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
    }

    /**
     * Test of getId method, of class Empleado.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Empleado.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Empleado instance = new Empleado();
        instance.setId(id);
    }

    /**
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = new Empleado();
        instance.setNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Empleado.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Empleado instance = new Empleado();
        instance.setNombre(nombre);
    }

    /**
     * Test of getApellido method, of class Empleado.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Empleado instance = new Empleado();
        instance.setApellido("");
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
    }

    /**
     * Test of setApellido method, of class Empleado.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Empleado instance = new Empleado();
        instance.setApellido(apellido);
    }

    /**
     * Test of getSalario method, of class Empleado.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.getSalario();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setSalario method, of class Empleado.
     */
    @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        double salario = 0.0;
        Empleado instance = new Empleado();
        instance.setSalario(salario);
    }
    
}
