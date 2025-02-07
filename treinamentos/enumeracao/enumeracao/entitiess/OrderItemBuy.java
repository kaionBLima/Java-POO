package entitiess;

public class OrderItemBuy {

    private Integer quantity;
    private Double price;

    private ProductBuy productBuy;

    public OrderItemBuy(){
    }

    public OrderItemBuy(Integer quantity, Double price, ProductBuy productBuy) {
        this.quantity = quantity;
        this.price = price;
        this.productBuy = productBuy;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double subTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return productBuy.getNome()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity"
                + quantity
                + ",  Subtotal"
                + String.format("%.2f", subTotal());
    }


}
