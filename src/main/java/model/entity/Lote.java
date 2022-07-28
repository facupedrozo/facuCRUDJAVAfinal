package model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int numeroDeLote;
    private int superficie;
    private EstadoDeLote estadoDeLote;
    private TipoDeSuelo tipoDeSuelo;

    public Lote() {
    }

    private List<ProyectoDeCultivo>proyectoDeCultivos=new ArrayList<>();
    public Lote(int numeroDeLote, int superficie, EstadoDeLote estadoDeLote, TipoDeSuelo tipoDeSuelo) {
        this.numeroDeLote = numeroDeLote;
        this.superficie = superficie;
        this.estadoDeLote=estadoDeLote;
        this.tipoDeSuelo=tipoDeSuelo;
        proyectoDeCultivos= new ArrayList<>();
    }

    public EstadoDeLote getEstadoDeLote() {
        return estadoDeLote;
    }

    public void setEstadoDeLote(EstadoDeLote estadoDeLote) {
        this.estadoDeLote = estadoDeLote;
    }

    public TipoDeSuelo getTipoDeSuelo() {
        return tipoDeSuelo;
    }

    public void setTipoDeSuelo(TipoDeSuelo tipoDeSuelo) {
        this.tipoDeSuelo = tipoDeSuelo;
    }

    public int getNumeroDeLote() {
        return numeroDeLote;
    }

    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }


}
