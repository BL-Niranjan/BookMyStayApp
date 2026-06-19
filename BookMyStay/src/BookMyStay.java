public class BookMyStay {

    public static void main(String[] args) {

        Reservation reservation =
                new Reservation(
                        "R101",
                        "Niranjan"
                );

        ServiceManagement serviceManagement =
                new ServiceManagement();

        serviceManagement.addService(
                reservation.getReservationId(),
                new Service(
                        "Breakfast",
                        500
                )
        );

        serviceManagement.addService(
                reservation.getReservationId(),
                new Service(
                        "Spa",
                        1500
                )
        );

        serviceManagement.addService(
                reservation.getReservationId(),
                new Service(
                        "Airport Pickup",
                        800
                )
        );

        serviceManagement.displayServices(
                reservation.getReservationId()
        );
    }
}