package com.LojaVirtual.demo.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name= "marca_produto")
@SequenceGenerator(name = "seq_marca_produto", sequenceName = "seq_marca_produto", allocationSize = 1, initialValue = 1)
public final class MarcaProduto implements Serializable {

    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
    private Long id;

    @Column(nullable = false)
    private String NomeDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDesc() {
        return NomeDesc;
    }

    public void setNomeDesc(String nomeDesc) {
        NomeDesc = nomeDesc;
    }
}
