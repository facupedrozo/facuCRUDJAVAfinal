package model.service;

import model.entity.Campo;
import model.repository.CampoRepository;

public class CampoServiceImpl implements ICampoService {
    private CampoRepository campoRepository=new CampoRepository();
    @Override
    public void crearCampo(Campo c) {
        campoRepository.crearCampo(c);
    }

    @Override
    public void listarCampos() {
        campoRepository.listarCampos();
    }

    @Override
    public String borrarCampoPorNombre(String nombre) {
        return campoRepository.borrarCampoPorNombre(nombre);
    }

    @Override
    public Campo editarCampo(Campo campo) {
        return campoRepository.editarCampo(campo);
    }
}
