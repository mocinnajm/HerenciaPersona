public class CasaRural extends Allotjament {
    boolean haveGarden, havePool;

    public CasaRural(String name, int nights, boolean haveGarden, boolean havePool) {
        super();
        setName(name);
        setNight(nights);
        setCapacity(5);
        setAvailable(true);
        setHaveGarden(haveGarden);
        setHavePool(havePool);

    }

    public boolean isHaveGarden() {
        return haveGarden;
    }

    public void setHaveGarden(boolean haveGarden) {
        this.haveGarden = haveGarden;
    }

    public boolean isHavePool() {
        return havePool;
    }

    public void setHavePool(boolean havePool) {
        this.havePool = havePool;
    }

    public void calcPriceNight() {
        price = 150;
        if (havePool) {
            price += 50;
        }
        price *= nights;
    }

    public String showInfo() {
        return "Rural house: " + getName()
                + " (Have garden: " + (isHaveGarden() ? "Yes" : "No")
                + ", Pool: " + (isHavePool() ? "Yes" : "No") + ") - "
                + (isAvailable() ? "Available" : "Not available");
    }
}
