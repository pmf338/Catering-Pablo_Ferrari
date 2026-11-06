package ar.edu.unahur.obj2.catering.excepciones;

public class PropuestaNoIncluidaException extends RuntimeException{

    public PropuestaNoIncluidaException(){
        super("La propuesta no está incluida directamente en el menu");
    }
}
