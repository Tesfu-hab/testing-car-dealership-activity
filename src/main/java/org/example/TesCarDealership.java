package org.example;

import java.util.ArrayList;

public class TesCarDealership {
    private ArrayList<Car> inventory = new ArrayList<>();
    private double moneyMade = 0;

    private double budget = 30000;
    private double dealerMarkUp = 1.2;

    public String addCar(Car car){
        if(budget > car.getPrice()){
            this.budget -= car.getPrice();
            this.inventory.add(car);
            return "The car has been added to the inventory";
        }
        return "Not enough money in the budget";
    }

    public void sellCar(Car car){
        this.moneyMade += car.getPrice() * dealerMarkUp;
        this.inventory.remove(car);
    }

    public int getInventoryCount(){
        return this.inventory.size();
    }
    public static void main(String[] args) {
        TesCarDealership tonyCarSales = new TesCarDealership();
        Car car1 = new Car ("toyota", "camry", 12000);
        Car car2 = new Sedan("kia", "rio", 800, false);
        Car car3 = new SUV("jeep", "cherokee", 15000, true);

        System.out.println("Purchase 3 vehicles: ");
        System.out.println(tonyCarSales.addCar(car1));
        System.out.println(tonyCarSales.addCar(car2));
        System.out.println(tonyCarSales.addCar(car3));

        System.out.println("Inventory: ");
        System.out.println(tonyCarSales.inventory);
        System.out.println(tonyCarSales.getInventoryCount());
        System.out.println("Budget left: ");
        System.out.println(tonyCarSales.budget);

        System.out.println("Sell all 3 vehicles: ");
        tonyCarSales.sellCar(car1);
        tonyCarSales.sellCar(car2);
        tonyCarSales.sellCar(car3);

        System.out.println("Inventory: ");
        System.out.println(tonyCarSales.inventory);
        System.out.println(tonyCarSales.getInventoryCount());
        System.out.println("Money made: ");
        System.out.println(tonyCarSales.moneyMade);

//        System.out.println(kiaRio);
//        System.out.println(jeepCherokee);
    }
}