package ar.edu.unahur.obj2.catering.Comandos;

import ar.edu.unahur.obj2.catering.Menu;
import ar.edu.unahur.obj2.catering.Modificacion;
import ar.edu.unahur.obj2.catering.Propuesta;

public class AgregarPropuesta implements Modificacion{

    private final Menu menu;
    private final Propuesta propuesta;
    
    public AgregarPropuesta(Menu menu, Propuesta propuesta) {
        this.menu = menu;
        this.propuesta = propuesta;
    }

    @Override
    public void ejecutar() {
       menu.agregar(propuesta);
    }

    @Override
    public void deshacer() {
        menu.quitar(propuesta);
    }

    
}
