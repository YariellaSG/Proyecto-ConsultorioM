package main;
public class Atenciones {
    
    
      private int NRegistro;
    private int Fecha;
    private String TipoAtencion;     
    private String Motivo;
    private String Atendido;

    public Atenciones() {
        this.NRegistro = 0;
        this.Fecha = 0;
        this.TipoAtencion = "";
        this.Motivo = "";
        this.Atendido = "";
    }
    
    

    public int getNRegistro() {
        return NRegistro;
    }

    public void setNRegistro(int NRegistro) {
        this.NRegistro = NRegistro;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipoAtencion() {
        return TipoAtencion;
    }

    public void setTipoAtencion(String TipoAtencion) {
        this.TipoAtencion = TipoAtencion;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getAtendido() {
        return Atendido;
    }

    public void setAtendido(String Atendido) {
        this.Atendido = Atendido;
    }
    
    
    
}


