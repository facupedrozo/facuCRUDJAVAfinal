package model.entity;

import java.util.List;

public class Cultivo {
    private List<OrdenDeLaboreo> ordenDeLaboreos;
    public Cultivo(String nombre) {
        nombre= nombre;
        ordenDeLaboreos=ordenDeLaboreos;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<OrdenDeLaboreo> getOrdenDeLaboreos() {
        return ordenDeLaboreos;
    }

    public void setOrdenDeLaboreos(List<OrdenDeLaboreo> ordenDeLaboreos) {
        this.ordenDeLaboreos = ordenDeLaboreos;
    }
}
