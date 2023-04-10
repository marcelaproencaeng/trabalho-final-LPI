package br.com.fundatec.repository;

import br.com.fundatec.model.Agencia;
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
public interface ContaRepository extends JpaRepository<Conta, Integer> {

}
