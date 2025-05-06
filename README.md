# Spring Boot com Liquibase

## Sobre o Projeto
Este projeto é uma demonstração de como integrar o Liquibase com Spring Boot para gerenciamento de migrações de banco de dados. O projeto implementa um sistema simples de gerenciamento de estudantes e professores, utilizando Spring Boot, JPA, MySQL e Liquibase.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.4.4**
- **Spring Data JPA**: Para persistência de dados
- **MySQL**: Como banco de dados relacional
- **Liquibase**: Para controle de versão e migração de banco de dados
- **Lombok**: Para redução de código boilerplate
- **Maven**: Para gerenciamento de dependências e build

## Estrutura do Projeto
O projeto segue uma arquitetura em camadas típica de aplicações Spring Boot:

- **Model**: Entidades JPA que representam as tabelas do banco de dados
  - `Student`: Representa um estudante com informações como nome, sobrenome, email, etc.
  - `Teacher`: Representa um professor com informações como nome, email, disciplina, etc.

- **Repository**: Interfaces que estendem JpaRepository para operações CRUD
  - `StudentRepository`: Para operações com a entidade Student
  - `TeacherRepository`: Para operações com a entidade Teacher

- **Service**: Camada de serviço que contém a lógica de negócio
  - `StudentService`: Serviço para operações relacionadas a estudantes

- **Resource**: Controladores REST que expõem endpoints da API
  - `StudentResource`: Expõe endpoints para operações com estudantes

## Configuração do Liquibase
O Liquibase é configurado para gerenciar as migrações de banco de dados através de arquivos de changelog:

- **db.changelog-master.yaml**: Arquivo principal que inclui outros changelogs
- **changelog-1.yaml**: Define a criação da tabela de estudantes e inserção de dados iniciais
- **V1__create_teacher_table.sql**: Script SQL para criação da tabela de professores

## Como Executar o Projeto

### Pré-requisitos
- JDK 17 ou superior
- Maven 3.6 ou superior
- MySQL 8.0 ou superior

### Configuração do Banco de Dados
1. Crie um banco de dados MySQL chamado `db_test`
2. Configure as credenciais de acesso no arquivo `application.yml`

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/db_test?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC
    username: seu_usuario
    password: sua_senha
```

### Executando a Aplicação
1. Clone o repositório
2. Navegue até a pasta do projeto
3. Execute o comando: `mvn spring-boot:run`

A aplicação estará disponível em `http://localhost:8080`

### Executando com Docker
O projeto inclui um arquivo `docker-compose-mysql.yaml` para facilitar a execução com Docker:

```bash
docker-compose -f docker-compose-mysql.yaml up -d
```

## Endpoints da API

### Estudantes
- **GET /api/students**: Retorna a lista de todos os estudantes

## Gerando Changelogs com Liquibase
O projeto está configurado com o plugin Maven do Liquibase para gerar changelogs a partir de diferenças entre o modelo JPA e o banco de dados:

```bash
mvn liquibase:diff
```

Este comando gera um arquivo de changelog com as diferenças detectadas, que pode ser encontrado em `src/main/resources/db/changelog/diff_[timestamp].yaml`.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

