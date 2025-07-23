+-------------------+
|      User         |
+-------------------+
| - id: UUID        |
| - name: String    |
| - email: String   |
| - password: String|
| - phone: String   |
| - role: Role      |
+-------------------+
         ▲
         |
         | 1
         |           * 
+-------------------+
|    Service        |
+-------------------+
| - id: UUID        |
| - name: String    |
| - description: String
| - durationMin: int|
| - price: double   |
| - active: boolean |
+-------------------+

+-------------------+
|     Client        |
+-------------------+
| - id: UUID        |
| - name: String    |
| - phone: String   |
| - email: String   |
+-------------------+

+----------------------------+
|       Appointment          |
+----------------------------+
| - id: UUID                 |
| - scheduledAt: LocalDateTime
| - status: Status           |
+----------------------------+
| * client: Client           |
| * user: User               |
| * service: Service         |
+----------------------------+

+----------------------------+
|       Barbershop           |
+----------------------------+
| - id: UUID                 |
| - name: String             |
| - address: String          |
| - description: String      |
| - imageUrl: String         |
| - phone: String            |
+----------------------------+
| 1 user: User               |
+----------------------------+ 

 📆 Como funciona o fluxo do sistema
🧑‍💻 Painel do Barbeiro (User logado):
O barbeiro entra no sistema

Cadastra seus serviços (corte, barba, etc)

Consulta sua agenda (lista de appointments)

Vê quem vai atendê-lo, quando e qual serviço

📱 Cliente (sem login por enquanto):
Acessa uma página da barbearia (futuramente via React ou QR code)

Informa nome, telefone e escolhe um serviço

Escolhe um horário livre

O sistema cria o agendamento (Appointment)

O barbeiro vê o novo horário na agenda

# ✅ 🔁 Fluxo de Funcionamento Desejado

1. 🧑‍💻 **Cliente acessa o sistema**

2. 🏢 **Escolhe uma barbearia**

3. 📋 **Visualiza os serviços disponíveis dessa barbearia**

4. ✂️ **Escolhe um serviço**

5. 🧔 **Vê a lista de barbeiros dessa barbearia que realizam esse serviço**

6. 🙋 **Escolhe um barbeiro**

7. 📅 **Agenda data e hora para aquele barbeiro executar aquele serviço**
