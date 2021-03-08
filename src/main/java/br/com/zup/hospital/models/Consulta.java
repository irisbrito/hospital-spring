package br.com.zup.hospital.models;

import br.com.zup.hospital.enums.TipoConsulta;

import java.time.LocalDate;

public class Consulta {
    private Paciente paciente;
    private LocalDate dataConsulta;
    private TipoConsulta tipoDaConsulta;

    public Consulta() {
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public TipoConsulta getTipoDaConsulta() {
        return tipoDaConsulta;
    }

    public void setTipoDaConsulta(TipoConsulta tipoDaConsulta) {
        this.tipoDaConsulta = tipoDaConsulta;
    }
}
