public class PremiumHotelService implements LuxRoomService<LuxRoom> {
    @Override
    public void clean(LuxRoom room) {
        System.out.println("Производится VIP-уборка в люкс-комнате №" + room.getRoomNumber());
    }

    @Override
    public void reserve(LuxRoom room) {
        if (room.isReserved()) {
            throw new RoomAlreadyReservedException("Ошибка: Люкс-комната №" + room.getRoomNumber() + " уже забронирована!");
        }
        room.setReserved(true);
        System.out.println("Люкс-комната №" + room.getRoomNumber() + " успешно забронирована.");
    }

    @Override
    public void free(LuxRoom room) {
        if (!room.isReserved()) {
            System.out.println("Информация: Люкс-комната №" + room.getRoomNumber() + " и так свободна.");
            return;
        }
        room.setReserved(false);
        System.out.println("Люкс-комната №" + room.getRoomNumber() + " освобождена.");
    }

    @Override
    public void foodDelivery(LuxRoom room) {
        System.out.println("Доставка еды в люкс-комнату №" + room.getRoomNumber() + ".");
    }
}