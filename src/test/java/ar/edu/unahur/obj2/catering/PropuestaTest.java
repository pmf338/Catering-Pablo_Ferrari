package ar.edu.unahur.obj2.catering;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.catering.excepciones.PrecioNegativoException;

public class PropuestaTest {

    @Test 
    void dadoUnMenuQueContieneOtrosMenus_alConsultarInclusion_buscaEnTodosLosNiveles(){
        Menu parrillero = new Menu("Menú Parrillero",10.0);
        parrillero.agregar(new Servicio("Mesa de entradas",80000.0));
        parrillero.agregar(new Servicio("Parrillada completa",2400000.0));
        parrillero.agregar(new Servicio("Mesa dulce",60000.0));

        Menu fiesta = new Menu("Pack Fiesta",5.0);
        fiesta.agregar(new Servicio("Barra de tragos",150000.0));
        fiesta.agregar(new Servicio("DJ y sonido",120000.0));

        Menu eventoCompleto = new Menu("Evento Completo",20.0);
        eventoCompleto.agregar(parrillero);
        eventoCompleto.agregar(fiesta);
        eventoCompleto.agregar(new Servicio("Brindis de bienvenida",50000.0));

        assertTrue(eventoCompleto.incluye("DJ y sonido"));
        assertTrue(eventoCompleto.incluye("Parrillada completa"));
        assertFalse(eventoCompleto.incluye("Fotógrafo"));
    }

    @Test 
    void dadoUnServicioConPrecioNegativo_alCrearlo_lanzaPrecioNegativoException(){
        assertThrows(PrecioNegativoException.class,() -> new Servicio("Fotógrafo",-100.0));
    }
}
