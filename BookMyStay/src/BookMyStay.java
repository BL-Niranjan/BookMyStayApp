public class BookMyStay {
    public static void main(String[] args) {

        BookingQueueService bookingQueue =
                new BookingQueueService();

        bookingQueue.addBookingRequest(
                new Reservation(
                        101,
                        "Niranjan",
                        "Single"
                )
        );

        bookingQueue.addBookingRequest(
                new Reservation(
                        102,
                        "Arun",
                        "Double"
                )
        );

        bookingQueue.addBookingRequest(
                new Reservation(
                        103,
                        "Kumar",
                        "Suite"
                )
        );

        bookingQueue.displayQueue();

        System.out.println();

        bookingQueue.processNextRequest();

        bookingQueue.processNextRequest();

        System.out.println();

        bookingQueue.displayQueue();
    }
}