package main;

import javax.swing.JOptionPane;

public class RutinaReferencia {
    
     private Referencia Registro [] = new Referencia[5];
    private String s = "";
    
    public void llenarArreglo() {
        int x;
        for (x = 0; x < 4; x++) {
            Referencia e = new Referencia();
            e.setMédico(JOptionPane.showInputDialog(null,
                    "Digite el Médico de referencia:"));
            e.setFarmaco(JOptionPane.showInputDialog(null, "Digite el ID o Name del Farmaco:"));
            e.setPaciente(JOptionPane.showInputDialog(null,
                    "Digite el paciente de referencia:"));
            e.setCódigoMaterial(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el código del material utilizado:")));
            e.setTAtención(JOptionPane.showInputDialog(null,
                    "Digite el tipo de atencíon que recibio:"));
            e.setReceta(JOptionPane.showInputDialog(null,
                    "Ingrese Receta médica recitada:"));
            e.setTiempoAtencion(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el tiempo de atención:")));
             e.setFormadePago(JOptionPane.showInputDialog(null,
                    "Ingrese la forma de pago del paciente:"));
              e.setAsegurado(JOptionPane.showInputDialog(null,
                    "Ingrese si el paciente es asegurado o no:"));
              Registro[x]=e;
        }
    }
    
     public void mostrarArreglo(){
       int x;
       for(x=0;x<4;x++){
           s=s+Registro[x].getMédico()+"--"+
                   Registro[x].getFarmaco()+"--"+
                   Registro[x].getPaciente()+"--"+
                   Registro[x].getCódigoMaterial()+"--"+
                   Registro[x].getTAtención()+"--"+
                   Registro[x].getReceta()+"--"+
                   Registro[x].getTiempoAtencion()+"--"+
                   Registro[x].getFormadePago()+"--"+
                   Registro[x].getAsegurado()+"|";
       }
       JOptionPane.showMessageDialog(null,
               "El registro de la referencia es:\n"+s);
    
    
     }
}
