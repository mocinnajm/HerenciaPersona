import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Allotjament {
    String name;
    int capacity, nights;
    boolean available;
    double price;

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNight() {
        return nights;
    }

    public void setNight(int nights) {
        this.nights = nights;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void calcPriceNight() {
    }

    public void reserve() {
        if (available) {
            available = false;
            this.calcPriceNight();
            System.out.println("Reservat correctament " + this.name + " el dia " + dateFormat.format(date));
        } else {
            System.out.println("Aquest allotjament no està disponible");
        }

    }

    public void liberate() {
        if (!available) {
            available = true;
            Date date = new Date();
            System.out.println("As alliberat " + this.name + " el dia " + dateFormat.format(date));
            this.price = 0;
        } else {
            System.out.println("Aquest allotjament ja esta alliberat");
        }
    }

    public boolean itsAvaliable() {
        return available;
    }

    public String showInfo() {
        return "Name: " + getName() + '\n' +
                "Capacity: " + getCapacity() + '\n' +
                "Available: " + isAvailable() + '\n' +
                "Price night: " + price + " €";
    }
}
