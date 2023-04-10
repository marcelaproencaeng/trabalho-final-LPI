package br.com.fundatec.repository;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.model.Banco;
import br.com.fundatec.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Classe AgenciaService.
 *
 * @author Felipe
 * @author João
 * @author Marcela
 * @version 11.02
 * @see JpaRepository
 * @since 10/01/2023
 */
@Repository
public interface AgenciaRepository extends JpaRepository<Agencia, Integer> {
    /**
     * Código encontrar agencia por id
     *
     * @param id Integer
     * @return Retorna objeto agencia pelo id
     */
    Optional<Agencia> findAgenciaByIdContains(Integer id);

    /**
     * Código encontrar agencia por numero
     *
     * @param numero Integer
     * @return Retorna objeto agencia pelo numero
     */
    Optional<Agencia> findByNumero(Integer numero);
}
