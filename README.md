ToDoList - Sistema de Gerenciamento de Tarefas - em Desenvolvimento


Equipe de Desenvolvimento
* Erick Ferreira - Criar Tarefa
* Emanoel Alexandri - Implementará outras funcionalidades
* Fabiana Souza - Implementará outras funcionalidades
* Camile Felix - Implementará outras funcionalidades
* Anna Beatriz - Implementará outras funcionalidades

Arquitetura
O projeto segue uma arquitetura em camadas bem definida:

```src/
└── ucb/
    ├── aplicacao/     # Camada de apresentação 
    ├── model/         # Camada de modelo (entidades)
    └── service/       # Camada de serviço 
```
Estrutura do Projeto
ucb.aplicacao.AppToDoList
* Responsabilidade: Interface principal do usuário
* Funcionalidades: Menu para criar tarefas e listar
ucb.model.Tarefa
* Responsabilidade: Representa uma tarefa no sistema
* Atributos: ID, título, descrição, status de conclusão, data de criação
ucb.service.TarefaServico
* Responsabilidade: Lógica de negócio para gerenciamento de tarefas
* Funcionalidades: Criar tarefas, listar tarefas, contador de IDs

Funcionalidades Implementadas
* Criar Tarefa: Adicionar nova tarefa com título e descrição (Erick)
* Listar Tarefas: Visualizar tarefas criadas (Erick)

Funcionalidades a Serem Implementadas (Outros Membros)
* Marcar como Completa: Alterar status de uma tarefa
* Excluir Tarefa: Remover tarefa do sistema
* Estatísticas: Contadores de tarefas totais e completas
* Buscar Tarefa: Localizar tarefa específica
* Editar Tarefa: Modificar informações existentes

 Tecnologias Utilizadas
* Java: Linguagem principal
* Java 8+: Recursos como Streams
* LocalDateTime: Para timestamps das tarefas

Como Executar
```
1. Compilar o projeto:javac -d bin src/ucb/**/*.java
2. 
3. Executar a aplicação:java -cp bin ucb.aplicacao.AppToDoList
4. 
```
Exemplo de Uso
```
===== GERENCIADOR DE TAREFAS =====
1. Criar Tarefa
2. Listar Tarefas
3. Sair
Escolha uma opção: 1

Título: Estudar Java
Descrição: Revisar conceitos de POO
Tarefa criada com sucesso: Estudar Java
```

Melhorias Futuras
* Marcar como completa (Fabiana)
* Excluir tarefa (Camile)
* Editar tarefa (Anna)
* Sistema de prioridades (Emanoel)
* Categorização (Erick)
* Persistência em banco (Equipe)
