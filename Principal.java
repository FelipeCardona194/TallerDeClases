package tallerdeclases;

import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        Universidad Eafit = new Universidad("Eafit", "Carrera 49, número 7 sur 50, Cra. 49", "Privada", 2619500, 2559.83);
        String datos = "";
        datos += Eafit.adquirirDatos();
        JOptionPane.showMessageDialog(null, datos);
    }
}
    
/* Andres Felipe Cardona Londoño*/    

