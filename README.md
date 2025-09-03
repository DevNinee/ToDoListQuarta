# 📋 ToDoList - Sistema de Gerenciamento de Tarefas - em Desenvolvimento

## 🚀 Descrição
Sistema de gerenciamento de tarefas desenvolvido em Java, com interface de console interativa. **Este módulo implementa apenas a funcionalidade de CRIAR TAREFAS**.

## 👥 **Equipe de Desenvolvimento**
- **Erick Ferreira** -  **CRIAR TAREFA** (Este módulo)
- **Fabiana Souza** -  Implementará outras funcionalidades
- **Camilly Felix** -  Implementará outras funcionalidades  
- **Anna Beatriz** -  Implementará outras funcionalidades
- **Emanoel Alexandri** -  Implementará outras funcionalidades

## 🏗️ Arquitetura
O projeto segue uma arquitetura em camadas bem definida:

```
src/
└── ucb/
    ├── aplicacao/     # Camada de apresentação 
    ├── model/         # Camada de modelo (entidades)
    └── service/       # Camada de serviço 
```

## 📁 Estrutura do Projeto

### `ucb.aplicacao.AppToDoList`
- **Responsabilidade**: Interface principal do usuário
- **Funcionalidades**: Menu para criar tarefas e listar (para teste)

### `ucb.model.Tarefa`
- **Responsabilidade**: Representa uma tarefa no sistema
- **Atributos**: ID, título, descrição, status de conclusão, data de criação

### `ucb.service.TarefaServico`
- **Responsabilidade**: Lógica de negócio para gerenciamento de tarefas
- **Funcionalidades**: Criar tarefas, listar tarefas, contador

## ✨ **Funcionalidades Implementadas (Erick)**

-  **Criar Tarefa**: Adicionar nova tarefa com título e descrição
-  **Listar Tarefas**: Visualizar tarefas criadas (para verificação)

## 🔄 **Funcionalidades a Serem Implementadas (Outros Membros)**

- **Marcar como Completa**: Alterar status de uma tarefa
-  **Excluir Tarefa**: Remover tarefa do sistema
-  **Estatísticas**: Contadores de tarefas totais e completas
- **Buscar Tarefa**: Localizar tarefa específica
-  **Editar Tarefa**: Modificar informações existentes

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal
- **Java 8+**: Recursos como Streams
- **LocalDateTime**: Para timestamps das tarefas

## 🚀 Como Executar

1. **Compilar o projeto**:
   ```bash
   javac -d bin src/ucb/**/*.java
   ```

2. **Executar a aplicação**:
   ```bash
   java -cp bin ucb.aplicacao.AppToDoList
   ```

## 📋 Exemplo de Uso

```
===== GERENCIADOR DE TAREFAS =====
1. Criar Tarefa
2. Listar Tarefas (para verificar se está funcionando)
3. Sair
Escolha uma opção: 1

Título: Estudar Java
Descrição: Revisar conceitos de POO
 Tarefa criada com sucesso: Estudar Java
```

## 🔧 Melhorias Futuras

- [ ] **Marcar como completa** (Fabiana/Camilly/Anna/Emanoel)
- [ ] **Excluir tarefa** (Fabiana/Camilly/Anna/Emanoel)
- [ ] **Editar tarefa** (Fabiana/Camilly/Anna/Emanoel)
- [ ] **Sistema de prioridades** (Fabiana/Camilly/Anna/Emanoel)
- [ ] **Categorização** (Fabiana/Camilly/Anna/Emanoel)
- [ ] **Persistência em banco** (Fabiana/Camilly/Anna/Emanoel)

## 👨‍💻 **Responsabilidades por Módulo**

| Funcionalidade | Responsável | Status |
|----------------|-------------|---------|
| **Criar Tarefa** | Erick Ferreira |  **Concluído** |
| **Listar Tarefas** | Erick Ferreira |  **Concluído** |
| **Marcar Completa** | A definir | ⏳ **Pendente** |
| **Excluir Tarefa** | A definir | ⏳ **Pendente** |
| **Editar Tarefa** | A definir | ⏳ **Pendente** |

---
*Última atualização: setembro de 2025 - Módulo de Criar Tarefa implementado por Erick Ferreira*
