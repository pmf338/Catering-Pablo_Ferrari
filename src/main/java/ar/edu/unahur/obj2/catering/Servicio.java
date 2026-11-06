package ar.edu.unahur.obj2.catering;

import ar.edu.unahur.obj2.catering.excepciones.PrecioNegativoException;

public class Servicio implements Propuesta{
    
    private final String nombre;
    private Double precio;
    
    public Servicio(String nombre, Double precio) {
        
        if(precio < 0){
            throw new PrecioNegativoException();
        }
        
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Double precio() {
        return precio;
    }

    @Override
    public String descripcion() {
        return nombre;
    }

    @Override
    public Integer cantidadDeServicios() {
        return 1;
    }

    @Override
    public Boolean incluye(String nombre) {
        return this.nombre.equals(nombre);
    }

    public void actualizarPrecio(Double nuevoPrecio){
        if(nuevoPrecio < 0){
            throw new PrecioNegativoException();
        }

        this.precio = nuevoPrecio;
    }

}
