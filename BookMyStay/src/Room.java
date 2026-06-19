public class Room {

    private String roomType;
    private int availableCount;

    public Room(String roomType, int availableCount) {
        this.roomType = roomType;
        this.availableCount = availableCount;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void decrementAvailability() {
        availableCount--;
    }

    @Override
    public String toString() {
        return roomType +
                " Available Rooms : " +
                availableCount;
    }
}