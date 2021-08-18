package main;

import javax.swing.JOptionPane;

public class RutinaRepaciente {
    
    
       private RegistroPaciente Registro [] = new RegistroPaciente[4];
    private String s = "";
    
    public void llenarArreglo() {
        int x;
        for (x = 0; x < 4; x++) {
            RegistroPaciente e = new RegistroPaciente();
            e.setCédula(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el ID del paciente que ingresó:")));
            e.setDiagnosticoActual(JOptionPane.showInputDialog(null, "Digite el diagnostico actual del paciente:"));
            e.setHEnfermedad (JOptionPane.showInputDialog(null,
                    "Digite el historial de enfermedades:"));
           
        }
    }
    
     public void mostrarArreglo(){
       int x;
       for(x=0;x<4;x++){
           s=s+Registro[x].getCédula()+"--"+
                   Registro[x].getDiagnosticoActual()+"--"+
                   Registro[x].getHEnfermedad()+"|";
       }
       JOptionPane.showMessageDialog(null,
               "El registro del paciente es:\n"+s);
    
    
     }
}
    

