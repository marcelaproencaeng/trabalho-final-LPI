package br.com.fundatec.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="tb_conta")
public class TipoConta {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column
private int numero;
@Column
private double saldo;

@Column
@Enumerated
private Tipo tipo;

    public TipoConta() {

    }

    public TipoConta(int id, int numero, double saldo, Tipo tipo) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoConta tipoConta)) return false;
        return id == tipoConta.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
