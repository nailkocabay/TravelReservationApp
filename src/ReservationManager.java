import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationManager {
    private List<Reservation> reservations;

    public ReservationManager() {
        this.reservations = new ArrayList<>();
    }

    public void makeReservation(Customer customer, TravelPackage travelPackage) {
        Reservation reservation = new Reservation(customer, travelPackage, new Date());
        reservations.add(reservation);
        System.out.println("Reservation successfully made for " + customer.getName() + " to " + travelPackage.getDestination());
    }

    // Diğer rezervasyon yönetimi işlemleri buraya eklenebilir

    public List<Reservation> getReservations() {
        return reservations;
    }
}
