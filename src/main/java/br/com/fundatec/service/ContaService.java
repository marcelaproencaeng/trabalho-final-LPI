package br.com.fundatec.service;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.model.Conta;
import br.com.fundatec.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Classe ContaService.
 *
 * @author Felipe
 * @author João
 * @author Marcela
 * @version 11.02
 * @see ContaRepository
 * @since 10/01/2023
 */

@Service
public class ContaService {
    private static ContaRepository repository;

    /**
     * Código ContaService
     *
     * @param repository ContaRepository
     */
    public ContaService(ContaRepository repository) {
        this.repository = repository;
    }

    /**
     * Código Deletar id
     *
     * @param id Integer
     */

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    /**
     * Código salvar account
     *
     * @param account Conta
     * @return Retorna objeto account salvo
     */
    public Conta salvar(Conta account) {
        return repository.save(account);
    }

    /**
     * Código atualizar account
     *
     * @param account Conta
     * @return Retorna objeto account salvo
     */
    public Conta atualizar(Conta account) {
        return repository.save(account);
    }

    /**
     * Código encontrar todas as Contas
     *
     * @return Retorna todas as Contas
     */
    public Iterable<Conta> findAll() {
        return repository.findAll();
    }

    /**
     * Código encontrar Conta pelo id
     *
     * @param id Integer
     * @return Retorna a Conta pelo id
     */
    public Optional<Conta> findById(Integer id) {

        return repository.findById(id);
    }
}

