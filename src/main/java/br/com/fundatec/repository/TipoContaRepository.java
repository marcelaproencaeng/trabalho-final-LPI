package br.com.fundatec.repository;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.model.Conta;
import br.com.fundatec.model.Tipo;
import br.com.fundatec.model.TipoConta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoContaRepository extends JpaRepository<TipoConta,Integer> {

}
