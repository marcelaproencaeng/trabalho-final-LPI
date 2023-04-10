package br.com.fundatec.controller;

import br.com.fundatec.model.Banco;
import br.com.fundatec.model.Cliente;
import br.com.fundatec.service.BancoService;
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
 * @see ClienteService
 * @version 11.02
 * @since 10/01/2023
 */
@RestController
@RequestMapping("/Cliente")
public class ClienteController {
    private final ClienteService clienteService;
    /**
     * Método ClienteController
     * @see ClienteService
     * @param clienteService BancoService
     */
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    /**
     * Método Salvar
     * @see Cliente
     * @param cliente Cliente
     * @return retorna cliente salvo
     */
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    /**
     * Método atualizar
     * @see Cliente
     * @param cliente Cliente
     * @return retorna cliente atualizado
     */
    @PutMapping
    public Cliente atualizar(@RequestBody Cliente cliente) {
        return clienteService.atualizar(cliente);
    }

    /**
     * Método Cliente findClientById
     * @see Cliente
     * @param id Integer
     * @return retorna cliente pelo id
     */
    @GetMapping("/{id}")
    public Cliente findClientById(@PathVariable Integer id) {
        Optional<Cliente> optionalClient = clienteService.findById(id);
        if (optionalClient.isPresent())
            return optionalClient.get();

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
     * Método Cliente findAll
     * @see Cliente
     * @return retorna todos os clientes
     */
    @GetMapping
    public Iterable<Cliente> findAll() {
        return clienteService.findAll();
    }
    /**
     * Método deleteById
     * @see Cliente
     * @param id Integer
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        clienteService.delete(id);
    }

    /**
     * Método Cliente findClientById
     * @see Cliente
     * @param cpf String
     * @return retorna cliente pelo cpf
     */
    @GetMapping("/")
    public Cliente findByCPF(@RequestParam("cpf") String cpf) {
        Optional<Cliente> optionalClient = clienteService.findByCPF(cpf);
        if (optionalClient.isPresent())
            return optionalClient.get();

        return null;
    }

}




