package ar.edu.unahur.obj2.catering;

public class Contrato {

    private final String cliente;
    private final Double importe;
    private final String descripcion;
    
    public Contrato(String cliente, Double importe, String descripcion) {
        this.cliente = cliente;
        this.importe = importe;
        this.descripcion = descripcion;
    }

    public String getCliente() {
        return cliente;
    }

    public Double getImporte() {
        return importe;
    }

    public String getDescripcion() {
        return descripcion;
    }

    
}
