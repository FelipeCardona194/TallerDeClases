package tallerdeclases;
public class Universidad {
    private int Tel;
    private String Direccion;
    private String Nombre;
    private double Ext;
    private String Tipo;
    private Facultad[] vectorFacultad;

    public Universidad(String Nombre, String Direccion, String Tipo, int Tel, double Ext) {
        this.Tel = Tel;
        this.Direccion = Direccion;
        this.Nombre = Nombre;
        this.Ext = Ext;
        this.Tipo = Tipo;
        this.vectorFacultad = new Facultad[2];
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getExt() {
        return Ext;
    }

    public void setExt(double Ext) {
        this.Ext = Ext;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Facultad[] getVectorFacultad() {
        return vectorFacultad;
    }

    public void setVectorFacultad(Facultad[] vectorFacultad) {
        this.vectorFacultad = vectorFacultad;
    }

   

    public String adquirirDatos(){
        int Estado = 1;
        String Datos = "Universidad: "+Nombre+" Direccion: "+Direccion+" Tipo: " +Tipo+ " Tel: " +Tel+ " Ext: " +Ext+ "\n";
        int contador = 1;
        for (Facultad Facultad : vectorFacultad) {
            if(Facultad != null){
                System.out.println("Informacion sobre la "+Facultad+"");
                Datos += Facultad.adquirirDatos(0);
            }else{
                if (Estado == 1){
                    boolean Registrado = false;
                    if((Facultad == null) && (!Registrado)){
                        Facultad PrimeraF = new Facultad("Ciencias", "Felipe ", 1208, 5044576);
                        System.out.println("Facultad de Ciencias generada.");
                        Facultad = PrimeraF;
                        Registrado = true;
                        Datos += PrimeraF.adquirirDatos(1);
                        Estado = Estado +1;
                    }
                }else{
                    boolean Registrado = false;
                    if((Facultad == null) && (!Registrado)){
                        Facultad SegundaF = new Facultad("Lenguas", "Sebastian", 0457, 2379005);
                        System.out.println("Facultad de Lenguas generada.");
                        Facultad = SegundaF;
                        Registrado = true;
                        Datos += SegundaF.adquirirDatos(2);
                    }
                }
            }
        }
        return Datos;
    }
}   
/* Andres Felipe Cardona Londoño*/ 
