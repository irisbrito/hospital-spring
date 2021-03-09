package br.com.zup.hospital.exceptions;

public class PacienteNaoEncontradoException extends RuntimeException {
    private int Status;
    private String campo;
    private String razaoDoErro;
    private String tipoDoErro;


    public PacienteNaoEncontradoException(String message) {
        super(message);
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getRazaoDoErro() {
        return razaoDoErro;
    }

    public void setRazaoDoErro(String razaoDoErro) {
        this.razaoDoErro = razaoDoErro;
    }

    public String getTipoDoErro() {
        return tipoDoErro;
    }

    public void setTipoDoErro(String tipoDoErro) {
        this.tipoDoErro = tipoDoErro;
    }
}
