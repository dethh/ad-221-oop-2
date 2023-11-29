package lb6.carshop.cars;

public class Sedan extends Car {
    int length;

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95; // скидка 5%
        } else {
            return regularPrice;
        }
    }
}