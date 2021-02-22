package tallerdeclases;

    public class Profesor {
    private String Email;
    private String Nombre;
    public Profesor(String Nombre, String Email) {
        this.Email = Email;
        this.Nombre = Nombre;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String adquirirDatos(){
        String info = "Nombre: "+Nombre+" Correo: "+Email+"\n";
        return info;
    }
}

/* Andres Felipe Cardona Londoño*/ 

