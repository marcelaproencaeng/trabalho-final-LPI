package br.com.fundatec.service;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.model.Banco;
import br.com.fundatec.repository.AgenciaRepository;
import br.com.fundatec.repository.BancoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BancoService {
    private final BancoRepository repository;

    public BancoService(BancoRepository repository) {
        this.repository = repository;
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Banco salvar(Banco banco) {
        return repository.save(banco);
    }

    public Banco atualizar(Banco banco) {
        return repository.save(banco);
    }

    public Optional<Banco> findById(Integer id) {
        return repository.findById(id);
    }

    public Iterable<Banco> findAll() {
        return repository.findAll();
    }

    public Optional<Banco> findByLike(String nome) {
        return repository.findBancoByNomeContains(nome);
    }

}



