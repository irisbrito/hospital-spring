package br.com.zup.hospital.controllers;

import br.com.zup.hospital.DTOs.CadastroPacienteDTO;
import br.com.zup.hospital.models.Paciente;
import br.com.zup.hospital.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("pacientes/")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Paciente adicionarPaciente(@RequestBody @Valid CadastroPacienteDTO cadastroPacienteDTO){
        Paciente objetoPaciente = pacienteService.adicionarPaciente(cadastroPacienteDTO.converterDTOParaPaciente());
        return objetoPaciente;
    }

    @GetMapping("{cpf}/")
    public Paciente pesquisarPaciente(@PathVariable String cpf){

            Paciente paciente = pacienteService.pesquisarPacientePeloCPF(cpf);
            return paciente;

    }

}
