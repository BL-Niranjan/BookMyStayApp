public class BookMyStay {

    public static void main(String[] args) {

        InventoryService inventory =
                new InventoryService();

        inventory.addRoomType(
                "Single", 2);

        inventory.addRoomType(
                "Double", 1);

        BookingQueueService queue =
                new BookingQueueService();

        queue.addBookingRequest(
                new Reservation(
                        101,
                        "Niranjan",
                        "Single"
                )
        );

        queue.addBookingRequest(
                new Reservation(
                        102,
                        "Arun",
                        "Single"
                )
        );

        queue.addBookingRequest(
                new Reservation(
                        103,
                        "Kumar",
                        "Single"
                )
        );

        BookingService bookingService =
                new BookingService(inventory);

        while (!queue.isEmpty()) {

            Reservation reservation =
                    queue.getNextRequest();

            bookingService
                    .confirmReservation(
                            reservation
                    );
        }

        bookingService
                .displayAllocatedRooms();

        inventory.displayInventory();
    }
}