package model;

/**
 *
 * @author Francisco Larrocca
 */
public class Product {

    private String title;
    private double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * Verificar igualdad de Producto
     * @param o
     * @return true si el producto es igual a o.
     */
    public boolean equals(Object o) {
        if (o instanceof Product) {
            Product p = (Product) o;
            return p.getTitle().equals(title);
        }
        return false;
    }
}
