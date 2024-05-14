import java.util.Date;

public class Reservation {
    private Customer customer;
    private TravelPackage travelPackage;
    private Date reservationDate;
    private boolean confirmed;

    public Reservation(Customer customer, TravelPackage travelPackage, Date reservationDate) {
        this.customer = customer;
        this.travelPackage = travelPackage;
        this.reservationDate = reservationDate;
        this.confirmed = false;
    }

    // Getter ve setter metotları
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TravelPackage getTravelPackage() {
        return travelPackage;
    }

    public void setTravelPackage(TravelPackage travelPackage) {
        this.travelPackage = travelPackage;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }


    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
}
