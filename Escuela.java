package tallerdeclases;
public class Escuela {
    private String Nombre;
    private String Dtor;
    private int Tel;
    private int numOficina;
    private Profesor[] vectorProfesores;

    public Escuela(String Nombre, int NumOficina, int Tel, String Dtor) {
        this.Nombre = Nombre;
        this.numOficina = NumOficina;
        this.Tel = Tel;
        this.Dtor = Dtor;
        this.vectorProfesores = new Profesor[2];
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDtor() {
        return Dtor;
    }

    public void setDtor(String Dtor) {
        this.Dtor = Dtor;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public int getNumOficina() {
        return numOficina;
    }

    public void setNumOficina(int numOficina) {
        this.numOficina = numOficina;
    }

    public Profesor[] getVectorProfesores() {
        return vectorProfesores;
    }

    public void setVectorProfesores(Profesor[] vectorProfesores) {
        this.vectorProfesores = vectorProfesores;
    }

    public String adquirirDatos(int facultad, int escuela){
        String info = "Escuela: "+Nombre+" Director: "+Dtor+" Oficina: " +numOficina+ " Tel: " +Tel+ "\n";
        boolean profesor1 = false;
        boolean profesor2 = false;
        boolean profesor3 = false;
        boolean profesor4 = false;
        boolean profesor5 = false;
        boolean profesor6 = false;
        boolean profesor7 = false;
        boolean profesor8 = false;
        for (Profesor Estado : vectorProfesores) {
            if(Estado != null){
                info += Estado.adquirirDatos();
            }else{
                if (facultad == 1){
                    if(escuela == 1){
                        if(Estado == null && !profesor1){
                            Profesor Entrada = new Profesor("Estefania", "Profesor@CForenses.edu.co");
                            Estado = Entrada;
                            profesor1 = true;
                            info += Entrada.adquirirDatos();
                            System.out.println("Profesor 1 Forense genereda.");
                        }
                        if(Estado == null && !profesor2){
                            Profesor Entrada = new Profesor("Manuela", "Profesor@CForenses.edu.co");
                            Estado = Entrada;
                            profesor2 = true;
                            info += Entrada.adquirirDatos();
                            System.out.println("Profesor 2 Forence genereda.");
                        }
                    }else{
                        if(Estado == null && !profesor3){
                            Profesor Entrada = new Profesor("Raul", "profesor@Ingles.edu.co");
                            Estado = Entrada;
                            profesor3 = true;
                            info += Entrada.adquirirDatos();
                            System.out.println("Profesor 1 Ingles genereda.");
                        }
                        if(Estado == null && !profesor4){
                            Profesor Entrada = new Profesor("Cristian", "Profesor@Ingles.edu.co");
                            Estado = Entrada;
                            profesor4 = true;
                            info += Entrada.adquirirDatos();
                            System.out.println("Profesor 2 Ingles genereda.");
                        }
                    }
                }else{
                    
                    if(escuela == 1){
                        if(Estado == null && !profesor5){
                            Profesor Entrada = new Profesor("Monica", "Profesor@Admin.edu.co");
                            Estado = Entrada;
                            profesor5 = true;
                            info += Entrada.adquirirDatos();
                            System.out.println("Profesor 1 Administrativo genereda.");
                        }
                        if(Estado == null && !profesor6){
                            Profesor Entrada = new Profesor("David", "Profesor@Admin.edu.co");
                            Estado = Entrada;
                            profesor6 = true;
                            info += Entrada.adquirirDatos();
                            System.out.println("Profesor 2 Administrativo genereda.");
                        }
                    }else{
                        if(Estado == null && !profesor7){
                            Profesor Entrada = new Profesor("Julian", "Profesor@Ingenieria.edu.co");
                            Estado = Entrada;
                            profesor7 = true;
                            info += Entrada.adquirirDatos();
                            System.out.println("Profesor 1 Ingeniero genereda.");
                        }
                        
                           if(Estado == null && !profesor8){
                            Profesor Entrada = new Profesor("Marta", "Profesor@Ingenieria.edu.co");
                            Estado = Entrada;
                            profesor8 = true;
                            info+= Entrada.adquirirDatos();
                            System.out.println("Profesor 2 Ingenieria genereda.");
                        }
                    }
                }
            }
        }
        return info;
    }
}   
/* Andres Felipe Cardona Londoño*/ 