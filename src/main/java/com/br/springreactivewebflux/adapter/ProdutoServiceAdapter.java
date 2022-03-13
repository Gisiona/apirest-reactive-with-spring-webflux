package com.br.springreactivewebflux.adapter;


import com.br.springreactivewebflux.entity.ProdutoDocumento;
import com.br.springreactivewebflux.repository.ProdutoRepository;
import com.br.springreactivewebflux.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service @RequiredArgsConstructor
public class ProdutoServiceAdapter implements ProdutoService {

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
    public Mono<ProdutoDocumento> atualizarrodutoDocumento(ProdutoDocumento produtoDocumento) {
        return produtoRepository.save(produtoDocumento);
    }
}
