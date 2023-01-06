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
@RestController
@RequestMapping("/Banco")
public class BancoController {
    private final BancoService bancoService;

    public BancoController(BancoService bancoService) {
        this.bancoService = bancoService;
    }

    @PostMapping
    public Banco salvar(@RequestBody Banco banco) {
        return bancoService.salvar(banco);
    }

    @GetMapping
    public Iterable<Banco> findAll() {
        return bancoService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        bancoService.delete(id);
    }
    @PutMapping
    public Banco atualizar(@RequestBody Banco banco) {
        return bancoService.atualizar(banco);
    }
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

    @GetMapping("/")
        public Banco findByLike (@RequestParam("nome") String nome){
            Optional<Banco> optionalBank = bancoService.findByLike(nome);
            if (optionalBank.isPresent())
                return optionalBank.get();

            return null;
        }

    }


