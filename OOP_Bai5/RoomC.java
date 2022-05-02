package OOP_Bai5;

public class RoomC extends Room {
    public RoomC() {
        super("A", 500);
    }

    @Override
    public String toString() {
        return "RoomC{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
