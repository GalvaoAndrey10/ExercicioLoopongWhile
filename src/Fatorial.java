import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		
		int numero, fat;
		fat = 0;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número para que possamos exibir os seus elementos na sequencia como fatorial: ");
		numero = leitor.nextInt();
		leitor.close();
		System.out.println("A sequência fatorial é: ");
		
		
		while (numero >= 1) {
			System.out.println(fat+1 + "! / "+ numero +"!");
			fat++;
			numero--;
			
			
		}
		
		
	}

}
