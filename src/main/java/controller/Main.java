package controller;
import model.entity.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LoteController loteController = new LoteController();
        CampoController campoController = new CampoController();
        ProyectoDeCultivoController proyectoDeCultivoController=new ProyectoDeCultivoController();
        loteController.crearLote(new Lote(1, 1000, new EstadoDeLote("disponible"), new TipoDeSuelo(1)));
        loteController.crearLote(new Lote(2, 1000, new EstadoDeLote("disponible"), new TipoDeSuelo(1)));
        loteController.listLotes();
        System.out.println("ahora borramos un lote y volvemos al listar");
        loteController.borrar(2);
        loteController.listLotes();
        System.out.println("ahora editamos un lote ya existente y volvemos a listar ");
        loteController.editarPorNumero(new Lote(1, 900, new EstadoDeLote("no disponible"), new TipoDeSuelo(2)));
        loteController.listLotes();

        campoController.crearCampo(new Campo("CampoFacundito", new EstadoDeCampo("disponible"), new Provincia("Misiones")));
        campoController.crearCampo(new Campo("CampoFacundote", new EstadoDeCampo("no disponible"), new Provincia("Misiones")));
        System.out.println("LISTAMOS CAMPOS CREADOS");
        campoController.listarCampos();
        System.out.println("eliminamos un campo y volvemos al listar");
        campoController.borrarCampoPorNombre("CampoFacundote");
        campoController.listarCampos();
        System.out.println("ahora editamos el que existe y volvemos a listar");
        campoController.editarCampo(new Campo("CampoFacundito", new EstadoDeCampo("disponible"), new Provincia("Corrientes")));
        campoController.listarCampos();

    }
}