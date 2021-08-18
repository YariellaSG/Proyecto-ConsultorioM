package main;
public class Provedores {
    
      private int CódigoProveedor;
    private String Nombre;  
    private String Producto;

    public Provedores() {
        this.CódigoProveedor = 0;
        this.Nombre = "";
        this.Producto = "";
    }
    
    

    public int getCódigoProveedor() {
        return CódigoProveedor;
    }

    public void setCódigoProveedor(int CódigoProveedor) {
        this.CódigoProveedor = CódigoProveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }
    
}
