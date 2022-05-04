package OOP_Bai12;

public class Motorbike extends Vehicle {

    private double capacity;

    public Motorbike(String id, String manufacturer, int yearOfManufacture, float price, String color, double capacity) {
        super(id, manufacturer, yearOfManufacture, price, color);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "capacity=" + capacity +
                ", id='" + id + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
