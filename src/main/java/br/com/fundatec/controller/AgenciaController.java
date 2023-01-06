package br.com.fundatec.controller;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.service.AgenciaService;
import br.com.fundatec.service.ClienteService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Agencia")
public class AgenciaController {
    private final AgenciaService agenciaService;

    public AgenciaController(AgenciaService agenciaService) {
        this.agenciaService = agenciaService;
    }
    @PostMapping
    public Agencia salvar(@RequestBody Agencia agencia) {
        return agenciaService.salvar(agencia);
    }

    @PutMapping
    public Agencia atualizar(@RequestBody Agencia agencia) {
        return agenciaService.atualizar(agencia);
    }

    @GetMapping("/{id}")
    public Agencia findCountryById(@PathVariable Integer id) {
        Optional<Agencia> optionalAgency = agenciaService.findById(id);
        if (optionalAgency.isPresent())
            return optionalAgency.get();

        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sucesso na busca"),
            @ApiResponse(responseCode = "403", description = "Erro de permissao"),
            @ApiResponse(responseCode = "500", description = "Erro de infraestrutura"),
    })
    @Parameters(
            value = {
                    @Parameter(name = "xxxxxxß")
            }
    )
    @GetMapping
    public Iterable<Agencia> findAll() {
        return agenciaService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        agenciaService.delete(id);
    }



}


