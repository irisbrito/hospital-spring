package br.com.zup.hospital.DTOs;

import br.com.zup.hospital.models.Paciente;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

public class CadastroPacienteDTO {
    private String nome;
    @Email(message = "Email invalido")
    private String email;

    @Min(value = 18, message = "Apenas maiores de 18 podem se cadastrar")
    private int idade;

    @CPF(message = "CPF Invalido")
    private String cpf;

    public CadastroPacienteDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Paciente converterDTOParaPaciente(){
        Paciente paciente = new Paciente();
        paciente.setNome(this.nome);
        paciente.setCpf(this.cpf);
        paciente.setIdade(this.idade);
        paciente.setEmail(this.email);

        return paciente;
    }


}
