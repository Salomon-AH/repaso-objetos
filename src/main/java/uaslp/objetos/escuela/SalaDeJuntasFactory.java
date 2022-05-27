package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    public static SalaDeJuntas get(String nombre){
        SalaDeJuntas sala = SalaDeJuntas.createSalaDeJuntas(nombre);
        return sala;
    }
}
