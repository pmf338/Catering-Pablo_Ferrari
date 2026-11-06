package ar.edu.unahur.obj2.catering.Comandos;

import ar.edu.unahur.obj2.catering.Modificacion;
import ar.edu.unahur.obj2.catering.Servicio;

public class ActualizarPrecio implements Modificacion{

    public final Servicio servicio;
    private final Double nuevoPrecio;
    private Double precioAnterior;
    
    public ActualizarPrecio(Servicio servicio, Double nuevoPrecio, Double precioAnterior) {
        this.servicio = servicio;
        this.nuevoPrecio = nuevoPrecio;
        this.precioAnterior = precioAnterior;
    }

    @Override
    public void ejecutar() {
        precioAnterior = servicio.precio();
        servicio.actualizarPrecio(nuevoPrecio);
    }

    @Override
    public void deshacer() {
        servicio.actualizarPrecio(precioAnterior);
    }

    
}
