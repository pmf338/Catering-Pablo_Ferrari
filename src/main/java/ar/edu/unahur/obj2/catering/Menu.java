package ar.edu.unahur.obj2.catering;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.catering.excepciones.DescuentoInvalidoException;

public class Menu implements Propuesta{
    
    private final String nombre;
    private final Double descuento;
    private final List<Propuesta> propuestas;
    
    public Menu(String nombre, Double descuento) {
        
        if(descuento < 0 || descuento > 100){
            throw new DescuentoInvalidoException();
        }
        
        this.nombre = nombre;
        this.descuento = descuento;
        this.propuestas = new ArrayList<>();
    }

    public void agregar(Propuesta propuesta){
        propuestas.add(propuesta);
    }

    public void quitar(Propuesta propuesta){
        propuestas.remove(propuesta);
    }

    public Boolean contieneDirectamente(Propuesta propuesta){
        return propuestas.contains(propuesta);
    }

    @Override
    public Double precio() {
        
        Double precioTotal = propuestas.stream().mapToDouble(Propuesta::precio).sum();

        return precioTotal * (1 - descuento/100);
    }

    @Override
    public String descripcion() {
        return nombre;
    }

    @Override
    public Integer cantidadDeServicios() {
        
        Integer cantidad = propuestas.stream().mapToInt(Propuesta::cantidadDeServicios).sum();

        return cantidad;
    }

    @Override
    public Boolean incluye(String nombre) {
        return propuestas.stream().anyMatch(propuesta -> propuesta.incluye(nombre));
    }

    public Integer indiceDe(Propuesta propuesta){
        return propuestas.indexOf(propuesta);
    }

    public void quitarEn(Integer posicion){
        propuestas.remove(posicion);
    }

    public void agregarEn(Integer posicion,Propuesta propuesta){
        propuestas.add(posicion,propuesta);
    }
    
}
