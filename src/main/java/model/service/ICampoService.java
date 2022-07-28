package model.service;

import model.entity.Campo;

public interface ICampoService {
    public void crearCampo(Campo c);
    public void listarCampos();
    public String borrarCampoPorNombre(String nombre);
    public Campo editarCampo(Campo campo);
}
