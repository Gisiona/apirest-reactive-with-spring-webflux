package com.br.springreactivewebflux.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@Data
public class ProdutoResquestDto {
    private UUID codigo;
    private String nome;
    private String descricao;
    private BigDecimal valor;
    private int quantidade;
}
