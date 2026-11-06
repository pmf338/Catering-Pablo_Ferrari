package ar.edu.unahur.obj2.catering;

public class ServicioNocturno extends AdicionalDecorator{
    
    public ServicioNocturno(Propuesta propuesta){
        super(propuesta);
    }

    @Override
    public Double precio() {
        return propuesta.precio() * 1.20;
    }

    @Override
    protected String nombreAdicional() {
        return "Servicio nocturno";
    }

}
