#  ToDoList - Sistema de Gerenciamento de Tarefas - em Desenvolvimento 

##  Descrição
Sistema simples de gerenciamento de tarefas desenvolvido em Java, com interface de console interativa.

## Arquitetura
O projeto segue uma arquitetura em camadas bem definida:

```
src/
└── ucb/
    ├── aplicacao/     # Camada de apresentação (interface do usuário)
    ├── model/         # Camada de modelo (entidades)
    └── service/       # Camada de serviço (lógica de negócio)
```

##  Estrutura do Projeto

### `ucb.aplicacao.AppToDoList`
- **Responsabilidade**: Interface principal do usuário
- **Funcionalidades**: Menu interativo, entrada de dados, exibição de resultados

### `ucb.model.Tarefa`
- **Responsabilidade**: Representa uma tarefa no sistema
- **Atributos**: ID, título, descrição, status de conclusão, data de criação

### `ucb.service.TarefaServico`
- **Responsabilidade**: Lógica de negócio para gerenciamento de tarefas
- **Funcionalidades**: CRUD de tarefas, contadores, validações

##  Funcionalidades

-  **Criar Tarefa**: Adicionar nova tarefa com título e descrição
-  **Listar Tarefas**: Visualizar todas as tarefas com status
-  **Marcar como Completa**: Alterar status de uma tarefa
-  **Excluir Tarefa**: Remover tarefa do sistema
-  **Estatísticas**: Contadores de tarefas totais e completas

##  Tecnologias Utilizadas

- **Java**: Linguagem principal
- **Java 8+**: Recursos como Streams e Optional
- **LocalDateTime**: Para timestamps das tarefas

##  Como Executar

1. **Compilar o projeto**:
   ```bash
   javac -d bin src/ucb/**/*.java
   ```

2. **Executar a aplicação**:
   ```bash
   java -cp bin ucb.aplicacao.AppToDoList
   ```

## Exemplo de Uso

```
===== GERENCIADOR DE TAREFAS =====
1. Criar Tarefa
2. Listar Tarefas
3. Marcar Tarefa como Completa
4. Excluir Tarefa
5. Sair
Escolha uma opção: 1

Título: Estudar Java
Descrição: Revisar conceitos de POO
 Tarefa criada com sucesso: Estudar Java
```

##  Melhorias Futuras


##  Desenvolvido por Erick  Ferreira,Fabiana Souza,Camilly Felix,Anna Beatriz,Emanoel Alexandri
Projeto desenvolvido para estudo de arquitetura em camadas e boas práticas de programação Java.

---
