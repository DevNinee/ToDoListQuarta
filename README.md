# ToDoListQuarta

[Português (PT-BR)](#português-pt-br) | [English (EN)](#english-en)

---

## Português (PT-BR)

Sistema de gerenciamento de tarefas em Java com interface de linha de comando (CLI), desenvolvido para organizar atividades e praticar Programação Orientada a Objetos.

### Objetivo

O projeto resolve a necessidade de controle simples de tarefas (criar, acompanhar, concluir, editar e excluir) e serve como base prática de aprendizagem em Java.

### Problema que resolve

- Falta de organização de tarefas no dia a dia
- Dificuldade de acompanhar status de atividades
- Necessidade de um projeto acadêmico com aplicação real de POO

### Funcionalidades

- Criar tarefa
- Listar tarefas
- Editar tarefa
- Excluir tarefa
- Marcar tarefa como concluída
- Buscar tarefa por ID

### Diferenciais

- Estrutura organizada por camadas (`aplicacao`, `model`, `service`)
- Fluxo completo de CRUD
- Código simples para manutenção e evolução
- Scripts prontos para compilação e execução

### Tecnologias

- Java 8+
- POO
- LocalDateTime
- Shell Script (`build.sh`, `run.sh`)
- Git e GitHub

### Estrutura do projeto

```text
ToDoListQuarta/
├── bin/
├── src/
│   └── ucb/
│       ├── aplicacao/
│       ├── model/
│       └── service/
├── build.sh
├── run.sh
└── README.md
```

### Como executar

```bash
git clone https://github.com/DevNinee/ToDoListQuarta.git
cd ToDoListQuarta
./build.sh
./run.sh
```

Execução manual:

```bash
javac -d bin src/ucb/**/*.java
java -cp bin ucb.aplicacao.AppToDoList
```

### Exemplo de uso

```text
1. Criar Tarefa
2. Listar Tarefas
3. Marcar como Completa
4. Editar Tarefa
5. Excluir Tarefa
6. Buscar Tarefa por ID
7. Sair
```

### API (evolução futura)

Base pronta para API REST com endpoints como:

- GET /tarefas
- GET /tarefas/{id}
- POST /tarefas
- PUT /tarefas/{id}
- PATCH /tarefas/{id}/concluir
- DELETE /tarefas/{id}

### Melhorias futuras

- Persistência em banco de dados
- Testes automatizados (JUnit)
- Validações e tratamento de exceções
- Prioridade/categorias de tarefas
- Interface web ou mobile
- Autenticação de usuários

### Possíveis projetos derivados

- ToDoList Web
- App mobile de tarefas
- Kanban colaborativo
- Agenda acadêmica
- Gerenciador de metas pessoais

### Equipe

- Camile Felix
- Fabiana Souza
- Erick Ferreira
- Anna Beatriz
- Emanoel Alexandri

### Repositório

https://github.com/DevNinee/ToDoListQuarta

---

## English (EN)

Java task management system with a command-line interface (CLI), created to organize daily activities and practice Object-Oriented Programming concepts.

### Objective

This project addresses the need for simple task control (create, track, complete, edit, and delete tasks) and serves as a practical Java learning base.

### Problem it solves

- Lack of day-to-day task organization
- Difficulty tracking task status
- Need for an academic project with real OOP application

### Features

- Create task
- List tasks
- Edit task
- Delete task
- Mark task as completed
- Search task by ID

### Key differentiators

- Well-structured layered architecture (`aplicacao`, `model`, `service`)
- Full CRUD flow
- Simple and maintainable codebase
- Ready-to-use build and run scripts

### Technologies

- Java 8+
- OOP
- LocalDateTime
- Shell Script (`build.sh`, `run.sh`)
- Git and GitHub

### Project structure

```text
ToDoListQuarta/
├── bin/
├── src/
│   └── ucb/
│       ├── aplicacao/
│       ├── model/
│       └── service/
├── build.sh
├── run.sh
└── README.md
```

### How to run

```bash
git clone https://github.com/DevNinee/ToDoListQuarta.git
cd ToDoListQuarta
./build.sh
./run.sh
```

Manual execution:

```bash
javac -d bin src/ucb/**/*.java
java -cp bin ucb.aplicacao.AppToDoList
```

### Usage example

```text
1. Create Task
2. List Tasks
3. Mark as Complete
4. Edit Task
5. Delete Task
6. Search Task by ID
7. Exit
```

### API (future evolution)

The project is ready to evolve into a REST API with endpoints such as:

- GET /tasks
- GET /tasks/{id}
- POST /tasks
- PUT /tasks/{id}
- PATCH /tasks/{id}/complete
- DELETE /tasks/{id}

### Future improvements

- Database persistence
- Automated tests (JUnit)
- Better input validation and exception handling
- Task priorities/categories
- Web or mobile interface
- User authentication

### Possible derived projects

- ToDoList Web
- Mobile task manager app
- Collaborative Kanban board
- Academic planner
- Personal goals tracker

### Team

- Camile Felix
- Fabiana Souza
- Erick Ferreira
- Anna Beatriz
- Emanoel Alexandri

### Repository

https://github.com/DevNinee/ToDoListQuarta
