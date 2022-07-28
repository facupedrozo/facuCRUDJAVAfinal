package model.repository;

import model.entity.Lote;

import java.util.ArrayList;
import java.util.List;

public class LoteRepository {
    public List<Lote>list=new ArrayList<>();

    public String crearLote(Lote l){
        Lote obj = new Lote();
        obj.setNumeroDeLote(l.getNumeroDeLote());
        obj.setSuperficie(l.getSuperficie());
        obj.setEstadoDeLote(l.getEstadoDeLote());
        obj.setTipoDeSuelo(l.getTipoDeSuelo());
        list.add(obj);
        return null;
    }
    public String borrar(int numeroDeLote){
        list.removeIf(x->x.getNumeroDeLote()==(numeroDeLote));
        return null;
    }

    public void listLote() {
        for (Lote loter : list) {
            System.out.println(" LOTE " + " -Numero de Lote: "+ loter.getNumeroDeLote()+" -Superficie: "+loter.getSuperficie()+" -Estado de lote: "+loter.getEstadoDeLote().getDescripcion()+" -Tipo de suelo: "+loter.getTipoDeSuelo().getNumSuelo());
        }
    }
    public Lote editarPorNumero (Lote lote) {
        int numeroDeLoteX = 0;
        int numeroDeLote = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumeroDeLote() == (lote.getNumeroDeLote())) {
                numeroDeLote = lote.getNumeroDeLote();
                numeroDeLoteX = i;
                break;
            }
        }

        Lote lote1 = new Lote();
        lote1.setNumeroDeLote(numeroDeLote);
        lote1.setSuperficie(lote.getSuperficie());
        lote1.setEstadoDeLote(lote.getEstadoDeLote());
        lote1.setTipoDeSuelo(lote.getTipoDeSuelo());
        list.set(numeroDeLoteX, lote);
        return lote1;
    }


}