package pkg;

public class Pessoa {

    public String nome;
    public String email;
    public String dataNascimento;
    public String endereco;
    public boolean admin;

    public Pessoa() {
        System.out.println("Pessoa criada.");
    }

    public void atribuirValores(String n, String e, String data, String end, boolean a) {
        nome = n;
        email = e;
        dataNascimento = data;
        endereco = end;
        admin = a;
    }

    public String retornaEmail() {
        return email;
    }

    public void promoverAdmin() {
        admin = true;
        System.out.println(nome + " agora é administrador!");
    }

    public String retornaInformacoes() {
        String status = admin ? "Administrador" : "Usuário comum";
        return "Nome: " + nome + "\nEmail: " + email + "\nData de Nascimento: " + dataNascimento +
               "\nEndereço: " + endereco + "\nStatus: " + status;
    }
}