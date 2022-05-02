package OOP_Bai12;

public class Car extends Transport{

    private int seat;

    private String engineType;

    public Car(String id, String manufacturer, int yearOfManufacture, float price, String color, int seat) {
        super(id, manufacturer, yearOfManufacture, price, color);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seat=" + seat +
                ", engineType='" + engineType + '\'' +
                ", Id='" + id + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
