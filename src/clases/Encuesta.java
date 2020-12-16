package clases;
/*@author Gustavo Apaza Huanca*/
public class Encuesta extends Cliente {
    private String nivelAtencion;
    private String nivelResolucion;
    private String nivelRecomendacion;

    public Encuesta(String nivelAtencion, String nivelResolucion, String nivelRecomendacion, String nombre, String apellido, String numCliente) {
        super(nombre, apellido, numCliente);
        this.nivelAtencion = nivelAtencion;
        this.nivelResolucion = nivelResolucion;
        this.nivelRecomendacion = nivelRecomendacion;
    }

    public void setNivelAtencion(String nivelAtencion) {
        this.nivelAtencion = nivelAtencion;
    }

    public void setNivelResolucion(String nivelResolucion) {
        this.nivelResolucion = nivelResolucion;
    }

    public void setNivelRecomendacion(String nivelRecomendacion) {
        this.nivelRecomendacion = nivelRecomendacion;
    }

    public String getNivelAtencion() {
        return nivelAtencion;
    }

    public String getNivelResolucion() {
        return nivelResolucion;
    }

    public String getNivelRecomendacion() {
        return nivelRecomendacion;
    }
    
    
    
    
}
