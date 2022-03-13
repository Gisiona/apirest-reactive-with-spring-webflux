package com.br.springreactivewebflux.adapter.configuration;

import com.br.springreactivewebflux.ApiRestSpringReactiveWebfluxApplication;
import com.br.springreactivewebflux.application.core.service.produto.ProdutoServiceImpl;
import com.br.springreactivewebflux.application.ports.out.ProdutoServiceRepositoryOutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = ApiRestSpringReactiveWebfluxApplication.class)
public class BeanConfig {
    @Bean
    ProdutoServiceImpl produtoServiceImpl(ProdutoServiceRepositoryOutPort produtoServiceRepositoryOutPort) {
        return new ProdutoServiceImpl(produtoServiceRepositoryOutPort);
    }
}
