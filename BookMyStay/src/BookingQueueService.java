import java.util.LinkedList;
import java.util.Queue;

public class BookingQueueService {

    private Queue<Reservation> bookingQueue;

    public BookingQueueService() {
        bookingQueue = new LinkedList<>();
    }

    public void addBookingRequest(Reservation reservation) {

        bookingQueue.offer(reservation);

        System.out.println(
                reservation.getGuestName()
                        + " added to booking queue."
        );
    }

    public void processNextRequest() {

        if (bookingQueue.isEmpty()) {

            System.out.println(
                    "No booking requests available."
            );
            return;
        }

        Reservation reservation =
                bookingQueue.poll();

        System.out.println(
                "Processing -> " + reservation
        );
    }

    public void displayQueue() {

        System.out.println(
                "\n===== BOOKING QUEUE ====="
        );

        if (bookingQueue.isEmpty()) {

            System.out.println(
                    "Queue is empty."
            );
            return;
        }

        for (Reservation reservation : bookingQueue) {

            System.out.println(reservation);
        }
    }
}