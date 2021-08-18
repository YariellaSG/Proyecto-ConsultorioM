package main;

import javax.swing.JOptionPane;

public class RutinaFarma {
  
    private Farmacos Producto [] = new Farmacos[4];
    private String s = "";
    
    public void llenarArreglo() {
        int x;
        for (x = 0; x < 4; x++) {
            Farmacos e = new Farmacos();
            e.setCodigoProd(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el código del producto:")));
            e.setFabricante(JOptionPane.showInputDialog(null, "Digite el nombre del fabricante:"));
            e.setDosis(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite la dosis del producto:")));
            Producto[x]=e;
        
        }
    }
    
     public void mostrarArreglo(){
       int x;
       for(x=0;x<4;x++){
           s=s+    Producto[x].getCodigoProd()+"--"+
                   Producto[x].getFabricante()+"--"+
                   Producto[x].getDosis()+"|";
       }
       JOptionPane.showMessageDialog(null,
               "El registro del paciente es:\n"+s);
    
    
     }
    
    
}  
    
    

