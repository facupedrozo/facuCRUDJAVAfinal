package model.service;

import model.entity.Lote;
import model.repository.LoteRepository;

import java.util.List;

public class LoteServiceImpl implements ILoteService{
    private LoteRepository loteRepository = new LoteRepository() ;


    @Override
    public String crearLote(Lote l) {
        return loteRepository.crearLote(l);
    }

    @Override
    public String borrar(int numeroDeLote) {
        return loteRepository.borrar(numeroDeLote);
    }

    @Override
    public void listLotes() {
        loteRepository.listLote();
    }

    @Override
    public Lote editarPorNumero(Lote lote) {
        return loteRepository.editarPorNumero(lote);
    }


}
