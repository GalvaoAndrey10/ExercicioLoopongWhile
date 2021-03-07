import java.util.Scanner;

public class AlunosMediaNotas {

	public static void main(String[] args) {
		
		int quantAlunos = 3;
		
		int contador, quantNotasBaixas, quantNotasAltas;
		double nota, media;
		
		contador = 0;
		quantNotasBaixas = 0;
		quantNotasAltas = 0;
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Favor informar a média da escola");
		media = leitor.nextDouble();
		
		while (contador < quantAlunos) {
			System.out.println("Favor digitar a nota do " + (contador +1) + "º aluno:");
			nota = leitor.nextDouble();
			contador++;
			if (nota < media)
				quantNotasBaixas++;
			else
				quantNotasAltas++;
		}

		System.out.println("A média da escola é " + media + ", sendo que tivemos " + quantNotasBaixas + " notas abaixo da média e " + quantNotasAltas + " acima ou igual a média.");
	}

}
