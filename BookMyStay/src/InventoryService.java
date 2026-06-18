import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private Map<String, Room> roomInventory;

    public InventoryService() {
        roomInventory = new HashMap<>();
    }

    public void addRoom(Room room) {
        roomInventory.put(room.getRoomType(), room);
    }

    public Map<String, Room> getRoomInventory() {
        return roomInventory;
    }
}