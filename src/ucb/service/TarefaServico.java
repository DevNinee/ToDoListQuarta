package ucb.service;

import java.util.ArrayList;
import java.util.List;
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

    // Método para verificar se a funcionalidade está funcionando
    public int totalTarefas() {
        return tarefas.size();
    }
}
