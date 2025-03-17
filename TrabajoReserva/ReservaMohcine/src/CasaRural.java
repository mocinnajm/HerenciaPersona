public class CasaRural extends allotjament {
    private boolean teJardin;
     boolean tePiscina;

    public boolean isTeJardin() {
        return teJardin;
    }

    public void setTeJardin(boolean teJardin) {
        this.teJardin = teJardin;
    }

    public boolean isTePiscina() {
        return tePiscina;
    }

    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
    }

    public CasaRural(String nom, int capacity, boolean disponile, boolean teJardin, boolean tePiscina) {
        super(nom, capacity, disponile);
        this.teJardin = teJardin;
        this.tePiscina = tePiscina;
    }
    public void calcularPrecioNoche(){
        int precio=150;
        if(tePiscina){
            precio+=50;

        }
        precio*=noches;

    }
    public String mostrarInfo(){
        return "Rural house: " +getNom()
                +"Tiene jardin:" + (isTeJardin()?"Yes":"No")
                +",Pisina: "+(tePiscina() ? "Yes":"No")+") -"
                +(isDisponile()?"Disponible":"Not disponible");
    }

    private boolean tePiscina() {
        return true;
    }

}


