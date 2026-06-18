public class Room {

    private String roomType;
    private int availableCount;
    private double pricePerNight;
    private String amenities;

    public Room(String roomType, int availableCount,
                double pricePerNight, String amenities) {
        this.roomType = roomType;
        this.availableCount = availableCount;
        this.pricePerNight = pricePerNight;
        this.amenities = amenities;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "Room Type : " + roomType +
                "\nAvailable Rooms : " + availableCount +
                "\nPrice Per Night : ₹" + pricePerNight +
                "\nAmenities : " + amenities;
    }
}