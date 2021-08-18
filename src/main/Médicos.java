package main;
public class Médicos {
    
    private int IDmedico;
    private String Nombre;
    private String Apellido;     
    private String Address;
    private int Telefono;
    private String Correo;
    private String Especialidad;  

    public Médicos() {
        this.IDmedico = 0;
        this.Nombre = "";
        this.Apellido = "";
        this.Address = "";
        this.Telefono = 0;
        this.Correo = "";
        this.Especialidad = "";
    }
    

    public int getIDmedico() {
        return IDmedico;
    }

    public void setIDmedico(int IDmedico) {
        this.IDmedico = IDmedico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    
}

