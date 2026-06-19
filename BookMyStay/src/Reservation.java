public class Reservation {

    private String reservationId;
    private String guestName;

    public Reservation(String reservationId,
                       String guestName) {

        this.reservationId = reservationId;
        this.guestName = guestName;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getGuestName() {
        return guestName;
    }
}