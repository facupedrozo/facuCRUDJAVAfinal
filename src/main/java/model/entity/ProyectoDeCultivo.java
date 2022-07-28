package model.entity;

import java.util.ArrayList;
import java.util.List;

public class ProyectoDeCultivo {
    private EstadoDeProyecto estadoDeProyecto;
    private List<RegistroDeLaboreo>registroDeLaboreos;

    public ProyectoDeCultivo(EstadoDeProyecto estadoDeProyecto) {
        estadoDeProyecto=estadoDeProyecto;
        registroDeLaboreos= new ArrayList<>();

    }
    public ProyectoDeCultivo(){}

    public ProyectoDeCultivo(EstadoDeProyecto estadoDeProyecto, List<RegistroDeLaboreo> registroDeLaboreos) {
        this.estadoDeProyecto = estadoDeProyecto;
        this.registroDeLaboreos = registroDeLaboreos;
    }

    public EstadoDeProyecto getEstadoDeProyecto() {
        return estadoDeProyecto;
    }

    public void setEstadoDeProyecto(EstadoDeProyecto estadoDeProyecto) {
        this.estadoDeProyecto = estadoDeProyecto;
    }

    public List<RegistroDeLaboreo> getRegistroDeLaboreos() {
        return registroDeLaboreos;
    }

    public void setRegistroDeLaboreos(List<RegistroDeLaboreo> registroDeLaboreos) {
        this.registroDeLaboreos = registroDeLaboreos;
    }
}
