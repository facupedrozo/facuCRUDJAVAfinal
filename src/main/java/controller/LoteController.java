package controller;

import model.entity.Lote;
import model.service.ILoteService;
import model.service.LoteServiceImpl;

import java.util.List;

public class LoteController {
    private ILoteService loteService=new LoteServiceImpl();
    public String crearLote(Lote l){
        return loteService.crearLote(l);
    }
    public String borrar(int numeroDeLote){
        return loteService.borrar(numeroDeLote);
    }

    public void listLotes(){
         loteService.listLotes();
    }
    public Lote editarPorNumero (Lote lote){
        return loteService.editarPorNumero(lote);
    }


}
