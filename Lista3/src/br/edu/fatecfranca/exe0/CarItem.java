package br.edu.fatecfranca.exe0;
// é objeto todo para Product
public class CarItem {
    private int id;
    private int quantity;
    // agregação - objeto parte no objeto todo
    private Product product;

    public CarItem() {
    }
    public CarItem(Product product, int quantity, int id) {
        this.product = product;
        this.quantity = quantity;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CarItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
