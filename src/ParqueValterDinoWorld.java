import java.util.Scanner;

public class ParqueValterDinoWorld {

	public static void main(String[] args) {
		int quantFeijao = 1238;
		int palpite;
		palpite = 0;
		Scanner leitor = new Scanner(System.in);

		while(palpite != quantFeijao) {
			System.out.println("Tente acertar a quantidade de feij�es no jarro:");
			palpite = leitor.nextInt();
			if (palpite != quantFeijao)
				System.out.println("Que pena, n�o foi dessa vez...");
		}
		leitor.close();
		System.out.println("Parab�ns..., voc� acertou!!!");
	}

}
