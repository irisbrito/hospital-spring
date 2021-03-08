package br.com.zup.hospital.controllers;

import br.com.zup.hospital.models.Paciente;
import br.com.zup.hospital.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("pacientes/")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Paciente adicionarPaciente(@RequestBody Paciente paciente){
        return pacienteService.adicionarPaciente(paciente);
    }

    @GetMapping("{cpf}/")
    public Paciente pesquisarPaciente(@PathVariable String cpf){
        try{
            Paciente paciente = pacienteService.pesquisarPacientePeloCPF(cpf);
            return paciente;
        }catch(RuntimeException erro){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,erro.getMessage());
        }
    }

}
