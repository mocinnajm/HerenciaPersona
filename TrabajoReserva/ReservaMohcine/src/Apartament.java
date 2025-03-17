public class Apartament extends allotjament {
    private  int habita;
     boolean teCuina;

    public int getHabita() {
        return habita;
    }

    public void setHabita(int habita) {
        this.habita = habita;
    }

    public boolean isTeCuina() {
        return teCuina;
    }

    public void setTeCuina(boolean teCuina) {
        this.teCuina = teCuina;
    }

    public Apartament(String nom, int capacity, boolean disponile, int habita, boolean teCuina) {
        super(nom, capacity, disponile);
        this.habita = habita;
        this.teCuina = teCuina;
    }
    public void calcprecioNoche(){
        double precio=100.0+(habita*10.0);
        precio*=noches;
    }
    public String Mostarinfo(){
        return "Apartamiento: " + getNom()+" (habitacion:"
                +getHabita() + ", Cocina: "
                +(teCuina() ? "Yes":"No")+")-"
                +(isDisponile()?"Disponible":"Not Disponible");
    }

    private boolean teCuina() {
        return true;
    }
}
