#  ToDoList - Sistema de Gerenciamento de Tarefas

##  Descrição
Sistema de gerenciamento de tarefas desenvolvido em Java, com interface de console interativa. O projeto implementa funcionalidades básicas de CRUD para gerenciamento de tarefas pessoais.

## 👥 **Equipe de Desenvolvimento**

| Membro | Funcionalidade | Status |
|--------|----------------|--------|
| **Erick Ferreira** | Criar Tarefa |  **Implementado** |
| **Fabiana Souza** | Marcar como Completa |  **Implementado** |
| **Camile Felix** | Excluir Tarefa |  **Pendente** |
| **Anna Beatriz** | Editar Tarefa |  **Pendente** |
| **Emanoel Alexandri** | Sistema de Prioridades |  **Pendente** |
| **Equipe** | Categorização |  **Pendente** |
| **Equipe** | Persistência em Banco |  **Pendente** |

##  **Arquitetura**

O projeto segue uma arquitetura em camadas bem definida:

```
src/
└── ucb/
    ├── aplicacao/     # Camada de apresentação 
    ├── model/         # Camada de modelo (entidades)
    └── service/       # Camada de serviço 
```

##  **Estrutura do Projeto**

### `ucb.aplicacao.AppToDoList`
- **Responsabilidade**: Interface principal do usuário
- **Funcionalidades**: Menu interativo com todas as operações

### `ucb.model.Tarefa`
- **Responsabilidade**: Representa uma tarefa no sistema
- **Atributos**: ID, título, descrição, status de conclusão, data de criação

### `ucb.service.TarefaServico`
- **Responsabilidade**: Lógica de negócio para gerenciamento de tarefas
- **Funcionalidades**: CRUD completo, validações, gerenciamento de estado

##  **Funcionalidades Implementadas**

###  **Criar Tarefa** (Erick Ferreira)
- Adicionar nova tarefa com título e descrição
- Geração automática de ID incremental
- Timestamp de criação automático

###  **Listar Tarefas** (Erick Ferreira)
- Visualizar todas as tarefas cadastradas
- Exibição formatada com ID, título, status e data
- Mensagem quando não há tarefas

###  **Marcar como Completa** (Fabiana Souza)
- Alterar status de tarefa de "Pendente" para "Completa"
- Validação de existência da tarefa
- Atualização em tempo real da listagem

##  **Funcionalidades Pendentes**

###  **Excluir Tarefa** (Camile Felix)
- Remover tarefa do sistema permanentemente
- Validação de existência antes da exclusão
- Confirmação de exclusão

###  **Editar Tarefa** (Anna Beatriz)
- Modificar título e descrição de tarefas existentes
- Validação de dados de entrada
- Preservação de ID e data de criação

###  **Sistema de Prioridades** (Emanoel Alexandri)
- Implementar níveis de prioridade (Alta, Média, Baixa)
- Filtros por prioridade
- Ordenação por prioridade

###  **Categorização** (Equipe)
- Organizar tarefas por categorias
- Filtros por categoria
- Gerenciamento de categorias

### ⏳ **Persistência em Banco** (Equipe)
- Salvar dados em banco de dados
- Migração de dados em memória
- Backup e recuperação

## 🛠️ **Tecnologias Utilizadas**

- **Java**: Linguagem principal
- **Java 8+**: Recursos como Streams e Optional
- **LocalDateTime**: Para timestamps das tarefas
- **Git**: Controle de versão
- **GitHub**: Repositório remoto

##  **Como Executar**

### **1. Compilar o Projeto**
```bash
javac -d bin src/ucb/**/*.java
```

### **2. Executar a Aplicação**
```bash
java -cp bin ucb.aplicacao.AppToDoList
```

### **3. Usar Scripts (Opcional)**
```bash
# Compilar
./build.sh

# Executar
./run.sh
```

##  **Exemplo de Uso Completo**

```
===== GERENCIADOR DE TAREFAS =====
1. Criar Tarefa
2. Listar Tarefas
3. Marcar como Completa
4. Sair
Escolha uma opção: 1

Título: Estudar Java
Descrição: Revisar conceitos de POO
Tarefa criada com sucesso: Estudar Java

===== GERENCIADOR DE TAREFAS =====
1. Criar Tarefa
2. Listar Tarefas
3. Marcar como Completa
4. Sair
Escolha uma opção: 2

Lista de Tarefas:
ID: 1 | Título: Estudar Java | Status: Pendente | Data: 15/06/2025 14:30

===== GERENCIADOR DE TAREFAS =====
1. Criar Tarefa
2. Listar Tarefas
3. Marcar como Completa
4. Sair
Escolha uma opção: 3

Digite o ID da tarefa para marcar como completa: 1
Tarefa marcada como completa!

===== GERENCIADOR DE TAREFAS =====
1. Criar Tarefa
2. Listar Tarefas
3. Marcar como Completa
4. Sair
Escolha uma opção: 2

Lista de Tarefas:
ID: 1 | Título: Estudar Java | Status: Completa | Data: 15/06/2025 14:30
```

##  **Como Testar o Projeto**

### **Teste 1: Criar Tarefa**
1. Execute o programa
2. Escolha opção `1`
3. Digite título e descrição
4. Verifique mensagem de sucesso

### **Teste 2: Listar Tarefas**
1. Escolha opção `2`
2. Verifique se a tarefa aparece com status "Pendente"
3. Verifique formato da exibição

### **Teste 3: Marcar como Completa**
1. Escolha opção `3`
2. Digite o ID da tarefa
3. Verifique mensagem de sucesso
4. Liste novamente para ver status "Completa"

### **Teste 4: Validações**
1. Tente marcar tarefa inexistente
2. Verifique mensagem de erro
3. Teste com IDs inválidos

## 📊 **Status do Projeto**

- **Funcionalidades Implementadas**: 3/8
- **Código Funcionando**: 
- **Testes Realizados**: 
- **Documentação**: 
- **Repositório Atualizado**: 

##  **Links Úteis**

- **Repositório**: [https://github.com/DevNinee/ToDoListQuarta.git](https://github.com/DevNinee/ToDoListQuarta.git)
- **Guia de Implementação**: `GUIA_IMPLEMENTACAO.md`
- **Documentação da API**: `API.md`

##  **Próximos Passos**

1. **Camile**: Implementar funcionalidade de excluir tarefa
2. **Anna**: Implementar funcionalidade de editar tarefa
3. **Emanoel**: Implementar sistema de prioridades
4. **Equipe**: Implementar sistema de categorização
5. **Equipe**: Implementar persistência em banco

---

**Última atualização**: Setembro 2025 - Funcionalidade "Marcar como Completa" implementada por Fabiana Souza de Paula