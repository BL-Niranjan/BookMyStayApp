public class BookMyStay {

    public static void main(String[] args) {

        InventoryService inventoryService =
                new InventoryService();

        // Initialize Room Types

        inventoryService.addRoomType(
                "Single", 20, 1500);

        inventoryService.addRoomType(
                "Double", 15, 2500);

        inventoryService.addRoomType(
                "Suite", 5, 5000);

        // Update Inventory

        inventoryService.updateRoomCount(
                "Single", 18);

        inventoryService.updateRoomPrice(
                "Suite", 5500);

        // Display Availability

        inventoryService.displayAvailability();
    }
}