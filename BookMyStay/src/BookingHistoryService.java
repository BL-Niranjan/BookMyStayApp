import java.util.ArrayList;
import java.util.List;

public class BookingHistoryService {

    private List<Reservation> bookingHistory;

    public BookingHistoryService() {

        bookingHistory = new ArrayList<>();
    }

    public void addReservation(
            Reservation reservation) {

        bookingHistory.add(reservation);

        System.out.println(
                "Reservation "
                        + reservation.getReservationId()
                        + " added to history."
        );
    }

    public void cancelReservation(
            String reservationId) {

        for (Reservation reservation :
                bookingHistory) {

            if (reservation.getReservationId()
                    .equals(reservationId)) {

                reservation.cancelReservation();

                System.out.println(
                        "Reservation "
                                + reservationId
                                + " cancelled."
                );

                return;
            }
        }

        System.out.println(
                "Reservation not found."
        );
    }

    public void displayBookingHistory() {

        System.out.println(
                "\n===== BOOKING HISTORY ====="
        );

        if (bookingHistory.isEmpty()) {

            System.out.println(
                    "No reservations found."
            );

            return;
        }

        for (Reservation reservation :
                bookingHistory) {

            System.out.println(
                    "---------------------"
            );

            System.out.println(
                    reservation
            );
        }
    }

    public void generateReport() {

        int confirmedCount = 0;
        int cancelledCount = 0;

        for (Reservation reservation :
                bookingHistory) {

            if (reservation.getStatus()
                    .equals("CONFIRMED")) {

                confirmedCount++;
            }
            else {

                cancelledCount++;
            }
        }

        System.out.println(
                "\n===== REPORT ====="
        );

        System.out.println(
                "Total Reservations : "
                        + bookingHistory.size()
        );

        System.out.println(
                "Confirmed Bookings : "
                        + confirmedCount
        );

        System.out.println(
                "Cancelled Bookings : "
                        + cancelledCount
        );
    }
}