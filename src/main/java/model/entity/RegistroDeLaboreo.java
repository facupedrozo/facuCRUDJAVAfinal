package model.entity;

import java.time.LocalDate;

public class RegistroDeLaboreo {
    private  LocalDate fechaInicio;
    private LocalDate fechafin;
    public RegistroDeLaboreo(){}
    public RegistroDeLaboreo(LocalDate fechaInicio, LocalDate fechafin,OrdenDeLaboreo ordenDeLaboreo) {
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        ordenDeLaboreo=ordenDeLaboreo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }
}
