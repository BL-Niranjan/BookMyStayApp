import java.util.LinkedList;
import java.util.Queue;

public class BookingQueueService {

    private Queue<Reservation> bookingQueue;

    public BookingQueueService() {
        bookingQueue = new LinkedList<>();
    }

    public void addBookingRequest(
            Reservation reservation) {

        bookingQueue.offer(reservation);

        System.out.println(
                reservation.getGuestName()
                        + " added to queue."
        );
    }

    public Reservation getNextRequest() {
        return bookingQueue.poll();
    }

    public boolean isEmpty() {
        return bookingQueue.isEmpty();
    }
}