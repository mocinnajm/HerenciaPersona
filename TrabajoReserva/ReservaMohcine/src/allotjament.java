public class allotjament {
     String nom;
    private int capacity;
    int noches;
    private boolean disponile;
    private double precio;

    public allotjament(String nom, int capacity, boolean disponile) {
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public allotjament(String nom, int capacity, boolean disponile, double precio , int noches) {

        this.nom = nom;
        this.capacity = capacity;
        this.disponile = disponile;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void calularPrecioNoche() {

    }

    public void reservar() {
        if (disponile) {
            disponile = false;
            this.calularPrecioNoche();
            System.out.println("reservado correctamente" + this.nom);

        } else {
            System.out.println("este allotjamnet non esta disponible");
        }
    }

    public void liberar() {
        if (!disponile) {
            disponile = true;
            System.out.println("has liberado " + this.nom);

        } else {
            System.out.println("este alojamiento ya esta libre ");
        }

    }

    public boolean isDisponile() {
        return disponile;
    }

    public String MostarInfo() {
        return "Name: " + getNom() + '\n' +
                "Capacity: " + getCapacity() + '\n' +
                "Available: " + isDisponile() + '\n' +
                "Price night: " + precio + " €";
    }

}
