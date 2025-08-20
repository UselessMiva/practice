public class StandardRoom extends ProRoom {
    public StandardRoom(int roomNumber, int capacity) {
        super(roomNumber, capacity, Prices.STANDARD.getPrice());
    }
}