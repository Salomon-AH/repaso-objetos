package uaslp.objetos.figuras;

public class DatoFaltanteException extends RuntimeException{
    public DatoFaltanteException(){
        super("Número de lados válido a partir de 5");
    }
}
