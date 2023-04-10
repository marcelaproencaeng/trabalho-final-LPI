package br.com.fundatec.service;

import br.com.fundatec.model.Cliente;
import br.com.fundatec.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
/**
 * Classe ClienteService.
 *
 * @author Felipe
 * @author João
 * @author Marcela
 * @see ClienteRepository
 * @version 11.02
 * @since 10/01/2023
 */
@Service
public class ClienteService {
    private ClienteRepository repository;
    /**
     * Código ClienteService
     * @param repository ClienteRepository
     */
    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }
    /**
     * Código Deletar id
     * @param id Integer
     */
    public void delete(Integer id) {

        repository.deleteById(id);
    }
    /**
     * Código salvar client
     * @param client Cliente
     * @return Retorna objeto client salvo
     */
    public Cliente salvar(Cliente client) {
        return repository.save(client);
    }
    /**
     * Código atualizar client
     * @param client Cliente
     * @return Retorna objeto client salvo
     */
    public Cliente atualizar(Cliente client) {

        return repository.save(client);
    }
    /**
     * Código encontrar Cliente pelo id
     * @param id Integer
     * @return Retorna o id da classe Cliente
     */
    public Optional<Cliente> findById(Integer id) {

        return repository.findById(id);
    }
    /**
     * Código encontrar todos os Clientes por cpf
     * @param cpf String
     * @return Retorna todos os Clientes por cpf
     */
    public Optional<Cliente> findByCPF(String cpf) {
        return repository.findClienteByCpf(cpf);
    }
    /**
     * Código encontrar todos os clientes
     * @return Retorna todos os Clientes
     */
    public Iterable<Cliente> findAll() {

        return repository.findAll();
    }
}




