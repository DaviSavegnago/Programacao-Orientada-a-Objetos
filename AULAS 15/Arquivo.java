import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;

public class Arquivo {
	
	private List<Aluno> listAlunos;
	public String nomeArquivo;
	
	public Arquivo (String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		listAlunos = new ArrayList<>();
	}
	
	public void gravaArquivo(Aluno a) {
		try {
			FileWriter arqw = new FileWriter (nomeArquivo + " .txt", true);
			BufferedWriter escritor = new BufferedWriter(arqw);
			escritor.write(a.getNome() + "," + a.getIdade());
			escritor.newLine();
			escritor.close();
			arqw.close();
			
			System.out.println("Alunos salvos no arquivo alunos.txt");	
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Aluno> leArquivo(){
		System.out.println("Alunos lidos do arquivo: ");
		try {
			FileReader arqr = new FileReader(nomeArquivo+ ".txt");
			BufferedReader leitor = new BufferedReader(arqr);
			String linha;
			while ((linha = leitor.readLine()) != null) {
				String[] campos = linha.split(",");
				
				String nome = campos[0];
				int idade = Integer.parseInt(campos[1]);
				Aluno aluno = new Aluno(nome, idade);
				listAlunos.add(aluno);
			}
			
			leitor.close();
			arqr.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		return listAlunos;
	}
	
}
