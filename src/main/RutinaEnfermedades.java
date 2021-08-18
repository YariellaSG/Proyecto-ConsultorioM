package main;

import javax.swing.JOptionPane;

public class RutinaEnfermedades {
    
    
    
       private Enfermedades Registro [] = new Enfermedades[5];
    private String s = "";
    
    public void llenarArreglo() {
        int x;
        for (x = 0; x < 4; x++) {
            Enfermedades e = new Enfermedades();
            e.setCódigoEnfermedad(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el Código de la enfermedad del paciente:")));
            e.setDescripción(JOptionPane.showInputDialog(null, "Ingrese su descripción:"));
            e.setTratamiento(JOptionPane.showInputDialog(null,
                    "Digite el tratamiento indicado por el doctor:"));
          
          
        }
    }
    
     public void mostrarArreglo(){
       int x;
       for(x=0;x<4;x++){
           s=s+Registro[x].getCódigoEnfermedad()+"--"+
                   Registro[x].getDescripción()+"--"+
                   Registro[x].getTratamiento()+"|";
       }
       JOptionPane.showMessageDialog(null,
               "El registro del enfermedades es:\n"+s);
    
    
     }
}

