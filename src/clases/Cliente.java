package clases;
/*@author Gustavo Apaza Huanca*/
public class Cliente {
    private String nombre;
    private String apellido;
    private String numCliente;

    public Cliente(String nombre, String Apellido, String numCliente) {
        this.nombre = nombre;
        this.apellido = Apellido;
        this.numCliente = numCliente;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumCliente() {
        return numCliente;
    }
}
