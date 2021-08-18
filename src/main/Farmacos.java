package main;
public class Farmacos {
    
     
    private int CodigoProd;
    private String Fabricante;
    private int Dosis;     

    public Farmacos() {
        this.CodigoProd = 0;
        this.Fabricante = "";
        this.Dosis = 0;
    }
    
    

    public int getCodigoProd() {
        return CodigoProd;
    }

    public void setCodigoProd(int CodigoProd) {
        this.CodigoProd = CodigoProd;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public int getDosis() {
        return Dosis;
    }

    public void setDosis(int Dosis) {
        this.Dosis = Dosis;
    }
  
    
    
}

    
    

