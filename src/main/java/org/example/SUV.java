package org.example;

public class SUV extends Car{
    private boolean isLifted;
    public SUV(String make, String model, int price, boolean isLifted) {
        super(make, model, price);
        this.isLifted = isLifted;
    }

    public boolean isLifted() {
        return isLifted;
    }

    public void setLifted(boolean lifted) {
        isLifted = lifted;
    }

    @Override
    public String toString() {
        return "SUV{" + super.toString() + ", " +
                "isLifted=" + isLifted +
                '}';
    }
}
