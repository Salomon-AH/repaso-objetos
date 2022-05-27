package uaslp.objetos.escuela;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }

    @Test
    public void validarDependencia1(){
        Dependencia1 dependencia1 = new Dependencia();
        Dependencia2 dependencia2 = new Dependencia();
        Dependencia3 dependencia3 = new Dependencia();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        algoritmoX.algoritmoACubrir(10, 10, "validarDependencia1");
    }

    @Test
    public void validarDependencia2(){
        Dependencia1 dependencia1 = new Dependencia();
        Dependencia2 dependencia2 = new Dependencia();
        Dependencia3 dependencia3 = new Dependencia();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        algoritmoX.algoritmoACubrir(5, 10, "validarDependencia2");
    }

    @Test
    public void validarDependencia3(){
        Dependencia1 dependencia1 = new Dependencia();
        Dependencia2 dependencia2 = new Dependencia();
        Dependencia3 dependencia3 = new Dependencia();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        algoritmoX.algoritmoACubrir(10, 5, "validarDependencia3");
    }
}
