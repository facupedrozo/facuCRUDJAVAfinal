package controller;

import model.entity.ProyectoDeCultivo;
import model.service.IProyectoDeCultivoService;
import model.service.ProyectoDeCutlviImpl;

public class ProyectoDeCultivoController {
    private IProyectoDeCultivoService proyectoDeCultivoService=new ProyectoDeCutlviImpl();
    public void crearProyectoDeCultivo(ProyectoDeCultivo p){
        proyectoDeCultivoService.crearProyectoDeCultivo(p);
    }
}
