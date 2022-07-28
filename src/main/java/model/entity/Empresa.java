package model.entity;

import java.util.List;

public class Empresa {
    public Empresa(List<Campo> campos, String nombre,Campo campo) {
        this.campos = campos;
        this.nombre = nombre;
        campo=campo;
    }

    private List<Campo> campos;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Campo> getCampos() {
        return campos;
    }

    public void setCampos(List<Campo> campos) {
        this.campos = campos;
    }
}
