# 🚀 DIVE-IN Spring Boot

Projeto desenvolvido durante a série **DIVE-IN Spring Boot**, publicada no canal:

📺 **Tech Dev Brazil**  
🔗 https://www.youtube.com/channel/UCLuyixD5bOc7AAmJ9uoniVw

O objetivo não é apenas criar endpoints, mas entender profundamente como o Spring Boot funciona internamente.

---

## 📦 Projeto

Sistema de Pedidos simples com foco em:

- Arquitetura limpa
- Boas práticas REST
- Spring Data JPA
- Transações
- Segurança com JWT
- Auditoria
- Monitoramento
- Tratamento global de exceções

---

## 🧱 Arquitetura

O projeto segue uma abordagem de **fatias verticais**, onde cada funcionalidade é construída de forma completa:

Controller  
Service  
Repository  
DTO  
Entity  

Separação clara de responsabilidades.

---

## 🗄️ Modelo de Dados

Tabelas principais:

- usuario
- produto
- pedido
- pedido_item

Relacionamentos:

usuario 1 → N pedido  
pedido 1 → N pedido_item  
produto 1 → N pedido_item  

Status do pedido é implementado como ENUM no Java.

---

## 🔴 Estrutura das Lives

### Live 01
Fluxo completo da requisição  
Controller → Service → Repository → Banco  

### Live 02
Relacionamentos JPA e @Transactional  

### Live 03
Paginação, Queries e Spring Data  

### Live 04
DTOs, Validação e Arquitetura Limpa  

### Live 05
Segurança com Spring Security e JWT  

### Live 06
Auditoria e Logs  

### Live 07
Tratamento global de exceções e Monitoramento  

---

## 🔐 Segurança

Implementação com:

- Spring Security
- JWT
- Roles (USER / ADMIN)
- Proteção de endpoints
- Autorização por usuário

---

## 📊 Observabilidade

- Auditoria com Envers
- Logs estruturados
- Spring Boot Actuator

---

## 🧠 Conceitos Explorados

- DispatcherServlet
- Persistence Context
- Dirty Checking
- Lazy vs Eager
- Cascade
- @Transactional
- SecurityFilterChain
- Bean Validation
- @ControllerAdvice

---

## 🛠️ Tecnologias

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Security
- PostgreSQL
- Hibernate
- Lombok

---

## 🎯 Objetivo Educacional

Este projeto foi criado para:

- Demonstrar arquitetura real de backend
- Ensinar Spring Boot além do CRUD básico
- Servir como base para estudos e prática

---

## 📌 Como Executar

1. Clone o repositório
2. Configure o banco PostgreSQL
3. Ajuste `application.yml`
4. Execute a aplicação

---

## 👨‍💻 Autor

Arley Braz  
Backend Developer — Java & Spring Boot  

📺 Canal: Tech Dev Brazil  
🔗 https://www.youtube.com/channel/UCLuyixD5bOc7AAmJ9uoniVw
