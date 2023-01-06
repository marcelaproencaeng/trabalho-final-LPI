package br.com.fundatec.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="tb_conta")
public class Conta {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="numero_id",referencedColumnName ="id" )
    private Integer numero;
    @Column
    private Double saldo;
    @Column
    @Enumerated(EnumType.ORDINAL)
    private TipoConta tipoconta;
    public Conta(){

}
    public Conta(int id, Integer numero, Double saldo, TipoConta tipoconta) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoconta = tipoconta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(TipoConta tipoconta) {
        this.tipoconta = tipoconta;
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
