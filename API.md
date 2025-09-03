# 📚 Documentação da API - ToDoList

## 🔧 Classe TarefaServico

### Métodos Disponíveis

#### `criarTarefa(String titulo, String descricao)`
- **Descrição**: Cria uma nova tarefa no sistema
- **Parâmetros**: 
  - `titulo`: Título da tarefa (String)
  - `descricao`: Descrição detalhada da tarefa (String)
- **Retorno**: `Tarefa` - Objeto da tarefa criada
- **Exemplo**:
  ```java
  TarefaServico servico = new TarefaServico();
  Tarefa nova = servico.criarTarefa("Estudar Java", "Revisar conceitos de POO");
  ```

#### `listarTarefas()`
- **Descrição**: Retorna todas as tarefas cadastradas
- **Parâmetros**: Nenhum
- **Retorno**: `List<Tarefa>` - Lista de todas as tarefas
- **Exemplo**:
  ```java
  List<Tarefa> todas = servico.listarTarefas();
  ```

#### `marcarComoCompleta(Long id)`
- **Descrição**: Marca uma tarefa como concluída
- **Parâmetros**: `id` - ID da tarefa (Long)
- **Retorno**: `boolean` - true se encontrou e marcou, false caso contrário
- **Exemplo**:
  ```java
  boolean sucesso = servico.marcarComoCompleta(1L);
  ```

#### `excluirTarefa(Long id)`
- **Descrição**: Remove uma tarefa do sistema
- **Parâmetros**: `id` - ID da tarefa (Long)
- **Retorno**: `boolean` - true se encontrou e removeu, false caso contrário
- **Exemplo**:
  ```java
  boolean removida = servico.excluirTarefa(1L);
  ```

#### `buscarPorId(Long id)`
- **Descrição**: Busca uma tarefa específica por ID
- **Parâmetros**: `id` - ID da tarefa (Long)
- **Retorno**: `Optional<Tarefa>` - Tarefa encontrada ou vazio
- **Exemplo**:
  ```java
  Optional<Tarefa> tarefa = servico.buscarPorId(1L);
  if (tarefa.isPresent()) {
      System.out.println("Tarefa: " + tarefa.get().getTitulo());
  }
  ```

#### `totalTarefas()`
- **Descrição**: Retorna o número total de tarefas
- **Parâmetros**: Nenhum
- **Retorno**: `int` - Quantidade total de tarefas
- **Exemplo**:
  ```java
  int total = servico.totalTarefas();
  System.out.println("Total de tarefas: " + total);
  ```

#### `tarefasCompletas()`
- **Descrição**: Retorna o número de tarefas concluídas
- **Parâmetros**: Nenhum
- **Retorno**: `int` - Quantidade de tarefas completas
- **Exemplo**:
  ```java
  int completas = servico.tarefasCompletas();
  System.out.println("Tarefas completas: " + completas);
  ```

## 🏗️ Padrões de Design Utilizados

### 1. **Service Layer Pattern**
- Separação clara entre lógica de negócio e apresentação
- Encapsulamento das operações de dados

### 2. **Repository Pattern (simplificado)**
- Gerenciamento centralizado das entidades
- Controle de IDs e operações CRUD

### 3. **Immutable Collections**
- Retorno de cópias das listas para evitar modificações externas
- Uso de Streams para operações funcionais

## 🔮 Extensões Recomendadas

### Persistência
```java
public interface TarefaRepository {
    void salvar(Tarefa tarefa);
    Optional<Tarefa> buscarPorId(Long id);
    List<Tarefa> buscarTodas();
    void atualizar(Tarefa tarefa);
    void deletar(Long id);
}
```

### Validações
```java
public class TarefaValidator {
    public static boolean validarTitulo(String titulo) {
        return titulo != null && !titulo.trim().isEmpty();
    }
    
    public static boolean validarDescricao(String descricao) {
        return descricao != null && descricao.length() <= 500;
    }
}
```

### Eventos
```java
public interface TarefaEventListener {
    void onTarefaCriada(Tarefa tarefa);
    void onTarefaCompletada(Tarefa tarefa);
    void onTarefaExcluida(Long id);
}
```
