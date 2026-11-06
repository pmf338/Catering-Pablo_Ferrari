package ar.edu.unahur.obj2.catering.excepciones;

public class DescuentoInvalidoException extends RuntimeException{

    public DescuentoInvalidoException(){
        super("El descuento debe estar entre 0 y 100");
    }

}
