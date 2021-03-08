package br.com.zup.hospital.controllers;

import br.com.zup.hospital.models.Historico;
import br.com.zup.hospital.services.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("historicos/")
public class HistoricoController {

    @Autowired
    private HistoricoService historicoService;

    @PostMapping("{cpf}/")
    public Historico registrarHistorico(@RequestBody Historico historico, @PathVariable String cpf){
        try{
            Historico objetoHistorico = historicoService.registrarHistorico(cpf,historico);
            return objetoHistorico;
        } catch (RuntimeException erro){
           throw new ResponseStatusException(HttpStatus.BAD_REQUEST, erro.getMessage());
        }
    }
}
