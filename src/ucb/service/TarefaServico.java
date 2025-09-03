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

    // Excluir tarefa
    public boolean excluirTarefa(Long id) {
        return tarefas.removeIf(t -> t.getId().equals(id));
    }

    // Buscar tarefa por ID
    public Optional<Tarefa> buscarPorId(Long id) {
        return tarefas.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst();
    }

    // Contar total de tarefas
    public int totalTarefas() {
        return tarefas.size();
    }

    // Contar tarefas completas
    public int tarefasCompletas() {
        return (int) tarefas.stream().filter(Tarefa::isCompleta).count();
    }
}
