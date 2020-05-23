package test;

import exception.ProductNotFoundException;
import model.Product;
import model.ShoppingCart;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Francisco Larrocca
 */
public class ShoppingCartTest {

    private ShoppingCart _bookCart;
    private Product _defaultBook;

    public ShoppingCartTest() {
    }

    @Before
    public void setUp() {

        _bookCart = new ShoppingCart();
        _defaultBook = new Product("Extremme Programming", 23.95);

        _bookCart.addItem(_defaultBook);
    }

    @After
    public void tearDown() {
        _bookCart = null;
    }

    /**
     * Test para agregar un producto.
     */
    @Test
    public void testProductAdd() {
        Product newBoock = new Product("Refactoring", 53.95);
        _bookCart.addItem(newBoock);

        double expectedBalance = _defaultBook.getPrice() + newBoock.getPrice();

        assertEquals(expectedBalance, _bookCart.getBalance(), 0.0);
        assertEquals(2, _bookCart.getItemCount());
    }

    /**
     * Test para vaciar la lista de Productos
     */
    @Test
    public void testEmpty() {
        _bookCart.empty();
        assertTrue(_bookCart.isEmpty());
    }

    /**
     * Test para eliminar un producto de la lista de Productos.
     *
     * @throws ProductNotFoundException
     */
    @Test
    public void testProductRemove() throws ProductNotFoundException {
        _bookCart.removeItem(_defaultBook);

        assertEquals(0, _bookCart.getItemCount());
        assertEquals(0.0, _bookCart.getBalance(), 0.0);
    }

    /**
     * Test para eliminar un producto no valido(arroja excepcion).
     */
    @Test
    public void testProductNotFound() {
        try {
            Product book = new Product("Ender's Game", 4.95);
            _bookCart.removeItem(book);
        } catch (ProductNotFoundException succes) {
            //Test correcto
            System.out.println(succes.getMessage());            
        }
    }

}
