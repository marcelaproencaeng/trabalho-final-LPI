package br.com.fundatec.controller;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.model.Banco;
import br.com.fundatec.model.Conta;
import br.com.fundatec.service.AgenciaService;
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
 * @see BancoService
 * @version 11.02
 * @since 10/01/2023
 */
@RestController
@RequestMapping("/Banco")
public class BancoController {
    private final BancoService bancoService;
    /**
     * Método BancoController
     * @see BancoService
     * @param bancoService BancoService
     */
    public BancoController(BancoService bancoService) {
        this.bancoService = bancoService;
    }
    /**
     * Método Banco
     * @see Banco
     * @param banco Banco
     * @return retorna banco salvo
     */
    @PostMapping
    public Banco salvar(@RequestBody Banco banco) {
        return bancoService.salvar(banco);
    }
    /**
     * Método findAll
     * @see Banco
     * @return retorna todos os bancos
     */
    @GetMapping
    public Iterable<Banco> findAll() {
        return bancoService.findAll();
    }
    /**
     * Método deleteById
     * @see BancoService
     * @param id Integer
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        bancoService.delete(id);
    }
    /**
     * Método atualizar
     * @see BancoService
     * @param banco Banco
     * @return retorna banco atualizado
     */
    @PutMapping
    public Banco atualizar(@RequestBody Banco banco) {
        return bancoService.atualizar(banco);
    }
    /**
     * Método Banco findBankById
     * @see Banco
     * @param id Integer
     * @return retorna banco pelo id
     */
    @GetMapping("/{id}")
    public Banco findBankById(@PathVariable Integer id) {
        Optional<Banco> optionalBank = bancoService.findById(id);
        if (optionalBank.isPresent())
            return optionalBank.get();

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
     * Método Banco findBankByLike
     * @see Banco
     * @param nome String
     * @return retorna nome do banco caso encontrado
     */
    @GetMapping("/")
    public Banco findByLike(@RequestParam("nome") String nome) {
        Optional<Banco> optionalBank = bancoService.findByLike(nome);
        if (optionalBank.isPresent())
            return optionalBank.get();

        return null;
    }

}


