package controller;

import model.entity.Campo;
import model.service.CampoServiceImpl;
import model.service.ICampoService;

public class CampoController {
    private ICampoService campoService= new CampoServiceImpl();
    public void crearCampo(Campo c){
        campoService.crearCampo(c);
    }
    public void listarCampos(){
        campoService.listarCampos();
    }
    public String borrarCampoPorNombre(String nombre){
        return campoService.borrarCampoPorNombre(nombre);
    }
    public Campo editarCampo(Campo campo){
        return campoService.editarCampo(campo);
    }

}
