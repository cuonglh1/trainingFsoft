package OOP_Bai5;

public class RoomB extends Room {
    public RoomB() {
        super("B", 300);
    }

    @Override
    public String toString() {
        return "RoomB{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
