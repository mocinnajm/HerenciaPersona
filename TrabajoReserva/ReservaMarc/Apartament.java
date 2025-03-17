public class Apartament extends Allotjament {
    int rooms;
    boolean haveKitchen;

    public Apartament(String name, int rooms, int nights, boolean haveKitchen) {
        super();
        setName(name);
        setNight(nights);
        setRooms(rooms);
        setHaveKitchen(haveKitchen);
        setCapacity(rooms);
        setAvailable(true);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isHaveKitchen() {
        return haveKitchen;
    }

    public void setHaveKitchen(boolean haveKitchen) {
        this.haveKitchen = haveKitchen;
    }

    public void calcPriceNight() {
        price = 100.0 + (rooms * 10.0);
        price *= nights;
    }
    public String showInfo() {
        return "Apartment: " + getName() + " (Rooms: "
                + getRooms() + ", Kitchen: "
                + (isHaveKitchen() ? "Yes" : "No") + ") - "
                + (isAvailable() ? "Available" : "Not available");
    }
}