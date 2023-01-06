package br.com.fundatec.repository;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.model.Banco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BancoRepository extends CrudRepository<Banco, Integer> {
    Optional<Banco> findBancoByNome(String nome);


    Optional<Banco> findBancoByNomeContains(String nome);
}
