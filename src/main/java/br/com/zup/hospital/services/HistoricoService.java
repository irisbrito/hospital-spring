package br.com.zup.hospital.services;

import br.com.zup.hospital.models.Historico;
import br.com.zup.hospital.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoricoService {

    @Autowired
    PacienteService pacienteService;

    public Historico registrarHistorico(String cpf, Historico historico){
        Paciente paciente = pacienteService.pesquisarPacientePeloCPF(cpf);
        paciente.getHistorico().add(historico);
        return historico;
    }

    private void ordenaHistoricosDoPaciente(Paciente paciente) {
        paciente.getHistorico().sort((Historico historico1, Historico historico2) -> {
            return historico2.getDataDoRegistro().compareTo(historico1.getDataDoRegistro());
        });
    }
}
