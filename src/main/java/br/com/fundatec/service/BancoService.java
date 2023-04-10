package br.com.fundatec.service;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.model.Banco;
import br.com.fundatec.repository.AgenciaRepository;
import br.com.fundatec.repository.BancoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Classe BancoService.
 *
 * @author Felipe
 * @author João
 * @author Marcela
 * @version 0.05
 * @see BancoRepository
 * @since 10/01/2023
 */
@Service
public class BancoService {
    private final BancoRepository repository;

    /**
     * Código BancoService
     *
     * @param repository BancoRepository
     */
    public BancoService(BancoRepository repository) {
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
     * Código salvar banco
     *
     * @param banco Banco
     * @return Retorna objeto banco salvo
     */
    public Banco salvar(Banco banco) {
        return repository.save(banco);
    }

    /**
     * Código atualizar banco
     *
     * @param banco Banco
     * @return Retorna objeto banco salvo
     */
    public Banco atualizar(Banco banco) {
        return repository.save(banco);
    }

    /**
     * Código encontrar Banco pelo id
     *
     * @param id Integer
     * @return Retorna o id da classe Banco
     */
    public Optional<Banco> findById(Integer id) {
        return repository.findById(id);
    }

    /**
     * Código encontrar todos os Bancos
     *
     * @return Retorna todos os bancos
     */
    public Iterable<Banco> findAll() {
        return repository.findAll();
    }

    /**
     * Código encontrar pelo nome
     *
     * @param nome String
     * @return Retorna os Bancos pelo número
     */
    public Optional<Banco> findByLike(String nome) {
        return repository.findBancoByNomeContains(nome);
    }

}



