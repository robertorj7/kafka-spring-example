# Exemplo Kafka com Spring

Este repositório fornece um exemplo de integração do Apache Kafka com uma aplicação Spring Boot. 
Ele demonstra o comportamento de um produtor e consumidor de mensagens em uma implementação simples e direta.

## Pré-requisitos

- **Java 17 ou superior**: O projeto foi desenvolvido utilizando Java.
- **Apache Kafka**: Certifique-se de que um broker Kafka está em execução.

## Como Executar o Projeto

Para executar o projeto, siga os passos abaixo:

### 1. Clone o Repositório

```bash
git clone https://github.com/robertorj7/kafka-spring-example.git
cd kafka-spring-example
```

### 2. Construa o Projeto

Utilize o Maven para construir o projeto:

```bash
./mvnw clean package
```

### 3. Inicie um Broker Kafka

Caso você não tenha uma instância do Kafka em execução, você pode usar o Docker para iniciar um broker:

```bash
docker-compose up -d
```

Ou instale e inicie o Kafka localmente. Certifique-se de que a propriedade `advertised.listeners` esteja corretamente configurada se estiver utilizando o Docker.

### 4. Configure o `application.yml`

Configure o arquivo `application.yml` do Spring Boot para refletir os detalhes do servidor Kafka.

- O arquivo padrão está localizado em `src/main/resources/application.yml`.

### 5. Execute a Aplicação

Para iniciar a aplicação Spring Boot, execute:

```bash
./mvnw spring-boot:run
```

Ou utilize o arquivo `.jar` gerado:

```bash
java -jar target/kafka-spring-example-0.0.1-SNAPSHOT.jar
```

### 6. Teste o Produtor e o Consumidor Kafka

- **Produtor**: Envie mensagens para o tópico configurado (por exemplo, utilizando um endpoint REST exposto pela aplicação ou a CLI do Kafka).
- **Consumidor**: Verifique os logs da aplicação ou implemente um cliente para consumir as mensagens do tópico.

## Estrutura do Projeto

- **Produtor**: Responsável por enviar mensagens para um tópico Kafka.
- **Consumidor**: Consome mensagens de um tópico Kafka.
- **Configuração**: Gerencia as configurações do Kafka, como `bootstrap-servers`, `topics`, etc.
