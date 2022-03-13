package com.br.springreactivewebflux.adapter.outbound.database.repository;


import com.br.springreactivewebflux.adapter.outbound.database.entity.ProdutoDocumento;
import com.br.springreactivewebflux.application.ports.out.ProdutoServiceRepositoryOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service @RequiredArgsConstructor
public class ProdutoMongoDbRepositoryAdapter implements ProdutoServiceRepositoryOutPort {

    private final ProdutoRepository produtoRepository;

    @Override
    public Flux<ProdutoDocumento> consultarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Mono<ProdutoDocumento> consultarPorId(UUID uuid) {
        return produtoRepository.findById(uuid);
    }

    @Override
    public Mono<ProdutoDocumento> salvarProdutoDocumento(ProdutoDocumento produtoDocumento) {
        return produtoRepository.save(produtoDocumento);
    }

    @Override
    public Mono<Void> deleteProdutoPorId(UUID uuid) {
        return produtoRepository.deleteById(uuid);
    }

    @Override
    public Mono<ProdutoDocumento> atualizarProdutoDocumento(ProdutoDocumento produtoDocumento) {
        return produtoRepository.save(produtoDocumento);
    }
}
