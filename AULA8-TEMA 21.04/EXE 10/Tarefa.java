package pkg;

public class Tarefa {

    private String descricao;
    private boolean concluida = false;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void concluirTarefa() {
        concluida = true;
    }

    public void exibirTarefa() {
        System.out.println("Tarefa: " + descricao);
        if (concluida) {
            System.out.println("Status: Concluída");
        } else {
            System.out.println("Status: Pendente");
        }
    }
}