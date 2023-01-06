package br.com.fundatec.controller;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.model.Tipo;
import br.com.fundatec.model.TipoConta;
import br.com.fundatec.service.AgenciaService;
import br.com.fundatec.service.TipoContaService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/TipoConta")
public class TipoContaController {
    private final TipoContaService tipoContaService;

    public TipoContaController(TipoContaService tipoContaService) {
        this.tipoContaService = tipoContaService;
    }
    @PostMapping
    public TipoConta salvar(@RequestBody TipoConta tipoConta) {
        return tipoContaService.salvar(tipoConta);
    }

    @PutMapping
    public TipoConta atualizar(@RequestBody TipoConta tipoConta) {
        return tipoContaService.atualizar(tipoConta);
    }

    @GetMapping("/{id}")
    public TipoConta findAccountTypeById(@PathVariable Integer id) {
        Optional<TipoConta> optionalAccountType = tipoContaService.findById(id);
        if (optionalAccountType.isPresent())
            return optionalAccountType.get();

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
    public Iterable<TipoConta> findAll() {
        return tipoContaService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        tipoContaService.delete(id);
    }



}




