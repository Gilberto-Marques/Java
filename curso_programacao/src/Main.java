import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 27;
		salario = 2450.50;
		altura  = 1.7;
		genero = 'M';
		nome = "Gilberto";
		
		System.out.println("Idade = "+idade);
		System.out.println("Salario = "+ String.format("%.2f",salario) );
		System.out.println("Altura = "+ String.format("%.2f",altura) );
		System.out.println("Genero = "+genero);
		System.out.println("Nome = "+nome);

	}

}
