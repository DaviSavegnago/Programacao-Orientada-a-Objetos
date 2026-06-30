package wee;

public class Pessoa {

    public void falar(String mensagem) {

        System.out.println(mensagem);
    }

    public void falar(String mensagem, int repeticoes) {

        for (int i = 1; i <= repeticoes; i++) {

            System.out.println(mensagem);
        }
    }
}