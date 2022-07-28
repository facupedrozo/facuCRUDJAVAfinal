package model.entity;

public class EstadoDeLote {
    public EstadoDeLote(String descripcion) {
        this.descripcion = descripcion;
    }

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
