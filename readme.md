🚀 Desenvolvimento de API com Vagas

## 🚀 Tecnologias
- [Java](https://www.java.com/pt-BR/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Maven](https://maven.apache.org/)
- [MySQL](https://www.mysql.com/)
- [Lombok](https://projectlombok.org/)

## 🚀 Execução

- Clone o projeto
- Criar um banco de dados MySQL
- Alterar as configurações do banco de dados no arquivo `application.properties`
- Acesse a pasta do projeto
- Execute o comando `mvn clean install`
- Execute o comando `mvn spring-boot:run`


## 🚀 Endpoints

- ` POST /candidate/create ` - Cadastrar uma vaga

```json
{
  "username": "joao",
  "name": "leonardo geja ",
  "email": "joao@hotmail.com",
  "password": "1234",
  "description": "desenvolvedor java"
}
```

- ` POST /company/create ` - Cadastrar uma Empresa

```json
{
  "username": "Empresa",
  "name": "usuario Empresa",
  "email": "empresa@hotmail.com",
  "password": "1234",
  "description": "desenvolvedor java"
}
```

- ` POST /job/create ` - Cadastrar um Vaga

```json
{
  "description": "teste",
  "benefits": "Vale Alimentação",
  "levels": "Senior",
  "companyId": 1
}
```