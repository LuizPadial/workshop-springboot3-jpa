
# Projeto web services com Spring Boot e JPA / Hibernate

Essa aplicação foi desenvolvida como parte do curso "Java Completo" do Professor Nélio Alves, onde foi criado um pequeno sistema de pagamentos do zero. No projeto proposto fooram criadas classes para lidar com pedidos, produtos e usuários, e utilizei um banco de dados em memória para armazenar os dados. Além disso, foi praticado diversos conceitos sobre Spring Boot e conceitos de Java orientado a objetos para tornar a aplicação mais robusta e eficiente.

### Objetivos 

### Criar projeto Spring Boot Java<br>
- Implementar modelo de domínio <br>
- Estruturar camadas lógicas: resource, service, repository <br>
- Configurar banco de dados de teste (H2) <br>
- Povoar o banco de dados <br>
- CRUD - Create, Retrieve, Update, Delete <br>
- Tratamento de exceções<br>

### Ferramentas

### Spring Initializr 
- Maven <br>
- Java 17 <br>
- Packing JAR <br>
- Dependencies: Spring Web <br>

### H2 database, test profile, JPA 

- JPA & H2 dependencies <br>
- application.properties <br>
- application-test.properties <br>
- Entity: JPA mapping <br>

![image](https://github.com/LuizPadial/workshop-springboot3-jpa/assets/134821865/d281b6e9-45f2-42b2-b7ef-e8c2717dc778)

![image](https://github.com/LuizPadial/workshop-springboot3-jpa/assets/134821865/bba96eef-addc-4af2-bc6f-2c3df0702146)



<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
  <groupId>com.h2database</groupId>
  <artifactId>h2</artifactId>
  <scope>runtime</scope>
</dependency>







