public class EconomyRoom extends Room {
    public EconomyRoom(int roomNumber, int capacity) {
        super(roomNumber, capacity, Prices.ECONOMY.getPrice());
    }
}