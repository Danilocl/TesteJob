import org.junit.Test;

public class Control {

	private Jabuti jabuti;

	private String fraseFinal = "";

	public Jabuti getJabuti() {
		return jabuti;
	}

	public void setJabuti(Jabuti jabuti) {
		this.jabuti = jabuti;
	}

	private int espaco = 0;
	
	
	public void frase() {
		System.out.println(jabuti.getFrase());
		String[] frase = jabuti.getFrase().split(" ");

		espaco = jabuti.getColunas();

		for (int i = 0; i < frase.length; i++) {
			fraseFinal += separaColunas(frase[i]);
		}

		System.out.println(this.fraseFinal);

	}

	public String separaColunas(String palavra) {
		String palavraSeparada = "";
		// Se o numero de colunas de um split for menor que as colunas, a
		// próxima palavra continua na mesma linha
		if (palavra.length() < this.espaco) {
			this.espaco -= palavra.length();
			palavraSeparada = palavra + " ";
			//senão ele pula uma linha
		} else {
			this.espaco = jabuti.getColunas() - palavra.length();
			palavraSeparada = "\n" + palavra + " ";
		}
		return palavraSeparada;
	}

}
