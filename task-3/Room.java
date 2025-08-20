import java.util.Random;

public abstract class Room {
    private int roomNumber;
    private int capacity;
    private int pricePerNight;
    private boolean isReserved;


    public Room(int roomNumber, int capacity, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
    }


    public Room(int roomNumber, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.capacity = new Random().nextInt(4) + 1; // от 1 до 4
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
    }

    // Геттеры и Сеттеры
    public int getRoomNumber() { return roomNumber; }
    public int getCapacity() { return capacity; }
    public int getPricePerNight() { return pricePerNight; }
    public boolean isReserved() { return isReserved; }
    public void setReserved(boolean reserved) { isReserved = reserved; }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "number=" + roomNumber +
                ", capacity=" + capacity +
                ", price=" + pricePerNight +
                ", reserved=" + isReserved +
                '}';
    }
}