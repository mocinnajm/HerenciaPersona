public class Habitacio extends Allotjament {
    int numBeds;

    public Habitacio(String name, int numBeds, int nights) {
        super();
        setName(name);
        setNumBeds(numBeds);
        setNight(nights);
        setCapacity(numBeds);
        setAvailable(true);
    }

    public int getNumBeds() {
        return numBeds;
    }

    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    public void calcPriceNight() {
        price = 50.0;

        if (numBeds > 2) {
            price += (numBeds - 2) * 20.0;
        }
        price *= nights;
    }

    public String showInfo() {
        return "Room: " + getName()
                + " (Num of beds: " + getNumBeds() + ") - "
                + (isAvailable() ? "Available" : "Not available");
    }
} 