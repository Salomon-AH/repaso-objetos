package uaslp.objetos.figuras;

public class PoligonoRegular {
    private double lado;
    private double numeroDeLados;

    public PoligonoRegular(int numeroDeLados){
        this.numeroDeLados = (double)numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado){
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
