package br.com.fundatec.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="tb_banco")
public class Banco {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
    @Column
    private int codigo;
   @OneToMany(mappedBy = "nome")
    private String nome;
    @Column
    private String cnpj;
    public Banco(){

    }

    public Banco(Integer id, int codigo, String nome, String cnpj) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Banco banco)) return false;
        return id.equals(banco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
