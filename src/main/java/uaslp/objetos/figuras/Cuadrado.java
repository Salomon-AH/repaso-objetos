package uaslp.objetos.figuras;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado){
        super("Cuadrado");
        this.lado = lado;
    }

    public Cuadrado(){
        super("Cuadrado");
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public double getArea(){
        return lado * lado;
    }
}
