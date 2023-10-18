package Exercicio03;
import java.util.ArrayList;
import java.util.Date;

public class Tarefa {
    private ArrayList<ListaTarefas> tasks;

    public Tarefa() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(ListaTarefas task) {
        this.tasks.add(task);
    }

    public void removeTask(ListaTarefas task) {
        this.tasks.remove(task);
    }

    public ArrayList<ListaTarefas> getTasks() {
        return this.tasks;
    }

    public void displayTasks() {
        for (ListaTarefas task : this.tasks) {
            System.out.println(task.toString());
        }
    }

}

