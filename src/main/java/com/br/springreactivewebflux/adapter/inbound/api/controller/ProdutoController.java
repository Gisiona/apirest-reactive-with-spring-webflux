package com.br.springreactivewebflux.adapter.inbound.api.controller;

import com.br.springreactivewebflux.adapter.outbound.database.entity.ProdutoDocumento;
import com.br.springreactivewebflux.application.ports.in.ProdutoServiceInPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {

    private final ProdutoServiceInPort produtoServiceInPort;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ProdutoDocumento> salvarProduto(@RequestBody ProdutoDocumento produtoDocumento) {
        log.info("POST - Entrada - Criar Produto {}", produtoDocumento);
        Mono<ProdutoDocumento> response = produtoServiceInPort.salvarProdutoDocumento(produtoDocumento);
        log.info("POST - Saida - Criar Produto {}", response);
        return response;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<ProdutoDocumento> consultarPorId(@PathVariable("id") UUID id) {
        log.info("GET - Consultar Produto Por ID: {}", id);
        return produtoServiceInPort.consultarPorId(id);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Flux<ProdutoDocumento> consultarTodos() {
        log.info("GET - INI - Consultar Todos Produtos");
        Flux<ProdutoDocumento>  response = produtoServiceInPort.consultarTodos();
        log.info("GET - FIM - Consultar Todos Produtos. Total {}", response.count());
        return response;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteProdutoPorId(@PathVariable("id") UUID uuid) {
        log.info("DELETE - Excluir Produto Por ID: {}", uuid);
        return produtoServiceInPort.deleteProdutoPorId(uuid);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public Mono<ProdutoDocumento> atualizarProduto(@RequestBody ProdutoDocumento produtoDocumento) {
        log.info("PUT - Atualizar Produto Por ID: {}", produtoDocumento);
        return produtoServiceInPort.atualizarProdutoDocumento(produtoDocumento);
    }
}
