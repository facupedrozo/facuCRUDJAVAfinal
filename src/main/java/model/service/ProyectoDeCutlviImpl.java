package model.service;

import model.entity.ProyectoDeCultivo;
import model.repository.ProyectoDeCultivoRepository;

public class ProyectoDeCutlviImpl implements IProyectoDeCultivoService{
    private ProyectoDeCultivoRepository proyectoDeCultivoRepository=new ProyectoDeCultivoRepository();
    @Override
    public void crearProyectoDeCultivo(ProyectoDeCultivo p) {
        proyectoDeCultivoRepository.crearProyectoDeCultivo(p);
    }
}
