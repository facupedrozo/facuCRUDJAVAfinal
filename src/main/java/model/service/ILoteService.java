package model.service;

import model.entity.Lote;

import java.util.List;

public interface ILoteService {
    public String crearLote(Lote l);
    public String borrar(int numeroDeLote);

    public void listLotes();
    public Lote editarPorNumero (Lote lote);


}
