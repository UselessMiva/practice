public class Main {
    public static void main(String[] args) {

        EconomyRoom economyRoom = new EconomyRoom(101, 2);
        StandardRoom standardRoom = new StandardRoom(202, 2);
        UltraLuxRoom ultraLuxRoom = new UltraLuxRoom(404, 4);

        LuxRoom luxRoom = new LuxRoom(303, 2, Prices.LUX.getPrice());


        System.out.println("Созданные комнаты:");
        System.out.println(economyRoom);
        System.out.println(standardRoom);
        System.out.println(luxRoom);
        System.out.println(ultraLuxRoom);
        System.out.println("----------------------------------------\n");

        System.out.println("--- ТЕСТ БАЗОВОГО СЕРВИСА ---");
        BasicRoomService basicService = new BasicRoomService();
        basicService.reserve(economyRoom);
        System.out.println("Состояние эконом-комнаты после бронирования: " + economyRoom);

        try {
            System.out.println("\nПопытка забронировать уже занятую комнату...");
            basicService.reserve(economyRoom);
        } catch (RoomAlreadyReservedException e) {
            System.err.println("Успешно поймано исключение: " + e.getMessage());
        }

        basicService.free(economyRoom);
        System.out.println("Состояние эконом-комнаты после освобождения: " + economyRoom);
        System.out.println("----------------------------------------\n");

        System.out.println("--- ТЕСТ ПРЕМИУМ-СЕРВИСА ---");
        PremiumHotelService premiumService = new PremiumHotelService();

        premiumService.reserve(luxRoom);
        premiumService.foodDelivery(luxRoom);
        premiumService.foodDelivery(ultraLuxRoom);

        System.out.println("\nПопытка заказать еду в эконом-комнату...");
        // premiumService.foodDelivery(economyRoom); // <-- строчка не компилируется
        // Ошибка компиляции
        // Это доказывает, что наша система работает правильно.
        System.out.println("Код с 'premiumService.foodDelivery(economyRoom)' не скомпилируется, чтд!");

        System.out.println("----------------------------------------");
    }
}