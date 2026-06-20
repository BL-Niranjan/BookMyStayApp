public class Reservation {

    private String reservationId;
    private String guestName;
    private String roomType;
    private String status;

    public Reservation(String reservationId,
                       String guestName,
                       String roomType) {

        this.reservationId = reservationId;
        this.guestName = guestName;
        this.roomType = roomType;
        this.status = "CONFIRMED";
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getStatus() {
        return status;
    }

    public void cancelReservation() {
        this.status = "CANCELLED";
    }

    @Override
    public String toString() {

        return "Reservation ID : " + reservationId +
                "\nGuest Name : " + guestName +
                "\nRoom Type : " + roomType +
                "\nStatus : " + status;
    }
}