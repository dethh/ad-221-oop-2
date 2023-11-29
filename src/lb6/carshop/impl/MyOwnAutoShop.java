package lb6.carshop.impl;


import lb6.carshop.cars.Car;
import lb6.carshop.cars.Sedan;
import lb6.carshop.cars.Ford;
import lb6.carshop.cars.Truck;
import lb6.carshop.interfaces.Admin;
import lb6.carshop.interfaces.Customer;

public class MyOwnAutoShop implements Admin, Customer {
    private Car[] cars;

    public MyOwnAutoShop() {
        cars = new Car[5];
        cars[0] = new Sedan();
        cars[1] = new Ford();
        cars[2] = new Ford();
        cars[3] = new Truck();
        cars[4] = new Truck();
    }

    @Override
    public double getIncome() {
        double totalIncome = 0;
        for (Car car : cars) {
            totalIncome += car.getSalePrice();
        }
        return totalIncome;
    }

    @Override
    public double getCarsPrice() {
        // Implement according to your requirements
        return 0;
    }

    @Override
    public String getCarColors() {
        // Implement according to your requirements
        return null;
    }

    @Override
    public double getCarPrice(int id) {
        // Implement according to your requirements
        return 0;
    }

    @Override
    public String getCarColor(int id) {
        // Implement according to your requirements
        return null;
    }

    @Override
    public void purchaseCar(int id) {
        // Implement according to your requirements
    }
}
