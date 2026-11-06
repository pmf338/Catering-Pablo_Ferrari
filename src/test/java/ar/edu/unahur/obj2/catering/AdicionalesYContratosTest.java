package ar.edu.unahur.obj2.catering;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdicionalesYContratosTest {

    private Menu crearMenuParrillero(){
        
        Menu menu = new Menu("Menú Parrillero",10.0);
        menu.agregar(new Servicio("Mesa de entradas",80000.0));
        menu.agregar(new Servicio("Parrillada completa",240000.0));
        menu.agregar(new Servicio("Mesa dulce",60000.0));
        return menu;

    }

    @Test 
    void dadaVajillaPremium_alAplicarla_sumaDoceMilAlPrecio(){
        
        Propuesta propuesta = new VajillaPremium(new Servicio("Brindis de bienvenida",50000.0));

        assertEquals(62000.0,propuesta.precio());
    }

    @Test 
    void dadoMozosAdicionales_alAplicarlo_sumaDieciochoMilAlPrecio(){
        Propuesta propuesta = new MozosAdicionales(crearMenuParrillero());

        assertEquals(360000.0,propuesta.precio());
    }

    @Test 
    void dadoServicioNocturno_alAplicarlo_incrementaElPrecioUnVeintePorCiento(){
        
        Propuesta propuesta = new ServicioNocturno(new Servicio("Mesa dulce",60000.0));

        assertEquals(72000.0,propuesta.precio());
    }

    @Test 
    void dadoUnaPropuesta_alRepetirUnAdicional_seAplicaCadaVez(){
        Propuesta propuesta = new VajillaPremium(new VajillaPremium(new Servicio("Brindis de bienvenida",50000.0)));

        assertEquals(74000.0, propuesta.precio());
        assertEquals("Brindis de bienvenida + VajillaPremium + VajillaPremium",propuesta.descripcion());

    }

    @Test 
    void dadaUnaPropuestaConAdicionales_alConsultarSuDescripcion_agregaLosNombresEnOrden(){
        
        Propuesta propuesta = new ServicioNocturno(new MozosAdicionales(crearMenuParrillero()));

        assertEquals("Menú Parrillero + Mozos adicionales + Servicio nocturno",propuesta.descripcion());
    }
}
