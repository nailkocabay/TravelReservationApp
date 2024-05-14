public class TravelPackage {
    private String destination;
    private double price;
    private String departure_date;
    private int availableSeats ;

    public TravelPackage(String destination, double price, String departure_date, int availableSeats) {
        this.destination = destination;
        this.price = price;
        this.departure_date = departure_date;
        this.availableSeats = availableSeats;
    }

    // Hedef bilgisini getir
    public String getDestination() {
        return destination;
    }

    // Fiyat bilgisini getir
    public double getPrice() {
        return price;
    }

    public String getDeparture_date(){
        return departure_date;
    }

    // Kullanılabilir koltuk sayısını getir
    public int getAvailableSeats() {
        return availableSeats;
    }

    // Koltuk rezervasyonu yap
    public void reserveSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Koltuk " + destination + " için rezerve edildi.");
        } else {
            System.out.println("Üzgünüz, " + destination + " için boş koltuk bulunmamaktadır.");
        }
    }

    // Koltuk rezervasyonunu iptal et
    public void cancelReservation() {
        availableSeats++;
        System.out.println("Rezervasyon iptal edildi. Bir koltuk daha müsait hale geldi.");
    }

    // Seyahat paketi bilgilerini yazdır
    public void printPackageInfo() {
        System.out.println("Hedef: " + destination);
        System.out.println("Fiyat: $" + price);
        System.out.println("Mevcut Koltuk Sayısı: " + availableSeats);
    }

    // Getter ve setter metotları
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDeparture_date(){
        this.departure_date = departure_date;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
