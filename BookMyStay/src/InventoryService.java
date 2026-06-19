import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private Map<String, Room> inventory;

    public InventoryService() {
        inventory = new HashMap<>();
    }

    public void addRoomType(String roomType,
                            int count) {

        inventory.put(
                roomType,
                new Room(roomType, count)
        );
    }

    public Room getRoom(String roomType) {
        return inventory.get(roomType);
    }

    public void displayInventory() {

        System.out.println(
                "\n===== CURRENT INVENTORY ====="
        );

        for (Room room : inventory.values()) {
            System.out.println(room);
        }
    }

    public Map<String, Room> getRoomInventory() {
        return inventory;
    }


}