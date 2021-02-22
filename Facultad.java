package tallerdeclases;
public class Facultad {
    private int Ofi;
    private String Nombre;
    private int Tel;
    private String NomDecano;
    private Escuela[] vectorEscuelas;
    
    public Facultad(String Nombre, String NomDecano, int Ofi, int Tel) {
        this.Ofi = Ofi;
        this.Nombre = Nombre;
        this.Tel = Tel;
        this.NomDecano = NomDecano;
        this.vectorEscuelas = new Escuela[2];
    }

    public int getOfi() {
        return Ofi;
    }

    public void setOfi(int Ofi) {
        this.Ofi = Ofi;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public String getNomDecano() {
        return NomDecano;
    }

    public void setNomDecano(String NomDecano) {
        this.NomDecano = NomDecano;
    }

    public Escuela[] getVectorEscuelas() {
        return vectorEscuelas;
    }

    public void setVectorEscuelas(Escuela[] vectorEscuelas) {
        this.vectorEscuelas = vectorEscuelas;
    }
    
    public String adquirirDatos(int Facultad){
        String Datos = "Facultad: "+Nombre+" Decano: "+NomDecano+" Oficina: " +Ofi+ " Telefono: " +Tel+ "\n";
        boolean Escuela1 = false;
        boolean Escuela2 = false;
        boolean Escuela3 = false;
        boolean Escuela4 = false;
        for (Escuela Entrada : vectorEscuelas) {
            if(Entrada != null){
                Datos += Entrada.adquirirDatos(0,0) + "\n";
            }else{
                if (Facultad == 1){
                    if((Entrada == null) && (!Escuela1)){
                        Escuela escuela = new Escuela("Forenses", 1215, 2391876, "Pablo");
                        System.out.println("Escuela de Forenses generada.");
                        Datos += escuela.adquirirDatos(1,1) + "\n";
                        Entrada = escuela;
                        Escuela1 = true;
                    }
                    if((Entrada == null) && (!Escuela2)){
                        Escuela escuela = new Escuela("Ingles", 0437, 5051846, "Valeria");
                        System.out.println("Escuela de Ingles agregada.");
                        Datos += escuela.adquirirDatos(1,2) + "\n";
                        Entrada = escuela;
                        Escuela2 = true;
                    }
                    
                }else if(Facultad == 2){
                    if((Entrada == null) && (!Escuela3)){
                        Escuela escuela = new Escuela("Administrativas", 0634, 3462459, "Camila");
                        System.out.println("Escuela Financiera agregada.");
                        Datos += escuela.adquirirDatos(2,1) + "\n";
                        Entrada = escuela;
                        Escuela3 = true;
                    }
                    if((Entrada == null) && (!Escuela4)){
                        Escuela escuela = new Escuela("Ingenieria", 1067, 2671890, "Diego");
                        System.out.println("Escuela Ambiental agregada.");
                        Datos += escuela.adquirirDatos(2,2) + "\n";
                        Entrada = escuela;
                        Escuela4 = true;
                    }
                }
            }
        }
        return Datos;
    }
}  
/* Andres Felipe Cardona Londoño*/ 
