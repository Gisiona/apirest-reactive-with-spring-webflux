package com.br.springreactivewebflux;

import com.br.springreactivewebflux.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {

    private final ProdutoRepository produtoRepository;

    public DummyData(ProdutoRepository reository) {
        this.produtoRepository = reository;
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        produtoRepository.deleteAll()
                .thenMany(Flux.just("Coca Cola", "Cerveja Bhrama", "Guarana Zero")
                        .map(nome -> new ProdutoDocumento(UUID.randomUUID(), nome,))
                .flatMap(produtoRepository::save))
                .subscribe(System.out::println);

         */
    }
}
