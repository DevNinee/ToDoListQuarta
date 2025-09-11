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
            System.out.println("3. Marcar como Completa");
            System.out.println("4. Excluir Tarefa");
            System.out.println("5. Editar Tarefa");
            System.out.println("6. Sair");
            System.out.println("7. Buscar Tarefa por ID");
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
                    System.out.println("Tarefa criada com sucesso: " + nova.getTitulo());
                }
                case 2 -> {
                    List<Tarefa> tarefas = servico.listarTarefas();
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("\nLista de Tarefas:");
                        for (Tarefa t : tarefas) {
                            System.out.println(
                                    "ID: " + t.getId() +
                                            " | Título: " + t.getTitulo() +

                                            " | Status: " + (t.isCompleta() ? "Completa" : "Pendente") +
                                            " | Data: " + t.getDataAgora().format(
                                                    java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Digite o ID da tarefa para marcar como completa: ");
                    Long idCompleta = entrada.nextLong();

                    if (servico.marcarComoCompleta(idCompleta)) {
                        System.out.println("Tarefa marcada como completa!");
                    } else {
                        System.out.println("Tarefa não encontrada!");
                    }
                }
                case 4 -> {
                    System.out.print("Digite o ID da tarefa para excluir: ");
                    Long idExcluir = entrada.nextLong();

                    if (servico.removerTarefa(idExcluir)) {
                        System.out.println("Tarefa excluída com sucesso!");
                    } else {
                        System.out.println("Tarefa não encontrada!");
                    }
                }
                case 5 -> {
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
                case 6 -> {
                    System.out.println("Saindo do sistema...");
                    entrada.close();
                    return;
                }
                case 7 -> {
                    System.out.print("Digite o ID da tarefa para buscar: ");
                    Long idBusca = entrada.nextLong();
                    entrada.nextLine(); // consumir quebra de linha
                    Tarefa tarefa = servico.buscarPorId(idBusca);
                    if (tarefa != null) {
                        System.out.println("\n===== Detalhes da Tarefa =====");
                        System.out.println("ID: " + tarefa.getId());
                        System.out.println("Título: " + tarefa.getTitulo());
                        System.out.println("Descrição: " + tarefa.getDescricao());
                        System.out.println("Status: " + (tarefa.isCompleta() ? "Completa" : "Pendente"));
                        System.out.println("Data: " + tarefa.getDataAgora()
                                .format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
                    } else {
                        System.out.println("Tarefa não encontrada!");
                    }
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}

