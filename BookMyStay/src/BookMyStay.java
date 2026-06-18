public class BookMyStay {

    public static void main(String[] args) {

        InventoryService inventoryService =
                new InventoryService();

        inventoryService.addRoom(
                new Room(
                        "Single",
                        10,
                        1500,
                        "WiFi, TV"
                )
        );

        inventoryService.addRoom(
                new Room(
                        "Double",
                        5,
                        2500,
                        "WiFi, TV, AC"
                )
        );

        inventoryService.addRoom(
                new Room(
                        "Suite",
                        0,
                        5000,
                        "WiFi, TV, AC, Mini Bar"
                )
        );

        SearchService searchService =
                new SearchService(inventoryService);

        searchService.displayAvailableRooms();

        searchService.searchRoomByType("Double");

        System.out.println(
                "\nCan Book Suite ? "
                        + searchService.isRoomAvailable("Suite")
        );

        System.out.println(
                "Can Book Single ? "
                        + searchService.isRoomAvailable("Single")
        );
    }
}