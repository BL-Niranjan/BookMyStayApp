import java.util.Map;

public class SearchService {

    private InventoryService inventoryService;

    public SearchService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void displayAvailableRooms() {

        System.out.println("\n===== AVAILABLE ROOMS =====");

        Map<String, Room> rooms =
                inventoryService.getRoomInventory();

        boolean roomFound = false;

        for (Room room : rooms.values()) {

            if (room.getAvailableCount() > 0) {

                roomFound = true;

                System.out.println("---------------------");
                System.out.println(room);
                System.out.println("---------------------");
            }
        }

        if (!roomFound) {
            System.out.println("No rooms available.");
        }
    }

    public void searchRoomByType(String roomType) {

        Room room =
                inventoryService.getRoomInventory().get(roomType);

        if (room == null) {

            System.out.println("Room type not found.");
            return;
        }

        System.out.println("\n===== ROOM DETAILS =====");
        System.out.println(room);

        if (room.getAvailableCount() > 0) {
            System.out.println("Status : Available");
        } else {
            System.out.println("Status : Not Available");
        }
    }

    public boolean isRoomAvailable(String roomType) {

        Room room =
                inventoryService.getRoomInventory().get(roomType);

        return room != null &&
                room.getAvailableCount() > 0;
    }
}