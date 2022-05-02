package OOP_Bai5;

public class Room {
    protected String name;
    protected int price;

    public Room() {

    };

    public Room(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
