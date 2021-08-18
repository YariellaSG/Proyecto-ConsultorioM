package main;

import javax.swing.JOptionPane;

public class RutinaAtencion {
    
    private Atenciones Registro [] = new Atenciones[5];
    private String s = "";
    
    public void llenarArreglo() {
        int x;
        for (x = 0; x < 4; x++) {
            Atenciones e = new Atenciones();
            e.setNRegistro(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el número de registro:")));
            e.setFecha(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la fecha de atención:")));
            e.setTipoAtencion(JOptionPane.showInputDialog(null,
                    "Digite el tipo de atención brindada:"));
            e.setMotivo(JOptionPane.showInputDialog(null,
                    "Digite el Motivo:"));
            e.setAtendido(JOptionPane.showInputDialog(null,
                    "Digite la persona que lo atendio:"));
           
        }
    }
    
     public void mostrarArreglo(){
       int x;
       for(x=0;x<4;x++){
           s=s+Registro[x].getNRegistro()+"--"+
                   Registro[x].getFecha()+"--"+
                   Registro[x].getTipoAtencion()+"--"+
                   Registro[x].getMotivo()+"--"+
                   Registro[x].getAtendido()+"|";
       }
       JOptionPane.showMessageDialog(null,
               "Mostrar la orden de atención:\n"+s);
    
    
     }
}



