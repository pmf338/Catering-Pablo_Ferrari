package ar.edu.unahur.obj2.catering;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GestionDeCartaTest {

    private Servicio fotografo(){
        return new Servicio("Fotógrafo",100000.0);

    }

    private Servicio parrillada(){
        return new Servicio("Parrillada Completa",2400000.0);
    }

    private Menu crearMenuParrillero(){
        Menu menu = new Menu("Menú Parrillero",10.0);
        menu.agregar(new Servicio("Mesa de entradas",80000.0));
        menu.agregar(parrillada());
        menu.agregar(new Servicio("Mesa dulce",60000.0));
        return menu;
    }

    @Test 
    void dadaUnaModifiacionDeAgregar_alAplicarla_agregaLaPropuestaAlMenu(){
        Menu menu = crearMenuParrillero(parrillada());
        Servicio fotografo = fotografo();

        GestorDeCarta gestor = new GestorDeCarta();
        gestor.aplicar(new AgregarPropuesta(menu,fotografo));

        assertTrue(menu.incluye("Fotógrafo"));
        assertEquals(432000.0,menu.precio());
        
    }
}
