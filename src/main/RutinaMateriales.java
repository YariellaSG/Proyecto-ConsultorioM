package main;

import javax.swing.JOptionPane;

public class RutinaMateriales {
    
    private Materiales Registro [] = new Materiales[4];
    private String s = "";
    
    public void llenarArreglo() {
        int x;
        for (x = 0; x < 4; x++) {
            Materiales e = new Materiales();
            e.setProveedor(JOptionPane.showInputDialog(null,
                    "Digite elProveedor:"));
            e.setCantExistente(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad existente:")));
            e.setCódigoMaterial(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el Código del material:")));
            e.setDescripción(JOptionPane.showInputDialog(null,
                    "Ingrese la descripción del producto:"));
            Registro[x]=e;
           
        }
    }
    
     public void mostrarArreglo(){
       int x;
       for(x=0;x<4;x++){
           s=s+    Registro[x].getProveedor()+"--"+
                   Registro[x].getCantExistente()+"--"+
                     Registro[x].getDescripción()+"--"+
                   Registro[x].getCódigoMaterial()+"|";
       }
       JOptionPane.showMessageDialog(null,
               "El registro de los materiales son:\n"+s);
    
    
     }
}

