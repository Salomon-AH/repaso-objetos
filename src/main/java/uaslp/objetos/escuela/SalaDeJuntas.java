package uaslp.objetos.escuela;

public class SalaDeJuntas {
    private String nombre;

    public SalaDeJuntas(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public static SalaDeJuntas createSalaDeJuntas(String nombre){
        return new SalaDeJuntas(nombre);
    }
}
