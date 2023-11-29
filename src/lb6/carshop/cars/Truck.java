package lb6.carshop.cars;


public class Truck extends Car {
    int weight;

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9; // скидка 10%
        } else {
            return regularPrice;
        }
    }
}

