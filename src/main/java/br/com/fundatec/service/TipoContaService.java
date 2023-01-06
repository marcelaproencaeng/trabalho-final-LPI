package br.com.fundatec.service;

import br.com.fundatec.model.Tipo;
import br.com.fundatec.model.TipoConta;
import br.com.fundatec.model.Banco;
import org.springframework.stereotype.Service;
import br.com.fundatec.repository.BancoRepository;
import br.com.fundatec.repository.TipoContaRepository;

import java.util.Optional;

@Service
public class TipoContaService {
    public TipoConta salvar(TipoConta tipoConta) {

            return repository.save(tipoConta);
        }


    public TipoConta atualizar(TipoConta tipoConta) {

            return repository.save(tipoConta);

    }

    public Optional<TipoConta> findById(Integer id) {

        return repository.findById(id);
        }


    public Iterable<TipoConta> findAll() {

            return repository.findAll();
        }


    public void delete(Integer id) {

        repository.deleteById(id);
        }

}

