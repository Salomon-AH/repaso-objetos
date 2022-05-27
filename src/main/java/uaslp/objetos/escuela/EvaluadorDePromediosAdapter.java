package uaslp.objetos.escuela;

public class EvaluadorDePromediosAdapter {
    private EvaluadorDePromedios evaluadorDePromedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios){
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones){
        return evaluadorDePromedios.evalua(listaDeCalificaciones);
    }
}
