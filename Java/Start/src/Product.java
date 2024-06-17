public class Product {

    // region field
    private String name;
    private int price;
    private int stock;
    // endregion

    public Product(String name, int price, int stock) {
        setName(name);
        setPrice(price);
        setStock(stock);
    }

    // region Getter, Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    // endregion

    @Override
    public String toString() {
        return "분류: " + getClass().getName() + " 상품명: " + getName() + " 가격: " + calculatePrice() + " 재고: " + getStock();
    }

    protected int calculatePrice() {
        return getPrice();
    }
}
