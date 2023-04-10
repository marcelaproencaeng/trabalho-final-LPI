package br.com.fundatec.service;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.repository.AgenciaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Classe AgenciaService.
 *
 * @author Felipe
 * @author João
 * @author Marcela
 * @version 11.02
 * @see AgenciaRepository
 * @since 10/01/2023
 */
@Service
public class AgenciaService {
    private final AgenciaRepository repository;

    /**
     * Código AgenciaService
     *
     * @param repository AgenciaRepository
     */
    public AgenciaService(AgenciaRepository repository) {
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
     * Código salvar Agência
     *
     * @param agencia Agencia
     * @return Retorna objeto agencia salvo
     */
    public Agencia salvar(Agencia agencia) {
        return repository.save(agencia);
    }

    /**
     * Código atualizar Agência
     *
     * @param agencia Agencia
     * @return Retorna objeto agencia atualizado
     */
    public Agencia atualizar(Agencia agencia) {
        return repository.save(agencia);
    }

    /**
     * Código encontrar Agência pelo id
     *
     * @param id Integer
     * @return Retorna o id da classe Agencia
     */
    public Optional<Agencia> findById(Integer id) {
        return repository.findById(id);
    }

    /**
     * Código encontrar todas as Agências
     *
     * @return Retorna todas as Agencias
     */

    public Iterable<Agencia> findAll() {
        return repository.findAll();
    }

    /**
     * Código encontrar pelo id
     *
     * @param id Integer
     * @return Retorna as Agencias pelo id
     */
    public Optional<Agencia> findByLike(Integer id) {
        return repository.findAgenciaByIdContains(id);
    }

    /**
     * Código encontrar pelo numero
     *
     * @param numero Integer
     * @return Retorna as Agencias pelo número
     */
    public Optional<Agencia> findByNumero(Integer numero) {
        return repository.findByNumero(numero);
    }
}
