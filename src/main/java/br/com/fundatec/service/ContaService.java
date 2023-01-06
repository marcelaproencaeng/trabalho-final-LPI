package br.com.fundatec.service;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.model.Conta;
import br.com.fundatec.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ContaService {
    private static ContaRepository repository;
    public  ContaService(ContaRepository repository){this.repository = repository;}



    public  void delete (Integer id) {
        repository.deleteById(id);
    }
    public Conta salvar (Conta account) {
        return repository.save(account);
    }
    public Conta atualizar(Conta account) {
        return repository.save(account);
    }
    public Iterable<Conta> findAll() {
        return repository.findAll();
    }
    public Optional<Conta> findById(Integer id) {

        return repository.findById(id);
    }
}

