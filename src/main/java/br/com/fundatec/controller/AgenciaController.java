package br.com.fundatec.controller;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.model.Banco;
import br.com.fundatec.model.Conta;
import br.com.fundatec.service.AgenciaService;
import br.com.fundatec.service.ClienteService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Classe AgenciaService.
 *
 * @author Felipe
 * @author João
 * @author Marcela
 * @version 11.02
 * @see AgenciaService
 * @since 10/01/2023
 */
@RestController
@RequestMapping("/Agencia")
public class AgenciaController {
    private final AgenciaService agenciaService;

    /**
     * Método AgenciaController
     *
     * @param agenciaService AgenciaService
     * @see AgenciaService
     */
    public AgenciaController(AgenciaService agenciaService) {
        this.agenciaService = agenciaService;
    }

    /**
     * Método Agencia salvar
     *
     * @param agencia Agencia
     * @return retorna a agencia salva
     * @see Agencia
     */
    @PostMapping
    public Agencia salvar(@RequestBody Agencia agencia) {
        return agenciaService.salvar(agencia);
    }

    /**
     * Método Agencia atualizar
     * @see Agencia
     * @param agencia Agencia
     * @return retorna a agencia atualizada
     */
    @PutMapping
    public Agencia atualizar(@RequestBody Agencia agencia) {
        return agenciaService.atualizar(agencia);
    }
    /**
     * Método Agencia
     * @see Agencia
     * @param id Integer
     * @return retorna a agencia atualizada
     */
    @GetMapping("/{id}")
    public Agencia findAgencyById(@PathVariable Integer id) {
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
    /**
     * Método FindAll
     * @see Agencia
     * @return retorna todas as agencia
     */
    @GetMapping
    public Iterable<Agencia> findAll() {
        return agenciaService.findAll();
    }
    /**
     * Método deleteById
     * @see AgenciaService
     * @param id Integer
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        agenciaService.delete(id);
    }
    /**
     * Método findByLike
     * @see Agencia
     * @param id Integer
     * @return agencia caso encontrada
     */
    @GetMapping("/")
    public Agencia findByLike(@RequestParam("id") Integer id) {
        Optional<Agencia> optionalAgency = agenciaService.findByLike(id);
        if (optionalAgency.isPresent())
            return optionalAgency.get();

        return null;
    }

}


