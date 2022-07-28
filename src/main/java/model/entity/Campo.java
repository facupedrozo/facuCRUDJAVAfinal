package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private String nombre;
    private EstadoDeCampo estadoDeCampo;

    private Provincia provincia;
    private List<Lote> lotes;

    public Campo(String nombre, EstadoDeCampo estadoDeCampo, Provincia provincia) {
        this.nombre = nombre;
        this.estadoDeCampo = estadoDeCampo;
        this.provincia = provincia;
        this.lotes = new ArrayList<>();
    }

    public Campo(){

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    public EstadoDeCampo getEstadoDeCampo() {
        return estadoDeCampo;
    }

    public void setEstadoDeCampo(EstadoDeCampo estadoDeCampo) {
        this.estadoDeCampo = estadoDeCampo;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
