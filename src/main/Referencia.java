package main;
public class Referencia {
    
    
     private String Médico;
    private String Farmaco;
    private String Paciente;     
    private int CódigoMaterial;
    private String TAtención;
    private String Receta;
    private int TiempoAtencion;  
    private String FormadePago;
    private String Asegurado;

    public Referencia() {
        this.Médico = "";
        this.Farmaco = "";
        this.Paciente = "";
        this.CódigoMaterial = 0;
        this.TAtención = "";
        this.Receta = Receta= "";
        this.TiempoAtencion = 0;
        this.FormadePago = "";
        this.Asegurado = "";
    }
    
    

    public String getMédico() {
        return Médico;
    }

    public void setMédico(String Médico) {
        this.Médico = Médico;
    }

    public String getFarmaco() {
        return Farmaco;
    }

    public void setFarmaco(String Farmaco) {
        this.Farmaco = Farmaco;
    }

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public int getCódigoMaterial() {
        return CódigoMaterial;
    }

    public void setCódigoMaterial(int CódigoMaterial) {
        this.CódigoMaterial = CódigoMaterial;
    }

    public String getTAtención() {
        return TAtención;
    }

    public void setTAtención(String TAtención) {
        this.TAtención = TAtención;
    }

    public String getReceta() {
        return Receta;
    }

    public void setReceta(String Receta) {
        this.Receta = Receta;
    }

    public int getTiempoAtencion() {
        return TiempoAtencion;
    }

    public void setTiempoAtencion(int TiempoAtencion) {
        this.TiempoAtencion = TiempoAtencion;
    }

    public String getFormadePago() {
        return FormadePago;
    }

    public void setFormadePago(String FormadePago) {
        this.FormadePago = FormadePago;
    }

    public String getAsegurado() {
        return Asegurado;
    }

    public void setAsegurado(String Asegurado) {
        this.Asegurado = Asegurado;
    }
    
    
}
