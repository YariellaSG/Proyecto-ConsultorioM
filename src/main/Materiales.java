package main;
public class Materiales {
    
      private String Proveedor;
    private int CantExistente;  
    private int CódigoMaterial;
    private String Descripción;

    public Materiales() {
        this.Proveedor = "";
        this.CantExistente = 0;
        this.CódigoMaterial = 0;
        this.Descripción = "";
    }
    
    

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public int getCantExistente() {
        return CantExistente;
    }

    public void setCantExistente(int CantExistente) {
        this.CantExistente = CantExistente;
    }

    public int getCódigoMaterial() {
        return CódigoMaterial;
    }

    public void setCódigoMaterial(int CódigoMaterial) {
        this.CódigoMaterial = CódigoMaterial;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }
    
    
    
}
