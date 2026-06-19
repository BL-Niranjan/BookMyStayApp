import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BookingService {

    private InventoryService inventoryService;

    // Prevent duplicate room allocation
    private Set<String> bookedRoomIds;

    // Room Type -> Allocated Room IDs
    private Map<String, Set<String>> assignedRooms;

    public BookingService(
            InventoryService inventoryService) {

        this.inventoryService = inventoryService;

        bookedRoomIds = new HashSet<>();
        assignedRooms = new HashMap<>();
    }

    public void confirmReservation(
            Reservation reservation) {

        String roomType =
                reservation.getRoomType();

        Room room =
                inventoryService.getRoom(roomType);

        if (room == null) {

            System.out.println(
                    "Invalid room type."
            );
            return;
        }

        if (room.getAvailableCount() <= 0) {

            System.out.println(
                    "No available rooms for "
                            + roomType
            );
            return;
        }

        String roomId =
                generateRoomId(roomType);

        bookedRoomIds.add(roomId);

        assignedRooms
                .computeIfAbsent(
                        roomType,
                        k -> new HashSet<>()
                )
                .add(roomId);

        room.decrementAvailability();

        System.out.println(
                "\nReservation Confirmed"
        );

        System.out.println(
                "Guest : "
                        + reservation.getGuestName()
        );

        System.out.println(
                "Room Type : "
                        + roomType
        );

        System.out.println(
                "Assigned Room ID : "
                        + roomId
        );
    }

    private String generateRoomId(
            String roomType) {

        int roomNumber = 1;

        String roomId =
                roomType.substring(0, 1)
                        + roomNumber;

        while (bookedRoomIds.contains(roomId)) {

            roomNumber++;

            roomId =
                    roomType.substring(0, 1)
                            + roomNumber;
        }

        return roomId;
    }

    public void displayAllocatedRooms() {

        System.out.println(
                "\n===== ALLOCATED ROOMS ====="
        );

        for (String roomType :
                assignedRooms.keySet()) {

            System.out.println(
                    roomType
                            + " -> "
                            + assignedRooms.get(roomType)
            );
        }
    }
}