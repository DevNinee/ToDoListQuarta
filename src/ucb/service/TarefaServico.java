package ucb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import ucb.model.Tarefa;

public class TarefaServico {
    private List<Tarefa> tarefas = new ArrayList<>();
    private Long contadorId = 1L;

    // Criar uma nova tarefa
    public Tarefa criarTarefa(String titulo, String descricao) {
        Tarefa nova = new Tarefa(titulo, descricao);
        nova.setId(contadorId++); // gera um número de ID para a tarefa
        tarefas.add(nova); // adiciona na lista
        return nova;
    }

    // Mostrar todas as tarefas
    public List<Tarefa> listarTarefas() {
        return new ArrayList<>(tarefas); // retorna a lista
    }

    // Editar uma tarefa já criada
    public boolean editarTarefa(Long id, String novoTitulo, String novaDescricao) {
        Optional<Tarefa> tarefa = tarefas.stream()
                .filter(t -> t.getId().equals(id)) // procura pela tarefa com o ID
                .findFirst();
        
        if (tarefa.isPresent()) {
            Tarefa t = tarefa.get();
            t.setTitulo(novoTitulo);
            t.setDescricao(novaDescricao);
            return true; // deu certo
        }
        return false; // não encontrou a tarefa
    }

    // Apagar uma tarefa
    public boolean removerTarefa(Long id) {
        return tarefas.removeIf(t -> t.getId().equals(id));
    }

    // Marcar uma tarefa como concluída
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

    // Procurar tarefa pelo ID
    public Tarefa buscarPorId(Long id) {
        return tarefas.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Contar quantas tarefas existem
    public int totalTarefas() {
        return tarefas.size();
    }
}
