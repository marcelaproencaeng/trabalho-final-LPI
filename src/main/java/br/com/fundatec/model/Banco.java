package br.com.fundatec.model;

import javax.persistence.*;
import java.util.Objects;
/**
 * Classe AgenciaService.
 *
 * @author Felipe
 * @author João
 * @author Marcela
 * @see Agencia
 * @version 0.05
 * @since 10/01/2023
 */
@Entity
@Table(name = "tb_banco")
public class Banco {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer codigo;
    @Column
    private String nome;
    @Column
    private String cnpj;
    /**
     * Construtor default da classe Banco
     *
     */
    public Banco() {

    }
    /**
     * Construtor da classe Banco
     *
     * @param id Integer
     * @param codigo int
     * @param nome String
     * @param cnpj String
     */
    public Banco(Integer id, int codigo, String nome, String cnpj) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    /**
     * Método getId
     * @return retorna o id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Método setID
     * @param id Integer
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Método getCodigo
     * @return retorna o codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método setCodigo
     * @param codigo int
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
     * Método getCnpj
     * @return retorna o cnpj
     */
    public String getCnpj() {
        return cnpj;
    }
    /**
     * Método setCnpj
     * @param cnpj String
     */
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
