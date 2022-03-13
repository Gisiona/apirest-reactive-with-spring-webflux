package com.br.springreactivewebflux.repository;

import com.br.springreactivewebflux.entity.ProdutoDocumento;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoRepository extends ReactiveMongoRepository<ProdutoDocumento, UUID> {
}
