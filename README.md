# 💈 Sistema de Agendamentos para Barbearia

Sistema web/backend desenvolvido em Java com Spring Boot para digitalização de serviços de uma barbearia. Permite o gerenciamento de agendamentos, serviços oferecidos e cadastro de clientes. Ideal para microempreendedores que desejam modernizar seu negócio com uma solução simples e funcional.

---

## 🚀 Funcionalidades

- ✅ Cadastro e listagem de serviços (ex: corte, barba, etc.)
- ✅ Cadastro de clientes
- ✅ Agendamento de horários
- ✅ Visualização de agendamentos futuros
- ✅ Associação de serviços e barbeiros
- 🔒 Segurança e autenticação (em desenvolvimento)
- 📱 Integração futura com aplicativo React Native

---

## 🛠️ Tecnologias utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
- **Maven**

---

## 🗃️ Modelagem de Dados

Entidades principais:

- `User`: Representa o barbeiro ou administrador
- `Client`: Representa o cliente final
- `Service`: Serviços disponíveis (ex: corte de cabelo)
- `Appointment`: Agendamento de horário
- `Barbershop`: Informações da barbearia

---

## ⚙️ Configuração do projeto

### Pré-requisitos

- Java 17+
- PostgreSQL
- Maven

### Banco de Dados

Crie um banco de dados PostgreSQL:

```sql
CREATE DATABASE agendamentos;
application.properties
Edite o arquivo src/main/resources/application.properties com suas configurações:

properties
Copy
Edit
spring.datasource.url=jdbc:postgresql://localhost:5432/agendamentos
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
▶️ Rodando o projeto localmente
bash
Copy
Edit
# Clone o repositório
git clone https://github.com/seu-usuario/seu-repo.git

# Acesse o diretório
cd agendamentos

# Compile e execute
./mvnw spring-boot:run
A aplicação estará disponível em:
📍 http://localhost:8080

📦 Estrutura inicial
bash
Copy
Edit
src
└── main
    ├── java
    │   └── com.barbearia.agendamentos
    │       └── AgendamentosApplication.java
    └── resources
        ├── application.properties
        └── static/
🧩 Melhorias futuras
Autenticação com Spring Security e JWT

Dashboard para administrador/barbeiro

Notificações via WhatsApp

Pagamentos online via PIX

Upload de imagem do cliente/barbearia

App mobile com React Native

🤝 Contribuição
Pull requests são bem-vindos! Para mudanças maiores, abra uma issue primeiro para discutir o que você gostaria de mudar.


📬 Contato
Feito por [Vagner Ventura] – [vagnerventura@hotmail.com]
GitHub: github.com/VagnerVentura