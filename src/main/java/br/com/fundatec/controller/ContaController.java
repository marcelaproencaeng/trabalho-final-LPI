package br.com.fundatec.controller;


import br.com.fundatec.model.Banco;
import br.com.fundatec.model.Conta;
import br.com.fundatec.service.BancoService;
import br.com.fundatec.service.ClienteService;
import br.com.fundatec.service.ContaService;
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
 * @see ContaService
 * @version 11.02
 * @since 10/01/2023
 */
@RestController
@RequestMapping("/Conta")
public class ContaController {

    private final ContaService contaService;
    /**
     * Método ContaController
     * @see ContaService
     * @param contaService ContaService
     */
    public ContaController(ContaService contaservice, ContaService contaService) {
        this.contaService = contaService;
    }
    /**
     * Método Salvar
     * @see Conta
     * @return retorna a conta salva
     */
    @PostMapping
    public Conta salvar(@RequestBody Conta account) {
        return contaService.salvar(account);
    }


    @PutMapping
    public Conta atualizar(@RequestBody Conta conta) {
        return contaService.atualizar(conta);
    }
    /**
     * Método Get Conta
     * @see Conta
     * @return retorna conta por id
     */
    @GetMapping("/{id}")
    public Conta findAccountById(@PathVariable Integer id) {
        Optional<Conta> optionalAccount = contaService.findById(id);
        if (optionalAccount.isPresent())
            return optionalAccount.get();

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
     * @see Conta
     * @return retorna todas as contas
     */

    @GetMapping
    public Iterable<Conta> findAll() {
        return contaService.findAll();
    }

    /**
     * Método deleteById
     * @see Conta
     * @param id Integer
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        contaService.delete(id);
    }


}
