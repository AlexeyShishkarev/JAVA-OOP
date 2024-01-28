package product;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getPrice(){
        return price;
    }


    /**
     * Переопределение метода toString для правильной печати продукта
     * @return
     */
    @Override
    public String toString() {
        return name + " - " + price + " руб.";
    }
}
