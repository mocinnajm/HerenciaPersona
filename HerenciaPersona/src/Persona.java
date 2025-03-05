class Persona {
    private int id;
    private int edad;
    private String cognom;
    private String adreça;

    public Persona(int id, int edad, String cognom, String adreça) {
        this.id = id;
        this.edad = edad;
        this.cognom = cognom;
        this.adreça = adreça;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }
}