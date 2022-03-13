package com.br.springreactivewebflux.service;

import com.br.springreactivewebflux.entity.ProdutoDocumento;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface ProdutoService {
    Flux<ProdutoDocumento> consultarTodos();
    Mono<ProdutoDocumento> consultarPorId(UUID uuid);
    Mono<ProdutoDocumento> salvarProdutoDocumento(ProdutoDocumento produtoDocumento);
    Mono<Void> deleteProdutoPorId(UUID uuid);
    Mono<ProdutoDocumento> atualizarrodutoDocumento(ProdutoDocumento produtoDocumento);
}
