# 📋 Guia de Implementação - ToDoList

## 🎯 Visão Geral
Este documento contém o passo a passo detalhado para cada membro da equipe implementar suas funcionalidades no sistema ToDoList.

---

## 👩‍💻 **FABIANA SOUZA** - Marcar como Completa

### 📝 Objetivo
Implementar funcionalidade para marcar tarefas como completas.

### 🔧 Passo a Passo

#### 1. **Atualizar TarefaServico.java**
```java
// Adicionar método no TarefaServico
public boolean marcarComoCompleta(Long id) {
    Optional<Tarefa> tarefa = tarefas.stream()
            .filter(t -> t.getId().equals(id))
            .findFirst();
    
    if (tarefa.isPresent()) {
        tarefa.get().setCompleta(true);
        return true;
    }
    return false;
}
```

#### 2. **Atualizar AppToDoList.java**
```java
// Adicionar no menu principal
System.out.println("4. Marcar como Completa");

// Adicionar no switch
case 4 -> {
    System.out.print("Digite o ID da tarefa para marcar como completa: ");
    Long idCompleta = entrada.nextLong();
    
    if (servico.marcarComoCompleta(idCompleta)) {
        System.out.println("Tarefa marcada como completa!");
    } else {
        System.out.println("Tarefa não encontrada!");
    }
}
```

#### 3. **Atualizar Listagem**
```java
// Modificar a exibição na listagem para mostrar status
System.out.println(
    "ID: " + t.getId() +
    " | Título: " + t.getTitulo() +
    " | Status: " + (t.isCompleta() ? "Completa" : "Pendente") +
    " | Data: " + t.getDataAgora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))
);
```

---

## 👩‍💻 **CAMILE FELIX** - Excluir Tarefa

### 📝 Objetivo
Implementar funcionalidade para excluir tarefas do sistema.

### 🔧 Passo a Passo

#### 1. **Atualizar TarefaServico.java**
```java
// Adicionar método no TarefaServico
public boolean excluirTarefa(Long id) {
    return tarefas.removeIf(t -> t.getId().equals(id));
}
```

#### 2. **Atualizar AppToDoList.java**
```java
// Adicionar no menu principal
System.out.println("5. Excluir Tarefa");

// Adicionar no switch
case 5 -> {
    System.out.print("Digite o ID da tarefa para excluir: ");
    Long idExcluir = entrada.nextLong();
    
    if (servico.excluirTarefa(idExcluir)) {
        System.out.println("Tarefa excluída com sucesso!");
    } else {
        System.out.println("Tarefa não encontrada!");
    }
}
```

#### 3. **Adicionar Confirmação (Opcional)**
```java
// Adicionar confirmação antes de excluir
System.out.print("Tem certeza que deseja excluir? (s/n): ");
String confirmacao = entrada.nextLine();
if (confirmacao.equalsIgnoreCase("s")) {
    // código de exclusão
}
```

---

## 👩‍💻 **ANNA BEATRIZ** - Editar Tarefa

### 📝 Objetivo
Implementar funcionalidade para editar informações de tarefas existentes.

### 🔧 Passo a Passo

#### 1. **Atualizar TarefaServico.java**
```java
// Adicionar método no TarefaServico
public boolean editarTarefa(Long id, String novoTitulo, String novaDescricao) {
    Optional<Tarefa> tarefa = tarefas.stream()
            .filter(t -> t.getId().equals(id))
            .findFirst();
    
    if (tarefa.isPresent()) {
        Tarefa t = tarefa.get();
        t.setTitulo(novoTitulo);
        t.setDescricao(novaDescricao);
        return true;
    }
    return false;
}
```

#### 2. **Atualizar AppToDoList.java**
```java
// Adicionar no menu principal
System.out.println("6. Editar Tarefa");

// Adicionar no switch
case 6 -> {
    System.out.print("Digite o ID da tarefa para editar: ");
    Long idEditar = entrada.nextLong();
    entrada.nextLine(); // consumir quebra de linha
    
    System.out.print("Novo título: ");
    String novoTitulo = entrada.nextLine();
    System.out.print("Nova descrição: ");
    String novaDescricao = entrada.nextLine();
    
    if (servico.editarTarefa(idEditar, novoTitulo, novaDescricao)) {
        System.out.println("Tarefa editada com sucesso!");
    } else {
        System.out.println("Tarefa não encontrada!");
    }
}
```

