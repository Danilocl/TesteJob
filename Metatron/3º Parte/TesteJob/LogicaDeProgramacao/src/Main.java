import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Jabuti jabuti = new Jabuti();

		Control control = new Control();

		System.out.println("Digite uma frase");

		String frase = in.nextLine();

		jabuti.setFrase(frase);

		System.out.println("Digite a quantidade de colunas");

		int coluns = in.nextInt();

		jabuti.setColunas(coluns);

		control.setJabuti(jabuti);

		control.frase();

	}
}
