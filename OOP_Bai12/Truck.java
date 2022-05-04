package OOP_Bai12;

public class Truck extends Vehicle {

    private double tonnage;

    public Truck(String id, String manufacturer, int yearOfManufacture, float price, String color, double tonnage) {
        super(id, manufacturer, yearOfManufacture, price, color);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tonnage=" + tonnage +
                ", id='" + id + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
