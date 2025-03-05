public class Main {
    public static void main(String[] args) {
        String[] assignatures = {"java", "base de datos", "Fol"};
        double [] notes={ 10};


        Estudiante estudiante = new Estudiante(39090, 20, "Nayla", "Calle lleo", "Dam1", assignatures, "prat educacio", notes);
        Estudiante estudiante2 = new Estudiante(78778, 32, "machine", "Calle mayor", "Dam1", assignatures, "tarrgona", notes);
        System.out.println("ID: " + estudiante.getId());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Apellido: " + estudiante.getCognom());
        System.out.println("adreça: " + estudiante.getAdreça());
        System.out.println("Curso: " + estudiante.getCurs());
        System.out.println("Escuela: " + estudiante.getEscola());
        System.out.println("Asignatures: " + String.join(", ", estudiante.getAssignatures()));

        System.out.println("-------------------");
        
        System.out.println("ID: " + estudiante2.getId());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Apellido: " + estudiante2.getCognom());
        System.out.println("Dareça: " + estudiante2.getAdreça());
        System.out.println("Curso: " + estudiante2.getCurs());
        System.out.println("Escuela: " + estudiante2.getEscola());
        System.out.println("Asignatures: " + String.join(", ", estudiante2.getAssignatures()));


        }
    }
