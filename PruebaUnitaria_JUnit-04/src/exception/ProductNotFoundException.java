
package exception;

/**
 *
 * @author Francisco Larrocca
 */
public class ProductNotFoundException extends Exception {

    public ProductNotFoundException() {
        super(new String("Ocurrio un error, no se encuentra el producto"));
    }
    
}
