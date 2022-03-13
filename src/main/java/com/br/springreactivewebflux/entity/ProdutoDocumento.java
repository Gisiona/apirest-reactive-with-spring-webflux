package com.br.springreactivewebflux.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.UUID;

@Getter @Setter @Document @Data
public class ProdutoDocumento {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID codigo;
    private String nome;

    private String descricao;
    private BigDecimal valor;
    private int quantidade;

    public ProdutoDocumento() {
        this.codigo = UUID.randomUUID();
    }
}
