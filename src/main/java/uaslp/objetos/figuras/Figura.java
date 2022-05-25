package uaslp.objetos.figuras;

abstract class Figura implements DrawableItem{
    private String name;

    protected Figura(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
