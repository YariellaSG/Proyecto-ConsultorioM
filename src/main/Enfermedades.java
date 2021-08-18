package main;
public class Enfermedades {
    
    private int CódigoEnfermedad;
    private String Descripción;
    private String Tratamiento;   

    public Enfermedades() {
        this.CódigoEnfermedad = 0;
        this.Descripción = "";
        this.Tratamiento = "";
    }


    public int getCódigoEnfermedad() {
        return CódigoEnfermedad;
    }

    public void setCódigoEnfermedad(int CódigoEnfermedad) {
        this.CódigoEnfermedad = CódigoEnfermedad;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
    }
      
    
    
}
