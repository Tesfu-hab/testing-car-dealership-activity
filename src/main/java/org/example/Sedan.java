package org.example;

public class Sedan extends Car{
    private boolean isElectric;
    public Sedan(String make, String model, int price, boolean isElectric) {
        super(make, model, price);
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Sedan{" + super.toString() + ", " +
                "isElectric=" + isElectric +
                '}';
    }
}
