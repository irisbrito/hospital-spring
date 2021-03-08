package br.com.zup.hospital.services;

import br.com.zup.hospital.models.Historico;
import br.com.zup.hospital.models.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Historico> historicoDeConsultas = new ArrayList<>();

    public Paciente adicionarPaciente(Paciente paciente){
        try{
            pesquisarPaciente(paciente);
        }catch (RuntimeException erro){
            pacientes.add(paciente);
            paciente.setHistorico(new ArrayList<>());
            return paciente;
        }
        return paciente;
    }

    public Paciente pesquisarPaciente(String nome){
        for(Paciente usuario : pacientes){
            if(usuario.getNome().equalsIgnoreCase(usuario.getNome())){
                return usuario;
            }
        }
        throw new RuntimeException("Paciente não encontrado.");
    }

    public Paciente pesquisarPacientePeloCPF(String cpf){
        for(Paciente paciente: pacientes){
            if(paciente.getCpf().equals(cpf)){
                return paciente;
            }
        }
        throw new RuntimeException("Paciente não encontrado pelo CPF indicado");
    }


    public Paciente pesquisarPaciente(Paciente paciente){
        return pesquisarPaciente(paciente.getNome());
    }


}

