package br.com.fundatec.controller;


import br.com.fundatec.model.Conta;
import br.com.fundatec.service.ContaService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Conta")
public class ContaController {

	private final ContaService contaService;

	public ContaController ( ContaService contaservice, ContaService contaService) {
		this.contaService = contaService;
	}
	@PostMapping
	public Conta salvar (@RequestBody Conta account){
	return contaService.salvar(account);}



	@PutMapping
	public Conta atualizar(@RequestBody Conta conta) {
		return contaService.atualizar(conta);
	}

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
	@GetMapping
	public Iterable<Conta> findAll() {
		return contaService.findAll();
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id) {
		contaService.delete(id);
	}
	@GetMapping("/")
	public Conta findByLike(@RequestParam("nome") String nome) {
		Optional<Conta> optionalAccount = contaService.findByLike(nome);
		if (optionalAccount.isPresent())
			return optionalAccount.get();

		return null;
	}

}
