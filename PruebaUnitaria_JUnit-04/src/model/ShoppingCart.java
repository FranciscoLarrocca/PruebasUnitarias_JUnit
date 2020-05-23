package model;

import exception.ProductNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Francisco Larrocca
 */
public class ShoppingCart {

    private ArrayList _items;

    public ShoppingCart() {
        _items = new ArrayList();
    }

    /**
     * Retornar el balance.
     *
     * @return Balance
     */
    public double getBalance() {
        Iterator i = _items.iterator();

        double balance = 0.0;
        while (i.hasNext()) {
            Product p = (Product) i.next();
            balance = balance + p.getPrice();
        }
        return balance;
    }

    /**
     * Agregar un item a la lista de Productos.
     * @param p 
     */
    public void addItem(Product p) {
        _items.add(p);
    }
    
    /**
     * Eliminar un item de la lista Productos. (Arroja una excepcion).
     * @param p
     * @throws ProductNotFoundException 
     */
    public void removeItem(Product p) throws ProductNotFoundException {
        if (!_items.remove(p)) {
            throw new ProductNotFoundException();
        }
    }

    /**
     * Retorna el numero de elementos de la lista Productos.
     * @return _items.size()
     */
    public int getItemCount() {
        return _items.size();
    }

    /**
     * Crear una nueva lista de Productos.
     */
    public void empty() {
        _items = new ArrayList();
    }
    
    /**
     * Verificar si la lista de Productos esta vacia.
     * @return boolean
     */
    public boolean isEmpty() {
        return (_items.size() == 0);
    }
}
