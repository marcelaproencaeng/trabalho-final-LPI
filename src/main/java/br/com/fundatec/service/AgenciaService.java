package br.com.fundatec.service;

import br.com.fundatec.model.Agencia;
import br.com.fundatec.repository.AgenciaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AgenciaService {
    private final AgenciaRepository repository;

    public AgenciaService(AgenciaRepository repository) {
        this.repository = repository;
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Agencia salvar(Agencia agencia) {
        return repository.save(agencia);
    }

    public Agencia atualizar(Agencia agencia) {
        return repository.save(agencia);
    }

    public Optional<Agencia> findById(Integer id) {
        return repository.findById(id);
    }

    public Iterable<Agencia> findAll() {
        return repository.findAll();
    }

}
