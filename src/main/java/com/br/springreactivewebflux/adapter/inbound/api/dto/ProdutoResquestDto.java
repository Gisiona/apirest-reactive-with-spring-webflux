package com.br.springreactivewebflux.adapter.inbound.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@Data
public class ProdutoResquestDto {
    private String nome;
    private String descricao;
    private BigDecimal valor;
    private int quantidade;
}
