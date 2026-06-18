import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private Map<String, Room> roomInventory;

    public InventoryService() {
        roomInventory = new HashMap<>();
    }

    public void addRoomType(String roomType, int count, double price) {

        Room room = new Room(roomType, count, price);

        roomInventory.put(roomType, room);

        System.out.println(roomType + " room added successfully.");
    }

    public void updateRoomCount(String roomType, int newCount) {

        Room room = roomInventory.get(roomType);

        if (room != null) {
            room.setAvailableCount(newCount);

            System.out.println(
                    roomType + " room count updated to " + newCount
            );
        } else {
            System.out.println("Room type not found.");
        }
    }

    public void updateRoomPrice(String roomType, double newPrice) {

        Room room = roomInventory.get(roomType);

        if (room != null) {
            room.setPricePerNight(newPrice);

            System.out.println(
                    roomType + " room price updated to ₹" + newPrice
            );
        } else {
            System.out.println("Room type not found.");
        }
    }

    public void displayAvailability() {

        System.out.println("\n===== ROOM INVENTORY =====");

        for (Room room : roomInventory.values()) {
            System.out.println(room);
        }
    }

    public Room getRoom(String roomType) {
        return roomInventory.get(roomType);
    }
}