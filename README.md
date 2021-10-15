# Lojinha API Automação
Esse é meu repositório que contém a automação de alguns teste de API Rest de um software denominado Lojinha. Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias Utilizadas



- Java - https://www.oracle.com/java/technologies/downloads/

- JUnit -  https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine/5.8.0-M1
- RestAssure  - https://mvnrepository.com/artifact/io.rest-assured/rest-assured/4.4.0
- Maven - https://maven.apache.org/

## Testes Automatizados
Testes para validar as partições de equivalência relacionadas ao valor do produto na lojinha, que estão vinculados diretamente a regra de negócio que diz que o valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.

## Notas Gerais

- Sempre utilizamos a anotação BeforeEach para capturar o token que    
  será utilizado posteriormente nos métodos de testes
- Armazenamos os dados que são enviados para API através do uso de classes POJO
- Criamos dados iniciais através do uso de classe Data Factory, para facilitar a criação e controle dos mesmos.
- Nesse projeto fazemos o uso do JUnit 5, o que n´s da a possibilidade de utilizar a anotação DisplayName para dar a descrição em português para nossos testes.
