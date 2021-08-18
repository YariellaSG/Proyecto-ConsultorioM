package main;

import javax.swing.JOptionPane;

public class RutinaProvedores {
    
       private Provedores Registro [] = new Provedores[5];
    private String s = "";
    
    public void llenarArreglo() {
        int x;
        for (x = 0; x < 4; x++) {
            Provedores e = new Provedores();
            e.setCódigoProveedor(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el Código del proveedor:")));
            e.setNombre(JOptionPane.showInputDialog(null, "Digite el Nombre del provedor:"));
            e.setProducto(JOptionPane.showInputDialog(null,
                    "Digite el producto:"));
            Registro[x]=e;
            
        }
    }
    
     public void mostrarArreglo(){
       int x;
       for(x=0;x<4;x++){
           s=s+    Registro[x].getCódigoProveedor()+"--"+
                   Registro[x].getNombre()+"--"+
                   Registro[x].getProducto()+"|";
       }
       JOptionPane.showMessageDialog(null,
               "El registro de los proveedores es:\n"+s);
    
    
     }
}

