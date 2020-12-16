package clases;
import javax.swing.JOptionPane;
/*@author Gustavo Apaza Huanca*/
public class Validacion {
    public boolean validarVacio(String cadena){
        if(cadena.isEmpty()){
            return true;
        }
        return false;
    }
    
    public boolean validarNumeroEntero(String texto){
        return texto.matches("^-?[0-9]+$");
    }
    
    public boolean validarNumClientePositivo(int numCliente){
        if(numCliente <= 0){
            return true;
        }
        return false;
    }
    
    public void mostrarAdvertencia(){
        JOptionPane.showMessageDialog(null, "- El campo Nombre NO puede estar vacio" +
                                            "\n- El campo Apellido NO puede estar vacio" +
                                            "\n- El campo Numero de Cliente debe ser un numero mayor a 0", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
    }
    
}
