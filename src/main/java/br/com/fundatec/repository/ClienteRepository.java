package br.com.fundatec.repository;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {



}
