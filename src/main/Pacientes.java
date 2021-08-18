package main;
public class Pacientes {
    private int IDpaciente;
    private String Nombre;
    private String Apellido;     
    private String Address;
    private int Telefono;
    private String Correo;
    private int Edad;

    public Pacientes() {
        this.IDpaciente = 0;
        this.Nombre = "";
        this.Apellido = "";
        this.Address = "";
        this.Telefono = 0;
        this.Correo = "";
        this.Edad = 0;
    }
    
    

    public int getIDpaciente() {
        return IDpaciente;
    }

    public void setIDpaciente(int IDpaciente) {
        this.IDpaciente = IDpaciente;
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

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    

    
}


