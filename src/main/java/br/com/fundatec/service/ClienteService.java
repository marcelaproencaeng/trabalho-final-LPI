package br.com.fundatec.service;

import br.com.fundatec.model.Banco;
import br.com.fundatec.model.Cliente;
import br.com.fundatec.model.Conta;
import br.com.fundatec.repository.ClienteRepository;
import br.com.fundatec.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class ClienteService {
    private ClienteRepository repository;
    public ClienteService(ClienteRepository repository){
        this.repository = repository;}
    public  void delete (Integer id) {

        repository.deleteById(id);
    }
    public Cliente salvar (Cliente client) {
        return repository.save(client);}

    public Cliente atualizar(Cliente client) {
            return repository.save(client);
        }
        public Optional<Cliente> findById(Integer id) {

        return repository.findById(id);
        }

        public Iterable<Cliente> findAll() {

        return repository.findAll();
        }
}




