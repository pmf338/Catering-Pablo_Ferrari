package ar.edu.unahur.obj2.catering.Comandos;

import ar.edu.unahur.obj2.catering.Menu;
import ar.edu.unahur.obj2.catering.Modificacion;
import ar.edu.unahur.obj2.catering.Propuesta;

public class QuitarPropuesta implements Modificacion{

    private final Menu menu;
    private final Propuesta propuesta;
    private Integer posicion;
    
    public QuitarPropuesta(Menu menu, Propuesta propuesta, Integer posicion) {
        this.menu = menu;
        this.propuesta = propuesta;
        this.posicion = posicion;
    }

    @Override
    public void ejecutar() {
        posicion = menu.indiceDe(propuesta);

        if(posicion == -1){
            throw new PropuestaNoIncluidaException();
        }

        menu.quitarEn(posicion);
    }

    @Override
    public void deshacer() {
        menu.agregarEn(posicion,propuesta);
    }

    
}
