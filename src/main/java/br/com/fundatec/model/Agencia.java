package br.com.fundatec.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

import org.hibernate.annotations.Parent;
/**
 * Classe AgenciaService.
 *
 * @author Felipe
 * @author João
 * @author Marcela
 * @see Banco
 * @see Conta
 * @version 0.05
 * @since 10/01/2023
 */
@Entity
@Table(name = "tb_agencia")
public class Agencia {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column
    private String nome;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "banco_id", referencedColumnName = "id")
    private Banco banco;

    @Column
    private Integer numero;
    /**
     * Construtor default da classe Agencia
     *
     */
    public Agencia() {

    }
    /**
     * Construtor da classe Agencia
     *
     * @param id Integer
     * @param nome String
     * @param numero int
     */
    public Agencia(Integer id, String nome, int numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
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
     * Método getNumero
     * @return retorna o numero
     */
    public int getNumero() {
        return numero;
    }
    /**
     * Método setNumero
     * @param numero Integer
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
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
     * Método getBanco
     * @see Banco
     * @return retorna o banco
     */
    public Banco getBanco() {
        return banco;
    }
    /**
     * Método setBanco
     * @see Banco
     * @param banco Banco
     */
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agencia agencia = (Agencia) o;
        return id == agencia.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}

