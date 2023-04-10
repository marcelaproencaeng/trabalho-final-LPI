package br.com.fundatec.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Classe AgenciaService.
 *
 * @author Felipe
 * @author João
 * @author Marcela
 * @version 0.05
 * @see Conta
 * @since 10/01/2023
 */
@Entity
@Table(name = "tb_cliente")
public class Cliente {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String cpf;
    @Column
    private String nome;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "conta_id", referencedColumnName = "id")
    private Conta conta;

    /**
     * Construtor default da classe Cliente
     *
     */

    public Cliente() {

    }
    /**
     * Construtor da classe Cliente
     *
     * @param id Integer
     * @param cpf String
     * @param nome String
     * @param conta Conta
     */
    public Cliente(Integer id, String cpf, String nome, Conta conta) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.conta = conta;
    }

    /**
     * Método getId
     * @return retorna o id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Método setId
     * @param id Integer
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Método getCpf
     * @return retorna o cpf
     */
    public String getCpf() {
        return cpf;
    }
    /**
     * Método setCpf
     * @param cpf String
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /**
     * Método getNome
     * @return retorna o nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * Método setNome
     * @param nome String
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


    /**
     * Método getConta
     * @see Conta
     * @return retorna a conta
     */
    public Conta getConta() {
        return conta;
    }
    /**
     * Método setConta
     * @see Conta
     * @param conta Conta
     */
    public void setConta(Conta conta) {
        this.conta = conta;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

