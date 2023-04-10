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
 * @see Agencia
 * @see Cliente
 * @since 10/01/2023
 */
@Entity
@Table(name = "tb_conta")
public class Conta {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "agencia_id", referencedColumnName = "id")
    private Agencia agencia;

    @Column
    private Integer numero;
    @Column
    private Double saldo;
    @Column
    @Enumerated(EnumType.ORDINAL)
    private Tipo tipoconta;

    /**
     * Construtor default da classe Conta
     *
     */
    public Conta() {

    }

    /**
     * Construtor da classe Banco
     *
     * @param id Integer
     * @param agencia Agencia
     * @param numero Integer
     * @param saldo Double
     * @param tipoconta Tipo
     */
    public Conta(int id, Agencia agencia, Integer numero, Double saldo, Tipo tipoconta) {
        this.id = id;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoconta = tipoconta;
    }

    /**
     * Método getId
     * @return retorna o id
     */
    public int getId() {
        return id;
    }

    /**
     * Método setID
     * @param id int
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Método getNumero
     * @return retorna o numero
     */
    public Integer getNumero() {
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
     * Método getSaldo
     * @return retorna o saldo
     */
    public Double getSaldo() {
        return saldo;
    }
    /**
     * Método setSaldo
     * @param saldo Double
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método getAgencia
     * @see Agencia
     * @return retorna a agência
     */
    public Agencia getAgencia() {
        return agencia;
    }
    /**
     * Método setID
     * @see Agencia
     * @param agencia Agencia
     */
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    /**
     * Método setID
     * @see Tipo
     * @param tipoconta Tipo
     */
    public void setTipoconta(Tipo tipoconta) {
        this.tipoconta = tipoconta;
    }
    /**
     * Método getTipoconta
     * @see Tipo
     * @return retorna o tipo da conta
     */
    public Tipo getTipoconta() {
        return tipoconta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return id == conta.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
