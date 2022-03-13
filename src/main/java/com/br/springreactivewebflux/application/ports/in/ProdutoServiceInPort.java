package com.br.springreactivewebflux.application.ports.in;

import com.br.springreactivewebflux.adapter.outbound.database.entity.ProdutoDocumento;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.UUID;

public interface ProdutoServiceInPort {
    Flux<ProdutoDocumento> consultarTodos();
    Mono<ProdutoDocumento> consultarPorId(UUID uuid);
    Mono<ProdutoDocumento> salvarProdutoDocumento(ProdutoDocumento produtoDocumento);
    Mono<Void> deleteProdutoPorId(UUID uuid);
    Mono<ProdutoDocumento> atualizarProdutoDocumento(ProdutoDocumento produtoDocumento);
}