#### 3. **Melhorar UX (Opcional)**
```java
// Mostrar dados atuais antes de editar
Optional<Tarefa> tarefaAtual = servico.buscarPorId(idEditar);
if (tarefaAtual.isPresent()) {
    Tarefa t = tarefaAtual.get();
    System.out.println("Título atual: " + t.getTitulo());
    System.out.println("Descrição atual: " + t.getDescricao());
}
```

---

## 👨‍💻 **EMANOEL ALEXANDRI** - Sistema de Prioridades

### 📝 Objetivo
Implementar sistema de prioridades para as tarefas (Alta, Média, Baixa).

### 🔧 Passo a Passo

#### 1. **Atualizar Tarefa.java**
```java
// Adicionar enum para prioridades
public enum Prioridade {
    ALTA, MEDIA, BAIXA
}

// Adicionar atributo na classe Tarefa
private Prioridade prioridade = Prioridade.MEDIA;

// Adicionar getter e setter
public Prioridade getPrioridade() { return prioridade; }
public void setPrioridade(Prioridade prioridade) { this.prioridade = prioridade; }
```

#### 2. **Atualizar TarefaServico.java**
```java
// Modificar método criarTarefa
public Tarefa criarTarefa(String titulo, String descricao, Prioridade prioridade) {
    Tarefa nova = new Tarefa(titulo, descricao);
    nova.setId(contadorId++);
    nova.setPrioridade(prioridade);
    tarefas.add(nova);
    return nova;
}

// Adicionar método para alterar prioridade
public boolean alterarPrioridade(Long id, Prioridade novaPrioridade) {
    Optional<Tarefa> tarefa = tarefas.stream()
            .filter(t -> t.getId().equals(id))
            .findFirst();
    
    if (tarefa.isPresent()) {
        tarefa.get().setPrioridade(novaPrioridade);
        return true;
    }
    return false;
}
```

#### 3. **Atualizar AppToDoList.java**
```java
// Modificar criação de tarefa
case 1 -> {
    System.out.print("Título: ");
    String titulo = entrada.nextLine();
    System.out.print("Descrição: ");
    String descricao = entrada.nextLine();
    System.out.print("Prioridade (1-Alta, 2-Média, 3-Baixa): ");
    int prioridadeOpcao = entrada.nextInt();
    entrada.nextLine();
    
    Prioridade prioridade = switch(prioridadeOpcao) {
        case 1 -> Prioridade.ALTA;
        case 2 -> Prioridade.MEDIA;
        case 3 -> Prioridade.BAIXA;
        default -> Prioridade.MEDIA;
    };
    
    Tarefa nova = servico.criarTarefa(titulo, descricao, prioridade);
    System.out.println("Tarefa criada com sucesso: " + nova.getTitulo());
}

// Atualizar listagem para mostrar prioridade
System.out.println(
    "ID: " + t.getId() +
    " | Título: " + t.getTitulo() +
    " | Prioridade: " + t.getPrioridade() +
    " | Data: " + t.getDataAgora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))
);
```

---

## 👨‍💻 **ERICK FERREIRA** - Categorização

### 📝 Objetivo
Implementar sistema de categorias para organizar as tarefas.

### 🔧 Passo a Passo

#### 1. **Atualizar Tarefa.java**
```java
// Adicionar atributo categoria
private String categoria = "Geral";

// Adicionar getter e setter
public String getCategoria() { return categoria; }
public void setCategoria(String categoria) { this.categoria = categoria; }
```

#### 2. **Atualizar TarefaServico.java**
```java
// Modificar método criarTarefa
public Tarefa criarTarefa(String titulo, String descricao, String categoria) {
    Tarefa nova = new Tarefa(titulo, descricao);
    nova.setId(contadorId++);
    nova.setCategoria(categoria);
    tarefas.add(nova);
    return nova;
}

// Adicionar método para listar por categoria
public List<Tarefa> listarPorCategoria(String categoria) {
    return tarefas.stream()
            .filter(t -> t.getCategoria().equalsIgnoreCase(categoria))
            .collect(Collectors.toList());
}

// Adicionar método para listar categorias
public List<String> listarCategorias() {
    return tarefas.stream()
            .map(Tarefa::getCategoria)
            .distinct()
            .collect(Collectors.toList());
}
```

