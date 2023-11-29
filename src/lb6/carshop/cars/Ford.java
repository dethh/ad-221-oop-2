package lb6.carshop.cars;

public class Ford extends Car {
    int year;
    int manufacturerDiscount;

    @Override
    public double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }
}