package main;

import javax.swing.JOptionPane;

public class RutinaAfiliado {
    
    private Afiliados Registro [] = new Afiliados[4];
    private String s = "";
    
    public void llenarArreglo() {
        int x;
        for (x = 0; x < 4; x++) {
            Afiliados e = new Afiliados();
            e.setNAfiliado(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el ID del médico:")));
            e.setNobraSocial(JOptionPane.showInputDialog(null, "Digite el nombre:"));
            e.setIDpaciente(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el apellido:")));
            Registro[x]=e;
    }
    }
    
    public void mostrarArreglo()  {
       int x;
       for(x=0;x<4;x++){
           s=s+    Registro[x].getNAfiliado()+"--"+
                   Registro[x].getNobraSocial()+"--"+
                   Registro[x].getIDpaciente()+"|";
}
 JOptionPane.showMessageDialog(null,
               "El registro del medico es:\n"+s);
     }
}


 
  