#### 3. **Atualizar AppToDoList.java**
```java
// Adicionar no menu
System.out.println("7. Listar por Categoria");

// Modificar criação de tarefa
case 1 -> {
    System.out.print("Título: ");
    String titulo = entrada.nextLine();
    System.out.print("Descrição: ");
    String descricao = entrada.nextLine();
    System.out.print("Categoria: ");
    String categoria = entrada.nextLine();
    
    Tarefa nova = servico.criarTarefa(titulo, descricao, categoria);
    System.out.println("Tarefa criada com sucesso: " + nova.getTitulo());
}

// Adicionar listagem por categoria
case 7 -> {
    System.out.print("Digite a categoria: ");
    String categoria = entrada.nextLine();
    List<Tarefa> tarefasCategoria = servico.listarPorCategoria(categoria);
    
    if (tarefasCategoria.isEmpty()) {
        System.out.println("Nenhuma tarefa encontrada nesta categoria.");
    } else {
        System.out.println("\nTarefas da categoria '" + categoria + "':");
        for (Tarefa t : tarefasCategoria) {
            System.out.println("ID: " + t.getId() + " | Título: " + t.getTitulo());
        }
    }
}
```

---

## 👥 **EQUIPE** - Persistência em Banco

### 📝 Objetivo
Implementar persistência das tarefas em banco de dados.

### 🔧 Passo a Passo

#### 1. **Adicionar Dependências**
```xml
<!-- Adicionar no pom.xml ou build.gradle -->
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>2.1.214</version>
</dependency>
```

#### 2. **Criar TarefaRepository.java**
```java
public interface TarefaRepository {
    void salvar(Tarefa tarefa);
    Optional<Tarefa> buscarPorId(Long id);
    List<Tarefa> buscarTodas();
    void atualizar(Tarefa tarefa);
    void deletar(Long id);
    List<Tarefa> buscarPorCategoria(String categoria);
}
```

#### 3. **Implementar TarefaRepositoryImpl.java**
```java
public class TarefaRepositoryImpl implements TarefaRepository {
    private Connection connection;
    
    public TarefaRepositoryImpl() {
        // Configurar conexão com H2
        try {
            connection = DriverManager.getConnection("jdbc:h2:mem:todolist", "sa", "");
            criarTabela();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS tarefas (" +
                    "id BIGINT PRIMARY KEY, " +
                    "titulo VARCHAR(255), " +
                    "descricao TEXT, " +
                    "completa BOOLEAN, " +
                    "data_criacao TIMESTAMP, " +
                    "categoria VARCHAR(100), " +
                    "prioridade VARCHAR(20)" +
                    ")";
        // Executar SQL
    }
    
    // Implementar métodos da interface
}
```

#### 4. **Atualizar TarefaServico.java**
```java
public class TarefaServico {
    private TarefaRepository repository;
    
    public TarefaServico() {
        this.repository = new TarefaRepositoryImpl();
    }
    
    public Tarefa criarTarefa(String titulo, String descricao) {
        Tarefa nova = new Tarefa(titulo, descricao);
        nova.setId(gerarProximoId());
        repository.salvar(nova);
        return nova;
    }
    
    public List<Tarefa> listarTarefas() {
        return repository.buscarTodas();
    }
    
    // Atualizar outros métodos para usar repository
}
```

---

## 🚀 **Ordem de Implementação Recomendada**

1. **Fabiana** - Marcar como Completa (mais simples)
2. **Camile** - Excluir Tarefa (simples)
3. **Anna** - Editar Tarefa (médio)
4. **Emanoel** - Sistema de Prioridades (médio)
5. **Erick** - Categorização (médio)
6. **Equipe** - Persistência em Banco (complexo)

---

## 📋 **Checklist para Cada Implementação**

- [ ] Código compila sem erros
- [ ] Funcionalidade testada manualmente
- [ ] Mensagens de erro/sucesso implementadas
- [ ] Validações básicas adicionadas
- [ ] Código documentado com comentários
- [ ] Teste com diferentes cenários
- [ ] Commit realizado com mensagem descritiva

---

## 🔧 **Comandos Úteis**

```bash
# Compilar projeto
javac -d bin src/ucb/**/*.java

# Executar aplicação
java -cp bin ucb.aplicacao.AppToDoList

# Fazer commit
git add .
git commit -m "feat: implementar [funcionalidade]"
git push origin main
```

---

**Boa sorte para toda a equipe! 🚀**
