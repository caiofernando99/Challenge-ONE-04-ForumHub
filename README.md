# ForumHub - Challenge Back End (Oracle Next Education & Alura)

Este projeto é o desafio "FórumHub" da trilha de Back-End do programa Oracle Next Education, realizado em parceria com a Alura. O objetivo é construir uma API REST com Spring Boot para replicar o funcionamento de um fórum online, focando na gestão de tópicos.

## Sobre o Desafio

Um fórum é um espaço crucial para interação e troca de conhecimento. Na Alura, os alunos utilizam o fórum para tirar dúvidas sobre os cursos e projetos. Este desafio, FórumHub, busca implementar o *back-end* desse processo, criando uma API REST com Spring para gerenciar tópicos.

O foco principal é implementar as operações de CRUD (Create, Read, Update, Delete) para tópicos, permitindo aos usuários:

*   **Criar** um novo tópico.
*   **Mostrar** todos os tópicos criados.
*   **Mostrar** um tópico específico.
*   **Atualizar** um tópico.
*   **Eliminar** um tópico.

Este desafio expande os conceitos abordados no projeto LiterAlura, adicionando as operações de UPDATE e DELETE e utilizando o framework Spring Boot para facilitar o desenvolvimento.

## Funcionalidades Implementadas

*   **Cadastro de Cursos:** Permite a criação de novos cursos com nome e categoria.
*   **Cadastro de Tópicos:** Permite a criação de tópicos de discussão associados a um curso, contendo título, mensagem e autor.
*   **Listagem de Tópicos:** Permite a visualização dos tópicos cadastrados.

## Funcionalidades Pendentes (Conforme Trello)

*   **Detalhamento de Tópicos:** Visualização de um tópico específico.
*   **Atualização de Tópicos.**
*   **Exclusão de Tópicos.**
*   **Testes dos endpoints da API.**
*   **Autenticação com Spring Security.**

## Tecnologias Utilizadas

*   **Spring Boot:** Framework Java para desenvolvimento rápido de aplicações web.
*   **Java:** Linguagem de programação.
*   **JPA/Hibernate:** Framework de persistência de dados.
*   **MySQL:** Banco de dados relacional.
*   **Maven/Gradle:** Gerenciador de dependências (especifique qual você está usando).
*   **Insomnia/Postman:** Cliente para testar as APIs.
*   **Spring Security:** Para a implementação da autenticação (pendente).

## Pré-requisitos

*   **JDK (Java Development Kit):** Versão 17 ou superior.
*   **Maven/Gradle:** Instalado e configurado.
*   **MySQL:** Instalado e um banco de dados `forumhub` criado.
*   **IDE (Integrated Development Environment):** IntelliJ IDEA, Eclipse ou outro IDE de sua preferência.

## Configuração do Banco de Dados

1.  Instale o MySQL Server.
2.  Crie um banco de dados chamado `forumhub`:

    ```sql
    CREATE DATABASE forumhub CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
    ```

3.  Configure as credenciais de acesso no arquivo `src/main/resources/application.properties` (ou `application.yml`):

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/forumhub?useSSL=false&serverTimezone=UTC
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect # Ou o dialeto correto
    spring.jpa.hibernate.ddl-auto=update # 'create-drop' para desenvolvimento local (CUIDADO em produção!)
    ```

    **Substitua `seu_usuario` e `sua_senha` pelas suas credenciais.**

## Como Executar o Projeto

1.  Clone o repositório.
2.  Navegue até o diretório do projeto.
3.  Execute o projeto usando Maven (`mvn spring-boot:run`) ou Gradle (`gradle bootRun`).
4.  A aplicação estará disponível em `http://localhost:8080`.

## Endpoints da API

*   `POST /cursos`: Cadastra um novo curso.
*   `POST /topicos`: Cadastra um novo tópico.
*   `GET /topicos`: Lista os tópicos cadastrados.
