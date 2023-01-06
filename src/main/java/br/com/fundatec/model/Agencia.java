package br.com.fundatec.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;
import org.hibernate.annotations.Parent;

@Entity
@Table(name="tb_banco")
public class Agencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "nome_id", referencedColumnName = "id")
    @JsonIgnoreProperties("agencias")

    private String nome;



    @OneToMany(mappedBy ="numero")
    private int numero;

    public Agencia(){

}
    public Agencia(Integer id, String nome, int numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

