
package main;
import javax.swing.JOptionPane;
public class Rutina1 {
    
    
     private Médicos Registro [] = new Médicos[4];
    private String s = "";
    
    public void llenarArreglo() {
        int x;
        for (x = 0; x < 4; x++) {
            Médicos e = new Médicos();
            e.setIDmedico(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el ID del médico:")));
            e.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre:"));
            e.setApellido (JOptionPane.showInputDialog(null,
                    "Digite el apellido:"));
            e.setAddress(JOptionPane.showInputDialog(null,
                    "Digite el Address:"));
            e.setCorreo(JOptionPane.showInputDialog(null,
                    "Digite el correo electronico:"));
            e.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el número telefonico:")));
            e.setEspecialidad(JOptionPane.showInputDialog(null,
                    "Ingrese la especialidad:"));
            Registro[x]=e;
        }
    }
    
     public void mostrarArreglo(){
       int x;
       for(x=0;x<4;x++){
           s=s+Registro[x].getIDmedico()+"--"+
                   Registro[x].getNombre()+"--"+
                   Registro[x].getApellido()+"--"+
                   Registro[x].getAddress()+"--"+
                   Registro[x].getCorreo()+"--"+
                   Registro[x].getTelefono()+"--"+
                   Registro[x].getEspecialidad()+"|";
       }
       JOptionPane.showMessageDialog(null,
               "El registro del medico es:\n"+s);
    
    
     }
}
