package main;
public class RegistroPaciente {
    
     private int Cédula;
    private String DiagnosticoActual;
    private String HEnfermedad;  

    public RegistroPaciente() {
        this.Cédula = 0;
        this.DiagnosticoActual = "";
        this.HEnfermedad = "";
    }
    

    public int getCédula() {
        return Cédula;
    }

    public void setCédula(int Cédula) {
        this.Cédula = Cédula;
    }

    public String getDiagnosticoActual() {
        return DiagnosticoActual;
    }

    public void setDiagnosticoActual(String DiagnosticoActual) {
        this.DiagnosticoActual = DiagnosticoActual;
    }

    public String getHEnfermedad() {
        return HEnfermedad;
    }

    public void setHEnfermedad(String HEnfermedad) {
        this.HEnfermedad = HEnfermedad;
    }

  
}
