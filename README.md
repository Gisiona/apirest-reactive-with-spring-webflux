# apirest-reactive-with-spring-webflux
Exemplo de api rest reativa utilizando spring boot webflux e banco de dados NOSQL MongoDB.

### Utilização da aplicação:

A aplicação deve receber como entrada as seguintes informações:

### POST: - Criar Novo Produto
Endpoint: http://localhost:8080/api/v1/produtos

##### Dados de entrada
```json
{
  "codigo": "b2a05b3f-7225-4b45-9931-0dd8fee9c2a5",
  "nome": "Guarana Zero",
  "descricao": "Guarana Zero de Açucar",
  "valor": 255.60,
  "quantidade": 10
}
```

A aplicação deve responder com o seguinte modelo de informações:

##### Dados de saída
```json
{
  "codigo": "8d765855-fea8-430a-9a2d-d0d9c1ff69f2",
  "nome": "Guarana Zero",
  "descricao": "Guarana Zero de Açucar",
  "valor": 255.60,
  "quantidade": 10
}
```
### GET: - Consultar Produto Por ID
Endpoint: http://localhost:8080/api/v1/produtos/7ae4b252-7537-4dc0-b88a-30e20692fef2
##### Dados de saída
```json
{
  "codigo": "7ae4b252-7537-4dc0-b88a-30e20692fef2",
  "nome": "Guarana Zero",
  "descricao": "Guarana Zero de Açucar",
  "valor": 255.60,
  "quantidade": 10
}
```

### GET: - Consultar Todos Produtos
Endpoint: http://localhost:8080/api/v1/produtos
##### Dados de saída
```json
[
  {
    "codigo": "a832bc1e-243c-4ef7-be35-53a6be3cba8c",
    "nome": "Guarana Zero",
    "descricao": "Guarana Zero",
    "valor": 255.60,
    "quantidade": 5
  },
  {
    "codigo": "5d6d4421-3ca6-4051-8285-8ac84806a411",
    "nome": "Coca Cola Zero",
    "descricao": "Coca Cola Zero",
    "valor": 258.20,
    "quantidade": 10
  }
]
```

### DELETE: - Excluir Produto Por ID
Endpoint: http://localhost:8080/api/v1/produtos/feef1a37-6648-4216-8bf7-171e6a821165
##### Dados de saída
```json
NO CONTENT
```

# Setup da apliacação
Instale as dependências
- Apache Maven 3.8.4 (https://maven.apache.org/download.cgi)
- Java jdk 1.8.0 (https://www.oracle.com/br/java/technologies/javase/javase8u211-later-archive-downloads.html)
- IDE de sua preferência (estou utilizando IntelliJ IDEA(https://www.jetbrains.com/pt-br/idea/))

# Rode os testes
Você pode executar os testes com o comando a seguir pelo CLI:

```bash
$ mvn test
```
# Libs utiizadas no projeto
- lombok
- spring-cloud-sleuth
- spring-boot-data-mongodb-reactive
- spring-boot-webflux
- spring-boot-cloud