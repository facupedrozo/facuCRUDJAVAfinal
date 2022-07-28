package model.repository;

import model.entity.Campo;
import model.entity.Provincia;
import model.entity.ProyectoDeCultivo;

import java.util.ArrayList;
import java.util.List;

public class ProyectoDeCultivoRepository {
    private List<ProyectoDeCultivo> list=new ArrayList<>();
    public void crearProyectoDeCultivo(ProyectoDeCultivo p){
        ProyectoDeCultivo pro = new ProyectoDeCultivo();
        pro.setEstadoDeProyecto(p.getEstadoDeProyecto());
        pro.setRegistroDeLaboreos(p.getRegistroDeLaboreos());
        list.add(pro);
    }
}
