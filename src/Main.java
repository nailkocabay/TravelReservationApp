public class Main {
    public static void main(String[] args) {
        ReservationManager reservationManager = new ReservationManager();
        UserInterface userInterface = new UserInterface(reservationManager);
        userInterface.start();
        System.out.println("This is test2");
    }
}
