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
/*Significado de la expresion regular
    ^expresión -> El símbolo ^ indica el principio del String
    expresión$ -> El símbolo $ indica el final del String.
    -? -> indica que el string puede o no tener un guion medio, en este caso este guion estara antes del numero y servira como indicador de negativo
    [0-9] -> Rango que se incluye en el string
    + -> Indica 1 ó más veces, en este caso puede haber en el string al menos 1 valor del 0 al 9
    */
    public boolean validarNumeroEntero(String texto){
        return texto.matches("^-?[0-9]+$");//Aca retorna true si cumple con la expresion regular, en caso contrario retornara false
    }
    
    public boolean validarNumClientePositivo(int numCliente){
        if(numCliente > 0){
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
