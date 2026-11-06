package ar.edu.unahur.obj2.catering;

public abstract class AdicionalDecorator implements Propuesta{

    protected final Propuesta propuesta;

    public AdicionalDecorator(Propuesta propuesta) {
        this.propuesta = propuesta;
    }

    @Override 
    public String descripcion(){
        return propuesta.descripcion() + " + " + nombreAdicional();
    }

    @Override 
    public Integer cantidadDeServicios(){
        return propuesta.cantidadDeServicios();
    }

    @Override 
    public Boolean incluye(String nombre){
        return propuesta.incluye(nombre);
    }

    protected abstract String nombreAdicional();

}
