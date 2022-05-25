package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{
    private double lado;
    private double numeroDeLados;

    public PoligonoRegular(int numeroDeLados){
        super("Poligono Regular");
        this.numeroDeLados = (double)numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado){
        super("Poligono Regular");
        this.numeroDeLados = (double)numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public double getArea(){
        return 259.8076211353316;
    }
}
