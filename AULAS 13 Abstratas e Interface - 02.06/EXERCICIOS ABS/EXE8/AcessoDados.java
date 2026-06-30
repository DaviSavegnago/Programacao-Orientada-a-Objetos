interface AcessoDados {

    void conectar();

    void desconectar();

    void inserir();

    void atualizar();

    void excluir();
}

class BancoDeDados implements AcessoDados {

    @Override
    public void conectar() {
        System.out.println("Conectando ao banco de dados...");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do banco de dados...");
    }

    @Override
    public void inserir() {
        System.out.println("Inserindo dados...");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando dados...");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo dados...");
    }
}

public class Main {

    public static void main(String[] args) {

        BancoDeDados bd = new BancoDeDados();

        bd.conectar();
        bd.inserir();
        bd.atualizar();
        bd.excluir();
        bd.desconectar();
    }
}