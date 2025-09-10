package ucb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import ucb.model.Tarefa;

public class TarefaServico {
    private List<Tarefa> tarefas = new ArrayList<>();
    private Long contadorId = 1L;

    // Criar tarefa
    public Tarefa criarTarefa(String titulo, String descricao) {
        Tarefa nova = new Tarefa(titulo, descricao);
        nova.setId(contadorId++); // gera ID incremental
        tarefas.add(nova);
        return nova;
    }

    // Listar tarefas
    public List<Tarefa> listarTarefas() {
        return new ArrayList<>(tarefas); // retorna uma cópia para evitar modificações externas
    }

    // Atualizar tarefa (CRUD - Update)
    public boolean atualizarTarefa(Long id, String novoTitulo, String novaDescricao) {
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

    // Remover tarefa (CRUD - Delete)
    public boolean removerTarefa(Long id) {
        return tarefas.removeIf(t -> t.getId().equals(id));
    }

    // Marcar tarefa como completa
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

    // Método para verificar se a funcionalidade está funcionando
    public int totalTarefas() {
        return tarefas.size();
    }
}
