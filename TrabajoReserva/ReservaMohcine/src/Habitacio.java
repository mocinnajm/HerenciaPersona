public class Habitacio extends allotjament {
    private int numLlits;

    public int getNumLlits() {
        return numLlits;
    }

    public void setNumLlits(int numLlits) {
        this.numLlits = numLlits;
    }

    public Habitacio(String nom, int capacity, boolean disponile, double precio, int noches, int numLlits) {
        super(nom, capacity, disponile, precio, noches);
        this.numLlits = numLlits;
    }

    public void calcprecioNoche(){
         int precio = 50;
         if(numLlits>2){
             precio+=(numLlits-2)*20;

        }
         precio *=noches;
    }
    public String mostarInfo(){
        return "habitacio"+getNom()
                +"Num de camas: "+getNumLlits() +")-"
                +(isDisponile()?"disponible" :"no disponible");
    }
}
