package model.entity;


import java.util.ArrayList;
import java.util.List;

public class TipoDeSuelo {
    private List<Cultivo> cultivos;
    public TipoDeSuelo(int descripcion) {
        Descripcion = descripcion;
        cultivos= new ArrayList<>();
    }

    private int Descripcion;

    public int getNumSuelo() {
        return Descripcion;
    }

    public void setNumSuelo(int numSuelo) {
        this.Descripcion = numSuelo;
    }
}
