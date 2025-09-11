# ToDoListQuarta - Sistema de Gerenciamento de Tarefas

## Descrição

Sistema de gerenciamento de tarefas desenvolvido em Java, com interface de console interativa. Permite criar, listar, editar, excluir, buscar e marcar tarefas como concluídas, utilizando conceitos de POO e CRUD com armazenamento em memória.

---

## Estrutura do Projeto

```
ToDoListQuarta/
├── bin/                # Arquivos compilados (.class)
├── src/                # Código-fonte Java
│   └── ucb/
│       ├── aplicacao/  # Interface CLI
│       ├── model/      # Entidade Tarefa
│       └── service/    # Lógica de negócio
├── build.sh            # Script de compilação
├── run.sh              # Script de execução
├── README.md           # Documentação
```

---

## Pré-requisitos

- Java 8 ou superior instalado
- Git (opcional, para clonar o repositório)

---

## Como Configurar e Executar

### 1. Clone o repositório (se necessário)

```bash
git clone https://github.com/DevNinee/ToDoListQuarta.git
cd ToDoListQuarta
```

### 2. Compile o projeto

Utilize o script de compilação:

```bash
./build.sh
```

Se preferir, compile manualmente:

```bash
javac -d bin src/ucb/**/*.java
```

### 3. Execute o sistema

Utilize o script de execução:

```bash
./run.sh
```

Ou execute manualmente:

```bash
java -cp bin ucb.aplicacao.AppToDoList
```

---

## Exemplos de Uso

```
===== GERENCIADOR DE TAREFAS =====
1. Criar Tarefa
2. Listar Tarefas
3. Marcar como Completa
4. Editar Tarefa
5. Excluir Tarefa
6. Sair
7. Buscar Tarefa por ID
Escolha uma opção: 1

Título: Estudar Java
Descrição: Revisar conceitos de POO
Tarefa criada com sucesso!

Escolha uma opção: 2
ID: 1 | Título: Estudar Java | Status: Pendente | Data: 10/09/2025 14:30

Escolha uma opção: 3
Digite o ID da tarefa: 1
Tarefa marcada como completa!
```

---

## Testes Sugeridos

- **Criar Tarefa:** Escolha opção 1, preencha os dados e verifique mensagem de sucesso.
- **Listar Tarefas:** Escolha opção 2 e confira a listagem.
- **Editar Tarefa:** Escolha opção 4, informe o ID e novos dados.
- **Excluir Tarefa:** Escolha opção 5, informe o ID e confirme.
- **Marcar como Completa:** Escolha opção 3, informe o ID.
- **Buscar por ID:** Escolha opção 6, informe o ID.
- **Validações:** Tente operações com IDs inexistentes e confira as mensagens de erro.

---

## Scripts

### build.sh

Compila todos os arquivos Java do projeto e cria o diretório `bin` automaticamente.

```bash
#!/bin/bash

echo "🔨 Compilando projeto ToDoList..."

mkdir -p bin
javac -d bin src/ucb/**/*.java

if [ $? -eq 0 ]; then
    echo " Compilação realizada com sucesso!"
    echo ""
    echo " Para executar o projeto, use:"
    echo "   java -cp bin ucb.aplicacao.AppToDoList"
    echo ""
    echo " Ou execute diretamente:"
    echo "   ./run.sh"
else
    echo " Erro na compilação!"
    exit 1
fi
```

### run.sh

Executa a aplicação principal do sistema.

```bash
#!/bin/bash

echo "Iniciando Sistema ToDoList..."

if [ ! -d "bin" ]; then
    echo "Projeto não compilado! Execute primeiro:"
    echo "   ./build.sh"
    exit 1
fi

java -cp bin ucb.aplicacao.AppToDoList
```

---

## Equipe de Desenvolvimento

| Membro               | Funcionalidade                                 | Status         |
|----------------------|------------------------------------------------|---------------|
| **Erick Ferreira**   | Criar, Listar, Excluir Tarefas                 | Implementado  |
| **Fabiana Souza**    | Marcar como Completa                           | Implementado  |
| **Anna Beatriz**     | Editar Tarefa                                  | Implementado  |
| **Camile Felix**     | Editar, Excluir Tarefa (menu/case)             | Implementado  |
| **Emanoel Alexandri**| Buscar Tarefa por ID                           | Implementado  |

---

## Tecnologias Utilizadas

- Java 8+
- LocalDateTime
- Git & GitHub

---

## Repositório

[https://github.com/DevNinee/ToDoListQuarta.git](https://github.com/DevNinee/ToDoListQuarta.git)

---

**Última atualização:**
