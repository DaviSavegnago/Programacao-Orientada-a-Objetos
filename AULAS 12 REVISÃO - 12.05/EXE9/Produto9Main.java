package ppkg;
import java.util.ArrayList;
import java.util.List;

public class Produto9Main {

	public static void main(String[] args) {
		
		ArrayList<Produto9> produtos = new ArrayList<Produto9>();
		
		produtos.add(new Produto9("Mamão", 3, 10));
		produtos.add(new Produto9("Goiaba", 2.5, 8));
		produtos.add(new Produto9("Milho", 3.2, 12));
		produtos.add(new Produto9("Ervilha", 4, 10));
		produtos.add(new Produto9("Aveia", 5, 12));
		
		for (Produto9 p : produtos) {
            System.out.println(p);
        }
	
	}

}
