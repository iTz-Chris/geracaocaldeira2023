package Exercicio03;
import java.util.Date;

public class Main {

    public static void main(String [] args) {

        Tarefa taskList = new Tarefa();

        taskList.addTask(new ListaTarefas("Terminar exercícios", new Date(), "Terminar exercícios das aulas de programação."));
        taskList.addTask(new ListaTarefas("Arrumar o quarto", new Date(), "Limpar e arrumar as coisas."));
        taskList.addTask(new ListaTarefas("Fazer o jantar", new Date(), "Comprar os ingredientes e preparar o jantar de hoje."));

        // Mostrando a Lista de Tarefas:
        taskList.displayTasks();

        // Removendo uma tarefa da lista:
        taskList.removeTask(taskList.getTasks().get(1));

        // Aualizando a lista de tarefas:
        taskList.displayTasks();



    }

}
