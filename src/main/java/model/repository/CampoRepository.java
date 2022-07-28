package model.repository;

import model.entity.Campo;
import model.entity.Lote;

import java.util.ArrayList;
import java.util.List;

public class CampoRepository {
    List<Campo> list=new ArrayList<>();
    public void crearCampo(Campo c){
        Campo camp = new Campo();
        camp.setNombre(c.getNombre());
        camp.setEstadoDeCampo(c.getEstadoDeCampo());
        camp.setProvincia(c.getProvincia());
        list.add(camp);
    }
    public void listarCampos() {
        for (Campo campor : list) {
            System.out.println(" CAMPO " + " -Nombre del Campo: "+campor.getNombre()+" -Estado Del Campo: "+campor.getEstadoDeCampo().getDecripcion()+" -Provincia: "+campor.getProvincia().getNombre());
        }
    }

    public String borrarCampoPorNombre(String nombre){
        list.removeIf(x->x.getNombre()==(nombre));
        return null;
    }

    public Campo editarCampo(Campo campo) {
        String nombreDeCampoX = "nombre";
        String nombreDeCampo = "nombre";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNombre().equals (campo.getNombre())) {
                nombreDeCampo = campo.getNombre();
                nombreDeCampoX = String.valueOf(i);
                break;
            }
        }

        Campo campo1 = new Campo();
        campo1.setNombre(nombreDeCampo);
        campo1.setEstadoDeCampo(campo.getEstadoDeCampo());
        campo1.setProvincia(campo.getProvincia());
        list.set(Integer.parseInt(nombreDeCampoX), campo);
        return campo1;
    }
}
