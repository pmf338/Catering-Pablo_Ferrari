package ar.edu.unahur.obj2.catering;

public interface Propuesta {

    Double precio();

    String descripcion();

    Integer cantidadDeServicios();

    Boolean incluye(String nombre);
}
