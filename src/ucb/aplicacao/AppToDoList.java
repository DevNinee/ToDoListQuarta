package ucb.aplicacao;

import java.util.List;
import java.util.Scanner;
import ucb.model.Tarefa;
import ucb.service.TarefaServico;

public class AppToDoList {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        TarefaServico servico = new TarefaServico();

        while (true) {
            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1. Criar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar Tarefa como Completa");
            System.out.println("4. Excluir Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = entrada.nextInt();
            entrada.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1 -> {
                    System.out.print("Título: ");
                    String titulo = entrada.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = entrada.nextLine();

                    Tarefa nova = servico.criarTarefa(titulo, descricao);
                    System.out.println("✅ Tarefa criada com sucesso: " + nova.getTitulo());
                }
                case 2 -> {
                    List<Tarefa> tarefas = servico.listarTarefas();
                    if (tarefas.isEmpty()) {
                        System.out.println("⚠️ Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("\n📋 Lista de Tarefas:");
                        for (Tarefa t : tarefas) {
                            String status = t.isCompleta() ? "✅" : "⏳";
                            System.out.println(
                                status + " ID: " + t.getId() +
                                " | Título: " + t.getTitulo() +
                                " | Descrição: " + t.getDescricao() +
                                " | Data: " + t.getDataAgora().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))
                            );
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Digite o ID da tarefa para marcar como completa: ");
                    Long id = entrada.nextLong();
                    if (servico.marcarComoCompleta(id)) {
                        System.out.println("✅ Tarefa marcada como completa!");
                    } else {
                        System.out.println("❌ Tarefa não encontrada!");
                    }
                }
                case 4 -> {
                    System.out.print("Digite o ID da tarefa para excluir: ");
                    Long idExcluir = entrada.nextLong();
                    if (servico.excluirTarefa(idExcluir)) {
                        System.out.println("🗑️ Tarefa excluída com sucesso!");
                    } else {
                        System.out.println("❌ Tarefa não encontrada!");
                    }
                }
                case 5 -> {
                    System.out.println("👋 Saindo do sistema...");
                    entrada.close();
                    return;
                }
                default -> System.out.println("❌ Opção inválida! Tente novamente.");
            }
        }
    }
}
