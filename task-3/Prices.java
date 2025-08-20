public enum Prices {
    ECONOMY(1500),
    STANDARD(2500),
    LUX(5000),
    ULTRA_LUX(10000);

    private final int price;

    Prices(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}