public class BasicRoomService implements RoomService<Room> {
    @Override
    public void clean(Room room) {
        System.out.println("Производится уборка в комнате №" + room.getRoomNumber());
    }

    @Override
    public void reserve(Room room) {
        if (room.isReserved()) {
            throw new RoomAlreadyReservedException("Ошибка: Комната №" + room.getRoomNumber() + " уже забронирована!");
        }
        room.setReserved(true);
        System.out.println("Комната №" + room.getRoomNumber() + " успешно забронирована.");
    }

    @Override
    public void free(Room room) {
        if (!room.isReserved()) {
            System.out.println("Информация: Комната №" + room.getRoomNumber() + " и так свободна.");
            return;
        }
        room.setReserved(false);
        System.out.println("Комната №" + room.getRoomNumber() + " освобождена.");
    }
}