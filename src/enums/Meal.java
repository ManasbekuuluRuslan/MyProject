package enums;

public enum Meal {
    SUSHI(600),
    PIZZA(450),
    BURGER(280),
    LAGMAN(300),
    PEPSI(80);
    private int price;

    Meal(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
