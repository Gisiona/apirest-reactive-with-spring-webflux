package com.br.springreactivewebflux.application.core.service.produto;

import com.br.springreactivewebflux.adapter.outbound.database.entity.ProdutoDocumento;
import com.br.springreactivewebflux.application.ports.in.ProdutoServiceInPort;
import com.br.springreactivewebflux.application.ports.out.ProdutoServiceRepositoryOutPort;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public class ProdutoServiceImpl implements ProdutoServiceInPort {

    private ProdutoServiceRepositoryOutPort produtoServiceRepositoryOutPort;

    public ProdutoServiceImpl(ProdutoServiceRepositoryOutPort produtoServiceRepositoryOutPort) {
        this.produtoServiceRepositoryOutPort = produtoServiceRepositoryOutPort;
    }

    @Override
    public Flux<ProdutoDocumento> consultarTodos() {
        return produtoServiceRepositoryOutPort.consultarTodos();
    }

    @Override
    public Mono<ProdutoDocumento> consultarPorId(UUID uuid) {
        return produtoServiceRepositoryOutPort.consultarPorId(uuid);
    }

    @Override
    public Mono<ProdutoDocumento> salvarProdutoDocumento(ProdutoDocumento produtoDocumento) {
        return produtoServiceRepositoryOutPort.salvarProdutoDocumento(produtoDocumento);
    }

    @Override
    public Mono<Void> deleteProdutoPorId(UUID uuid) {
        return produtoServiceRepositoryOutPort.deleteProdutoPorId(uuid);
    }

    @Override
    public Mono<ProdutoDocumento> atualizarProdutoDocumento(ProdutoDocumento produtoDocumento) {
        return produtoServiceRepositoryOutPort.atualizarProdutoDocumento(produtoDocumento);
    }
}
