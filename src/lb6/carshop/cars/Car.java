package lb6.carshop.cars;

public abstract class Car {
    int speed;
    boolean isSellOut;
    double regularPrice;
    String color;

    public abstract double getSalePrice();
}
