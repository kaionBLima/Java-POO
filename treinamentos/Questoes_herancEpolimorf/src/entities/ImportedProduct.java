package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return super.getPrice() + (super.getPrice() * customsFee);
    }

    @Override
    public String priceTag() {
        return super.getName() + " " + totalPrice() + " (Customs fee: $ " + customsFee + ")";
    }
}
