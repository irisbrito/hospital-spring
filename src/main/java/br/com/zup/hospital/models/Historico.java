package br.com.zup.hospital.models;

import java.time.LocalDate;

public class Historico {
    private LocalDate dataDoRegistro;
    private String notaRegistro;

    public Historico() {
    }

    public LocalDate getDataDoRegistro() {
        return dataDoRegistro;
    }

    public void setDataDoRegistro(LocalDate dataDoRegistro) {
        this.dataDoRegistro = dataDoRegistro;
    }

    public String getNotaRegistro() {
        return notaRegistro;
    }

    public void setNotaRegistro(String notaRegistro) {
        this.notaRegistro = notaRegistro;
    }
}
