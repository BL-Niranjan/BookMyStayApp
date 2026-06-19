import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceManagement {

    // Reservation ID -> List of Services
    private Map<String, List<Service>> reservationServices;

    public ServiceManagement() {
        reservationServices = new HashMap<>();
    }

    public void addService(String reservationId,
                           Service service) {

        reservationServices
                .computeIfAbsent(
                        reservationId,
                        id -> new ArrayList<>()
                )
                .add(service);

        System.out.println(
                service.getServiceName()
                        + " added to Reservation "
                        + reservationId
        );
    }

    public void displayServices(
            String reservationId) {

        List<Service> services =
                reservationServices.get(reservationId);

        if (services == null ||
                services.isEmpty()) {

            System.out.println(
                    "No services selected."
            );
            return;
        }

        System.out.println(
                "\nServices for Reservation "
                        + reservationId
        );

        double totalCost = 0;

        for (Service service : services) {

            System.out.println(service);

            totalCost += service.getServiceCost();
        }

        System.out.println(
                "Total Add-On Cost : ₹"
                        + totalCost
        );
    }

    public double calculateTotalCost(
            String reservationId) {

        List<Service> services =
                reservationServices.get(reservationId);

        if (services == null) {
            return 0;
        }

        double total = 0;

        for (Service service : services) {
            total += service.getServiceCost();
        }

        return total;
    }
}