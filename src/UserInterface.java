import java.util.Scanner;

public class UserInterface {
    private ReservationManager reservationManager;
    private Scanner scanner;

    public UserInterface(ReservationManager reservationManager) {
        this.reservationManager = reservationManager;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to Travel Reservation System");
        System.out.println("1. Make Reservation");
        System.out.println("2. View Reservations");
        System.out.println("3. Exit");
    }

    public void start() {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Dummy read to clear the buffer

            switch (choice) {
                case 1:
                    makeReservation();
                    break;
                case 2:
                    viewReservations();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    private void makeReservation() {
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter customer surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter customer age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter customer email: ");
        String email = scanner.nextLine();
        System.out.println("Customer Info: "+name+"--"+surname+"--"+age+"--"+email+"");
        Customer customer = new Customer(name, surname, age, email);

        System.out.println("Enter destination: ");
        String destination = scanner.nextLine();
        System.out.println("Enter departure date: ");
        String departure_date = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter number of seats to be purchased: ");
        int numberofpurchasedSeats = scanner.nextInt();
        System.out.println("Travel Package Info: "+destination+"--"+departure_date+"--"+price+"--"+numberofpurchasedSeats+" ");
        TravelPackage travelPackage = new TravelPackage(destination, price, departure_date, numberofpurchasedSeats);

        reservationManager.makeReservation(customer, travelPackage);
    }

    private void viewReservations() {
        System.out.println("Reservations:");
        for (Reservation reservation : reservationManager.getReservations()) {
            System.out.println("Customer: " + reservation.getCustomer().getName() + " " + reservation.getCustomer().getSurname() +
                    ", Destination: " + reservation.getTravelPackage().getDestination() +
                    ", Departure Date: " + reservation.getTravelPackage().getDeparture_date() +
                    ", Reservation Date: " + reservation.getReservationDate());
        }
    }
}
