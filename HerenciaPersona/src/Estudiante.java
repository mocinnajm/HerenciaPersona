class Estudiante extends Persona {
    private String curs;
    private String[] assignatures;
    private String escola;
    private double[] notes;

    public Estudiante(int id, int edad, String cognom, String adreça, String curs, String[] assignatures, String escola, double[] notes) {
        super(id, edad, cognom, adreça);
        this.curs = curs;
        this.assignatures = assignatures;
        this.escola = escola;
        this.notes = notes;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public String[] getAssignatures() {
        return assignatures;
    }

    public void setAssignatures(String[] assignatures) {
        this.assignatures = assignatures;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public double[] getNotes() {
        return notes;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }
}
