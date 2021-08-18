package main;

import javax.swing.JOptionPane;

public class Rutinapacientes {
    
    
    private Pacientes Registro [] = new Pacientes[5];
    private String s = "";
    
    public void llenarArreglo() {
        int x;
        for (x = 0; x < 4; x++) {
            Pacientes e = new Pacientes();
            e.setIDpaciente(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el ID del paciente:")));
            e.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre:"));
            e.setApellido (JOptionPane.showInputDialog(null,
                    "Digite el apellido:"));
            e.setAddress(JOptionPane.showInputDialog(null,
                    "Digite el Address:"));
            e.setCorreo(JOptionPane.showInputDialog(null,
                    "Digite el correo electronico:"));
            e.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el número telefonico:")));
            e.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese la edad:")));
        }
    }
    
     public void mostrarArreglo(){
       int x;
       for(x=0;x<4;x++){
           s=s+Registro[x].getIDpaciente()+"--"+
                   Registro[x].getNombre()+"--"+
                   Registro[x].getApellido()+"--"+
                   Registro[x].getAddress()+"--"+
                   Registro[x].getCorreo()+"--"+
                   Registro[x].getTelefono()+"--"+
                   Registro[x].getEdad()+"|";
       }
       JOptionPane.showMessageDialog(null,
               "El registro del paciente es:\n"+s);
    
    
     }
}


