public class BookMyStay {

    public static void main(String[] args) {

        BookingHistoryService historyService =
                new BookingHistoryService();

        Reservation reservation1 =
                new Reservation(
                        "R101",
                        "Niranjan",
                        "Single"
                );

        Reservation reservation2 =
                new Reservation(
                        "R102",
                        "Arun",
                        "Double"
                );

        Reservation reservation3 =
                new Reservation(
                        "R103",
                        "Kumar",
                        "Suite"
                );

        historyService.addReservation(
                reservation1
        );

        historyService.addReservation(
                reservation2
        );

        historyService.addReservation(
                reservation3
        );

        historyService.cancelReservation(
                "R102"
        );

        historyService.displayBookingHistory();

        historyService.generateReport();
    }
}